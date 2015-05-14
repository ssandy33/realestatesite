package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gs.models.CsvMlsListing;
import com.gs.models.CsvMlsListingsSummary;

public class CsvMlsListingDAO extends BaseDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	int paginationRecords = 1;

	private static CsvMlsListingDAO ref;
	
	private CsvMlsListingDAO() {}
	
	public static synchronized CsvMlsListingDAO getCsvMlsListingDAOSingleton() {
		if (ref == null)
			ref = new CsvMlsListingDAO();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public CsvMlsListing getOpenHouse(int id) {
		Statement stmt = null;
		CsvMlsListing listing = null;
		StringBuffer sql = new StringBuffer("SELECT id, photo_url, list_number, public_remarks, house_number, compass, street_name, st_suffix, "  +
				" city_town_code, state_province, zip_code, list_price, number_bedrooms, number_bathrooms, year_built, approx_sqft, approx_lot_sqft," +
				" taxes, exterior_features, kitchen_features, community_features, parking_features, heating, cooling, fireplaces, roofing, water, sewer," +
				" apprx_sqft_int, mls_url, public_remarks, open_dates" +
				" from csv_mls_listings_open_houses where id = 1" + id);
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql.toString());

			while (rs.next()) {
				listing = createDetailListing(rs);		
			}
			rs.close(); 
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listing;
	}
	
	public CsvMlsListing getCsvListingById(int id) {
		Statement stmt = null;
		CsvMlsListing listing = null;
		StringBuffer sql = new StringBuffer("SELECT id, photo_url, list_number, public_remarks, house_number, compass, street_name, st_suffix, "  +
				" city_town_code, state_province, zip_code, list_price, number_bedrooms, number_bathrooms, year_built, approx_sqft, approx_lot_sqft," +
				" taxes, exterior_features, kitchen_features, community_features, parking_features, heating, cooling, fireplaces, roofing, water, sewer" +
				" from listings where id = " + id);
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql.toString());

			while (rs.next()) {
				listing = createDetailListing(rs);		
			}
			rs.close(); 
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listing;
	}
	
	public List getCsvListingsForPagination(String searchArea, String sqft, String minPrice, String maxPrice, String minBed, String minBath, int offset, int numRecords, String order, String sort) {
		ArrayList listings = new ArrayList();
		Statement stmt = null;
		CsvMlsListingsSummaryDAO csvMlsListingsSummaryDAO = new CsvMlsListingsSummaryDAO();
		String summaryTableToUse = csvMlsListingsSummaryDAO.getSummaryTableToUse();
		
		StringBuffer sql = new StringBuffer("SELECT SQL_CALC_FOUND_ROWS id, list_price, photo_url, number_bedrooms, number_bathrooms, house_number, compass, " +
				"  street_name, st_suffix, city_town_code, state_province, " +
				" zip_code, approx_sqft, list_number FROM csv_mls_listings_" + summaryTableToUse + " where approx_sqft > " + sqft +
				" and list_price_int > " + minPrice +
				" and number_bedrooms > " + minBed +
				" and number_bathrooms > " + minBath +
				" order by " + order + " " + sort +
				" limit " + offset + ", " + numRecords);
		
		String searchAreaClause;
		String maxPriceClause;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			if (searchArea != null && !searchArea.equals("0")) {
				searchAreaClause = " and search_area_id = " + searchArea + " ";
				sql.append(searchAreaClause);
			}
			
			if (maxPrice != null && !maxPrice.equals("-99")) {
				maxPriceClause = " and list_price_int < " + maxPrice;
				sql.append(maxPriceClause);
			}
			
			System.out.println(sql.toString());
			
			ResultSet rs = stmt.executeQuery(sql.toString());

			while (rs.next()) {
				CsvMlsListing listing = createListing(rs);				
				listings.add(listing);
			}
			rs.close();            
			
			rs = stmt.executeQuery("SELECT FOUND_ROWS()");
            if(rs.next())
                this.paginationRecords = rs.getInt(1);
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listings;
		
	}

	public List getCsvListings(String searchArea, String sqft, String minPrice, String maxPrice, String minBed, String minBath) {
		ArrayList listings = new ArrayList();
		Statement stmt = null;
		StringBuffer sql = new StringBuffer("SELECT id, list_price, photo_url, number_bedrooms, number_bathrooms, house_number, compass, " +
				"  street_name, st_suffix, city_town_code, state_province, " +
				" zip_code, approx_sqft, list_number FROM csv_mls_listings where approx_sqft > " + sqft +
				" and list_price_int > " + minPrice +
				" and number_bedrooms > " + minBed +
				" and number_bathrooms > " + minBath);
		
		String searchAreaClause;
		String maxPriceClause;
		
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			
			if (searchArea != null && !searchArea.equals("0")) {
				searchAreaClause = " and search_area_id = " + searchArea + " ";
				sql.append(searchAreaClause);
			}
			
			if (maxPrice != null && !maxPrice.equals("-99")) {
				maxPriceClause = " and list_price_int < " + maxPrice;
				sql.append(maxPriceClause);
			}
			
			ResultSet rs = stmt.executeQuery(sql.toString());

			while (rs.next()) {
				CsvMlsListing listing = createListing(rs);				
				listings.add(listing);
			}
			rs.close();
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listings;
		
	}
	
	public List getAllCsvListings(int searchArea) {
		ArrayList listings = new ArrayList();
		Statement stmt = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, list_price, photo_url, number_bedrooms, number_bathrooms," +
					" house_number, compass, street_name, st_suffix, city_town_code, state_province, zip_code, approx_sqft, list_number FROM csv_mls_listings_1" +
					" where search_area_id = " + searchArea;
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				CsvMlsListing listing = createListing(rs);				
				listings.add(listing);
			}
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listings;
	}

	public List getAllCsvListings() {
		ArrayList listings = new ArrayList();
		Statement stmt = null;

		try {
			connection = getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT id, list_price, photo_url, number_bedrooms, number_bathrooms," +
					" house_number, compass, street_name, st_suffix, city_town_code, state_province, zip_code, approx_sqft, list_number FROM csv_mls_listings";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				CsvMlsListing listing = createListing(rs);				
				listings.add(listing);
			}
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					connection.close();
			} catch (SQLException se) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		return listings;
	}

	public void add(CsvMlsListing cvsMlsListing) {
		try {
			String queryString = "INSERT INTO csv_mls_listings(agency_name, agency_phone, listing_agent, colisting_agent, list_date, orginal_list_price, list_price,"
					+ " price_per_sq_ft, house_number, compass, street_name, st_suffix, city_town_code, state_province, county_code, zip_code, approx_sqft, number_bedrooms, "
					+ " number_bathrooms, legal_subdivision, builder_name, photo_url) "
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);

			ptmt.setString(1, cvsMlsListing.getAgencyName());
			ptmt.setString(2, cvsMlsListing.getAgencyPhone());
			ptmt.setString(3, cvsMlsListing.getListingAgent());
			ptmt.setString(4, cvsMlsListing.getCoListingAgent());
			ptmt.setDate(5, cvsMlsListing.getListDate());
			ptmt.setString(6, cvsMlsListing.getOriginalListPrice());
			ptmt.setString(7, cvsMlsListing.getListPrice());
			ptmt.setFloat(8, cvsMlsListing.getPricePerSqFt());
			ptmt.setString(9, cvsMlsListing.getHouseNumber());
			ptmt.setString(10, cvsMlsListing.getCompass());
			ptmt.setString(11, cvsMlsListing.getStreetName());
			ptmt.setString(12, cvsMlsListing.getStSuffix());
			ptmt.setString(13, cvsMlsListing.getCityTownCode());
			ptmt.setString(14, cvsMlsListing.getStateProvince());
			ptmt.setString(15, cvsMlsListing.getCountyCode());
			ptmt.setString(16, cvsMlsListing.getZipCode());
			ptmt.setString(17, cvsMlsListing.getApproxSqft());
			ptmt.setInt(18, cvsMlsListing.getNumberBedrooms());
			ptmt.setFloat(19, cvsMlsListing.getNumberBathrooms());
			ptmt.setString(20, cvsMlsListing.getLegalSubdivision());
			ptmt.setString(21, cvsMlsListing.getBuilderName());
			ptmt.setString(22, cvsMlsListing.getPhotoURL());

			ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	public int getPaginationRecords() {
		return paginationRecords;
	}

	private CsvMlsListing createDetailListing(ResultSet rs) {
		CsvMlsListing listing = null;
		
		listing = new CsvMlsListing();
		try {
			listing.setId(rs.getInt("id"));
			listing.setPhotoURL(rs.getString("photo_url"));
			listing.setListNumber(rs.getInt("list_number"));
//			listing.setSqft1(rs.getString("approx_sqft"));
			listing.setPublicRemarks(rs.getString("public_remarks"));
			listing.setHouseNumber(rs.getString("house_number"));
			listing.setCompass(rs.getString("compass"));
			listing.setStreetName(rs.getString("street_name"));
			listing.setStSuffix(rs.getString("st_suffix"));
			listing.setCityTownCode(rs.getString("city_town_code"));
			listing.setStateProvince(rs.getString("state_province"));
			listing.setZipCode(rs.getString("zip_code"));
			listing.setListPrice(rs.getString("list_price"));
			listing.setNumberBathrooms(rs.getFloat("number_bathrooms"));
			listing.setNumberBedrooms(rs.getInt("number_bedrooms"));
			listing.setYearBuilt(rs.getString("year_built"));
			listing.setApproxSqft(rs.getString("approx_sqft"));
			listing.setApproxLotSqFt(rs.getString("approx_lot_sqft"));
			listing.setTaxes(rs.getFloat("taxes"));
			listing.setExteriorFeatures(rs.getString("exterior_features"));
			listing.setKitchenFeatures(rs.getString("kitchen_features"));
			listing.setCommunityFeatures(rs.getString("community_features"));
			listing.setParkingFeatures(rs.getString("parking_features"));
			listing.setHeating(rs.getString("heating"));
			listing.setCooling(rs.getString("cooling"));
			listing.setFireplaces(rs.getString("fireplaces"));
			listing.setRoofing(rs.getString("roofing"));
			listing.setWater(rs.getString("water"));
			listing.setSewer(rs.getString("sewer"));
			listing.setApprxSqftInt(rs.getInt("apprx_sqft_int"));
			listing.setMlsUrl(rs.getString("mls_url"));
			listing.setPublicRemarks(rs.getString("public_remarks"));
			listing.setOpenDates(rs.getString("open_dates"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listing;
	}
	
	private CsvMlsListing createListing(ResultSet rs) {
		CsvMlsListing listing = null;
		
		listing = new CsvMlsListing();
		try {
			listing.setId(rs.getInt("id"));
			listing.setListPrice(rs.getString("list_price"));
			listing.setPhotoURL(rs.getString("photo_url"));
			listing.setNumberBedrooms(rs.getInt("number_bedrooms"));
			listing.setNumberBathrooms(rs.getFloat("number_bathrooms"));
			listing.setHouseNumber(rs.getString("house_number"));
			listing.setCompass(rs.getString("compass"));
			listing.setStreetName(rs.getString("street_name"));
			listing.setStSuffix(rs.getString("st_suffix"));
			listing.setCityTownCode(rs.getString("city_town_code"));
			listing.setStateProvince(rs.getString("state_province"));
			listing.setZipCode(rs.getString("zip_code"));
			listing.setSqft1(rs.getString("approx_sqft"));
			listing.setListNumber(rs.getInt("list_number"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listing;
		
	}

}
