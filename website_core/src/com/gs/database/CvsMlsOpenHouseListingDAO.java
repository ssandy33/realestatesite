package com.gs.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gs.models.CsvMlsOpenHouseListing;
import com.gs.models.Listing;

public class CvsMlsOpenHouseListingDAO extends BaseDAO {

	private static CvsMlsOpenHouseListingDAO ref;
	
	private CvsMlsOpenHouseListingDAO() {}
	
	public static synchronized CvsMlsOpenHouseListingDAO getCvsMlsOpenHouseListingDAOSingleton() {
		if (ref == null)
			ref = new CvsMlsOpenHouseListingDAO();
		return ref;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}	
	
	public CsvMlsOpenHouseListing getCsvMlsOpenHouseListingById(int id) {
		Statement stmt = null;
		CsvMlsOpenHouseListing listing = null;
		StringBuffer sql = new StringBuffer("SELECT id, photo_url, list_number, public_remarks, house_number, compass, street_name, st_suffix, "  +
				" city_town_code, state_province, zip_code, list_price, number_bedrooms, number_bathrooms, year_built, approx_sqft, approx_lot_sqft," +
				" taxes, exterior_features, kitchen_features, community_features, parking_features, heating, cooling, fireplaces, roofing, water, sewer," +
				" pool, builder_name, book_section, image_directory, legal_subdivision, garage, marketing_name, construction, utilities, " +
				" elementary_school, jr_high_school, high_school, master_bath, flooring, appliances, interior_features, directions, " +
				" construction_finish, lot_view, fencing, hoa_name, dining_area, taxes, tax_year, association_fee, assessors_book_number, " +
				" assessors_map_number, assessors_parcel_number, ownership, exterior_features" +
				" from csv_mls_open_house_listings where id = " + id);
		
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
	
	private CsvMlsOpenHouseListing createDetailListing(ResultSet rs) {
		CsvMlsOpenHouseListing listing = null;
		
		listing = new CsvMlsOpenHouseListing();
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
			listing.setApprxSqftInt(rs.getInt("approx_sqft"));
//			listing.setMlsUrl(rs.getString("mls_url"));
			listing.setPublicRemarks(rs.getString("public_remarks"));
			listing.setPool(rs.getString("pool"));
			listing.setBuilderName(rs.getString("builder_name"));
			listing.setBookSection(rs.getString("book_section"));
			listing.setImageDirectory(rs.getString("image_directory"));
			listing.setLegalSubdivision(rs.getString("legal_subdivision"));
			listing.setGarage(rs.getString("garage"));
			listing.setMarketingName(rs.getString("marketing_name"));
			listing.setConstruction(rs.getString("construction"));
			listing.setUtilities(rs.getString("utilities"));
			listing.setElementarySchool(rs.getString("elementary_school"));
			listing.setJrHighSchool(rs.getString("jr_high_school"));
			listing.setHighSchool(rs.getString("high_school"));
			listing.setMasterBath(rs.getString("master_bath"));
			listing.setFlooring(rs.getString("flooring"));
			listing.setAppliances(rs.getString("appliances"));
			listing.setInteriorFeatures(rs.getString("interior_features"));
			listing.setDirections(rs.getString("directions"));
			listing.setConstructionFinish(rs.getString("construction_finish"));
			listing.setLotView(rs.getString("lot_view"));
			listing.setFencing(rs.getString("fencing"));
			listing.setHoaName(rs.getString("hoa_name"));
			listing.setDiningArea(rs.getString("dining_area"));
			listing.setTaxes(rs.getFloat("taxes"));
			listing.setTaxYear(rs.getDate("tax_year"));
			listing.setAssociationFee(rs.getFloat("association_fee"));
			listing.setAssessorsBookNumber(rs.getInt("assessors_book_number"));
			listing.setAssessorsMapNumber(rs.getInt("assessors_map_number"));
			listing.setAssessorsParcelNumber(rs.getInt("assessors_parcel_number"));
			listing.setOwnership(rs.getString("ownership"));
			listing.setExteriorFeatures(rs.getString("exterior_features"));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listing;
	}

}
