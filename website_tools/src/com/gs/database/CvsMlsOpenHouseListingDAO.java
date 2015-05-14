package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gs.models.BaseModel;
import com.gs.models.CsvMlsListing;
import com.gs.models.CvsMlsOpenHouseListing;
import com.gs.models.Listing;

public class CvsMlsOpenHouseListingDAO extends BaseModel {
    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    private Connection getConnection() throws SQLException {
            Connection conn;
            conn = ConnectionFactory.getInstance().getConnection();
            return conn;
    }    
    
    public void add(Listing listing) {
    	try {
    		String queryString = "INSERT INTO csv_mls_open_house_listings (agency_name, agency_phone, listing_agent, colisting_agent, list_date, orginal_list_price, list_price, " +
    				" price_per_sq_ft, house_number, compass, street_name, st_suffix, city_town_code, state_province, county_code, zip_code, approx_sqft, number_bedrooms, " +
    				" number_bathrooms, legal_subdivision, builder_name, photo_url, list_number, search_area_id, list_price_int, apprx_sqft_int, year_built, public_remarks, " +
    				" approx_lot_sqft, taxes, exterior_features, kitchen_features, community_features, parking_features, heating, cooling, fireplaces, roofing, water, sewer, " +
    				" pool, book_section, status_id, marketing_name, garage, construction, utilities, elementary_school, jr_high_school, high_school, master_bath, flooring," +
    				" interior_features, exterior, lot_view, fencing, hoa_name, directions, tax_year, assessors_book_number, assessors_map_number, " +
    				" assessors_parcel_number, association_fee, ownership, construction_finish, dining_area) " + 
    				" VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);

            ptmt.setString(1, listing.getAgencyName());
            ptmt.setString(2, listing.getAgencyPhone());
            ptmt.setString(3, listing.getListingAgent());
            ptmt.setString(4, listing.getCoListingAgent());
            ptmt.setDate(5, listing.getListDate());
            ptmt.setString(6, listing.getOriginalListPrice());
            ptmt.setString(7, listing.getListPrice());
            ptmt.setFloat(8, listing.getPricePerSqFt());
            ptmt.setString(9, listing.getHouseNumber());
            ptmt.setString(10, listing.getCompass());
            ptmt.setString(11, listing.getStreetName());
            ptmt.setString(12, listing.getStSuffix());
            ptmt.setString(13, listing.getCityTownCode());
            ptmt.setString(14, listing.getStateProvince());
            ptmt.setString(15, listing.getCountyCode());
            ptmt.setString(16, listing.getZipCode());
            ptmt.setString(17, listing.getApproxSqft());
            ptmt.setInt(18, listing.getNumberBedrooms());
            ptmt.setFloat(19, listing.getNumberBathrooms());
            ptmt.setString(20, listing.getLegalSubdivision());
            ptmt.setString(21, listing.getBuilderName());
            ptmt.setString(22, listing.getPhotoURL());
            ptmt.setInt(23, listing.getListNumber());
            ptmt.setInt(24, -99);
            ptmt.setInt(25,new Double(listing.getListPrice()).intValue());
            if (!listing.getApproxSqft().equals(""))
            	ptmt.setInt(26, new Double(listing.getApproxSqft()).intValue());
            else
            	ptmt.setInt(26, 0);
            ptmt.setString(27, listing.getYearBuilt());
            ptmt.setString(28, listing.getPublicRemarks());
            ptmt.setString(29, listing.getApproxLotSqFt());
            ptmt.setFloat(30, listing.getTaxes());
            ptmt.setString(31, listing.getExteriorFeatures());
            ptmt.setString(32, listing.getKitchenFeatures());
            ptmt.setString(33, listing.getCommunityFeatures());

            ptmt.setString(34, listing.getParkingFeatures());
            ptmt.setString(35, listing.getHeating());
            ptmt.setString(36, listing.getCooling());
            ptmt.setString(37, listing.getFireplaces());
            ptmt.setString(38, listing.getRoofing());
            ptmt.setString(39, listing.getWater());
            ptmt.setString(40, listing.getSewer());
            ptmt.setString(41, listing.getPool());
            ptmt.setString(42, listing.getBookSection());
            ptmt.setInt(43, listing.getStatus());
            ptmt.setString(44, listing.getMarketingName());
            ptmt.setString(45, listing.getGarage());
            ptmt.setString(46, listing.getConstruction());
            ptmt.setString(47, listing.getUtilities());
            ptmt.setString(48, listing.getElementarySchool());
            ptmt.setString(49, listing.getJrHighSchool());
            ptmt.setString(50, listing.getHighSchool());
            ptmt.setString(51, listing.getMasterBath());
            ptmt.setString(52, listing.getFlooring());
            ptmt.setString(53, listing.getInteriorFeatures());
            ptmt.setString(54, listing.getExterior());
            ptmt.setString(55, listing.getLotView());
            ptmt.setString(56, listing.getFencing());
            ptmt.setString(57, listing.getHoaName());
            ptmt.setString(58, listing.getDirections());
            ptmt.setDate(59, listing.getTaxYear());
            ptmt.setInt(60, listing.getAssessorsBookNumber());
            ptmt.setInt(61, listing.getAssessorsMapNumber());
            ptmt.setInt(62, listing.getAssessorsParcelNumber());
            ptmt.setInt(63, listing.getAssociationFee());
            ptmt.setString(64, listing.getOwnership());
            ptmt.setString(65, listing.getConstructionFinish());
            ptmt.setString(66, listing.getDiningArea());
            
            
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
}
