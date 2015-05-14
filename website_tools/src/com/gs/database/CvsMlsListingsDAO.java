package com.gs.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gs.models.CsvMlsListing;

public class CvsMlsListingsDAO {
    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public CvsMlsListingsDAO() {}

    private Connection getConnection() throws SQLException {
            Connection conn;
            conn = ConnectionFactory.getInstance().getConnection();
            return conn;
    }
    
//    public void setOffStatusAllOpenHouses() {
//    	try {
//    		String queryString = "UPDATE csv_mls_listings_open_houses set status = 0";
//    	
//    		connection = getConnection();
//    		ptmt = connection.prepareStatement(queryString);
//    		
//    		ptmt.executeUpdate();
//    	} catch (SQLException e) {
//            e.printStackTrace();
//    	} finally {
//            try {
//            	if (ptmt != null)
//            		ptmt.close();
//            	if (connection != null)
//                	connection.close();
//            } catch (SQLException e) {
//                    e.printStackTrace();
//            } catch (Exception e) {
//                    e.printStackTrace();
//            }
//
//    	}
//    }
    
    public void addOpenHouse(CsvMlsListing cvsMlsListing) {
    	try {
    		String queryString = "INSERT INTO csv_mls_listings_open_houses(agency_name, agency_phone, listing_agent, colisting_agent, list_date, orginal_list_price, list_price, " +
    				" price_per_sq_ft, house_number, compass, street_name, st_suffix, city_town_code, state_province, county_code, zip_code, approx_sqft, number_bedrooms, " +
    				" number_bathrooms, legal_subdivision, builder_name, photo_url, list_number, search_area_id, list_price_int, apprx_sqft_int, year_built, public_remarks, " +
    				" approx_lot_sqft, taxes, exterior_features, kitchen_features, community_features, parking_features, heating, cooling, fireplaces, roofing, water, sewer, status, mls_url, open_dates) " + 
    				" VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
            ptmt.setInt(23, cvsMlsListing.getListNumber());
            ptmt.setInt(24, -99);
            ptmt.setInt(25,new Double(cvsMlsListing.getListPrice()).intValue());
            if (!cvsMlsListing.getApproxSqft().equals(""))
            	ptmt.setInt(26, new Double(cvsMlsListing.getApproxSqft()).intValue());
            else
            	ptmt.setInt(26, 0);
            ptmt.setString(27, cvsMlsListing.getYearBuilt());
            ptmt.setString(28, cvsMlsListing.getPublicRemarks());
            ptmt.setString(29, cvsMlsListing.getApproxLotSqFt());
            ptmt.setFloat(30, cvsMlsListing.getTaxes());
            ptmt.setString(31, cvsMlsListing.getExteriorFeatures());
            ptmt.setString(32, cvsMlsListing.getKitchenFeatures());
            ptmt.setString(33, cvsMlsListing.getCommunityFeatures());

            ptmt.setString(34, cvsMlsListing.getParkingFeatures());
            ptmt.setString(35, cvsMlsListing.getHeating());
            ptmt.setString(36, cvsMlsListing.getCooling());
            ptmt.setString(37, cvsMlsListing.getFireplaces());
            ptmt.setString(38, cvsMlsListing.getRoofing());
            ptmt.setString(39, cvsMlsListing.getWater());
            ptmt.setString(40, cvsMlsListing.getSewer());
            ptmt.setInt(41, 1);
            ptmt.setString(42, cvsMlsListing.getMlsUrl());
            ptmt.setString(43, cvsMlsListing.getOpenDates());
            
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
    
    public void add(CsvMlsListing cvsMlsListing, int searchArea, String summaryTable) {
    	try {
    		String queryString = "INSERT INTO csv_mls_listings_" + summaryTable + "(agency_name, agency_phone, listing_agent, colisting_agent, list_date, orginal_list_price, list_price, " +
    				" price_per_sq_ft, house_number, compass, street_name, st_suffix, city_town_code, state_province, county_code, zip_code, approx_sqft, number_bedrooms, " +
    				" number_bathrooms, legal_subdivision, builder_name, photo_url, list_number, search_area_id, list_price_int, apprx_sqft_int, year_built, public_remarks, " +
    				" approx_lot_sqft, taxes, exterior_features, kitchen_features, community_features, parking_features, heating, cooling, fireplaces, roofing, water, sewer) " + 
    				" VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
            ptmt.setInt(23, cvsMlsListing.getListNumber());
            ptmt.setInt(24, searchArea);
            ptmt.setInt(25,new Double(cvsMlsListing.getListPrice()).intValue());
            if (!cvsMlsListing.getApproxSqft().equals(""))
            	ptmt.setInt(26, new Double(cvsMlsListing.getApproxSqft()).intValue());
            else
            	ptmt.setInt(26, 0);
            ptmt.setString(27, cvsMlsListing.getYearBuilt());
            ptmt.setString(28, cvsMlsListing.getPublicRemarks());
            ptmt.setString(29, cvsMlsListing.getApproxLotSqFt());
            ptmt.setFloat(30, cvsMlsListing.getTaxes());
            ptmt.setString(31, cvsMlsListing.getExteriorFeatures());
            ptmt.setString(32, cvsMlsListing.getKitchenFeatures());
            ptmt.setString(33, cvsMlsListing.getCommunityFeatures());

            ptmt.setString(34, cvsMlsListing.getParkingFeatures());
            ptmt.setString(35, cvsMlsListing.getHeating());
            ptmt.setString(36, cvsMlsListing.getCooling());
            ptmt.setString(37, cvsMlsListing.getFireplaces());
            ptmt.setString(38, cvsMlsListing.getRoofing());
            ptmt.setString(39, cvsMlsListing.getWater());
            ptmt.setString(40, cvsMlsListing.getSewer());
            
            
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
	
//String queryString = "INSERT INTO csv_mls_listings(" +
//	" list_number, " +
//	" agency_name, " +
//	" agency_phone," +
//	" listing_agent," +
//	" colisting_agent," +
//	" property_type," + //5
//	" card_format," +
//	" book_section," +
//	" selling_agency," + //8
//	" selling_agent," +
//	" coselling_ageny," +
//	" end_date," +
//	" dwelling_type," +
//	" list_date," +
//	" close_of_escrow_date, " + //14
//	" under_contract_date," +
//	" fallthrough_date," +
//	" status," +
//	" status_change_date," + //18
//	" temp_off_market_date," +
//	" cancel_date," +
//	" ucb," +
//	" contingent_rem," +
//	" orginal_list_price," + //23
//	" list_price," +
//	" sold_price," +
//	" price_per_sq_ft," +
//	" low_price," +
//	" assessed_val," +
//	" terms," +
//	" financing," + //29
//	" map_code_grid," +
//	" lock_box_nbr," +
//	" house_number," +
//	" bldg_number," +
//	" compass," +
//	" street_name," +
//	" unit_number," + //35
//	" st_dir_sfx," +
//	" st_suffix," +
//	" sub_agent_dollar_percent," +
//	" city_town_code," +
//	" state_province," + //40
//	" county_code," +
//	" country," +
//	" zip_code," +
//	" geo_county," +
//	" geo_block," +
//	" geo_lat," +
//	" geo_lo," +
//	" approx_sqft," + //48
//	" sqft1," +
//	" sqft2," +
//	" bedrooms_plus," +
//	" sqft4," +
//	" year_built," +
//	" style," +
//	" buyer_brooker_dollar_percentage," + //55
//	" apx_lot_size_range," +
//	" lot_acres," +
//	" buyer_broker," +
//	" subagents," +
//	" variable_commission," +
//	" stories," + //61
//	" total_rooms," +
//	" number_bedrooms," +
//	" number_bathrooms," +
//	" number_of_interior_levels, " + //65
//	" exterior_stories," +
//	" baths_3_4," +
//	" source_apx_lot_sqft," +
//	" garage_stall," +
//	" pool," +
//	" zoning," + //71
//	" taxes," +
//	" tax_year," +
//	" legal_subdivision," +
//	" public_remarks," +
//	" private_remarks," +
//	" assessor_number," + //77
//	" legal," +
//	" directions," +
//	" ownr_occ_name_dnd2," +
//	" owner_occ_phn_dnd2," +
//	" marketing_name," + //82
//	" builder_name," +
//	" mod_timestamp," +
//	" assessor_parcel_ltr," +
//	" ut_of_area_schl_dst," +
//	" source_of_sqft," + //87
//	" userdefined4," +
//	" tax_municiplality," +
//	" auction," +
//	" horses, " +
//	" userdefined8," +
//	" ownership," +
//	" hundred_block," + //93
//	" type," +
//	" elementary_school," +
//	" jr_high_school," +
//	" high_school," +
//	" elem_school_dist_number," + //98
//	" high_school_dist_number," +
//	" model," +
//	" approx_sqft_range," +
//	" hndrd_block_directionl," +
//	" zip4," + //102
//	" week_avail_timshare," +
//	" comp_to_subagent," +
//	" comp_to_agent," +
//	" comp_to_buyer_broker," + //106
//	" other_compensation," +
//	" guest_house_sqft," +
//	" approx_lot_sqft," +
//	" userdefined27," + //110
//	" assessors_book_number," +
//	" assessors_map_number," +
//	" assessors_parcel_number," +
//	" userdefined31, " + //114
//	" userdefined32," +
//	" off_market_date," +
//	" cross_street," +
//	" subdivision," +
//	" photo_url," +
//	" days_on_market," +
//	" rooms," +
//	" features) " + //122
//	" VALUES(?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?,?,?,?,?," +
//	"		 ?,?,?,?,?,?)";
    
    
//  ptmt.setInt(1, cvsMlsListing.getAssessorsBookNumber());
//  ptmt.setInt(1, cvsMlsListing.getId());
//  ptmt.setInt(1, cvsMlsListing.getListNumber());
//  ptmt.setString(2, cvsMlsListing.getAgencyName());
//  ptmt.setString(3, cvsMlsListing.getAgencyPhone());
//  ptmt.setString(4, cvsMlsListing.getListingAgent());
//  ptmt.setString(5, cvsMlsListing.getCoListingAgent());
//  ptmt.setString(6, cvsMlsListing.getPropertyType());
//  ptmt.setString(7, cvsMlsListing.getCardFormat());
//  ptmt.setString(8, cvsMlsListing.getBookSection());
//  ptmt.setString(9, cvsMlsListing.getSellingAgency());
//  ptmt.setString(10, cvsMlsListing.getSellingAgent());
//  ptmt.setString(11, cvsMlsListing.getCoSellingAgent());
//  ptmt.setString(12, cvsMlsListing.getEndDate());
//  ptmt.setString(13, cvsMlsListing.getDwellingType());
//  ptmt.setDate(14, cvsMlsListing.getListDate());
//  ptmt.setDate(15, cvsMlsListing.getCloseofEscrowDate());
//  ptmt.setDate(16, cvsMlsListing.getUnderContractDate());
//  ptmt.setDate(17, cvsMlsListing.getFallthroughDate());
//  ptmt.setString(18, cvsMlsListing.getStatus());
//  ptmt.setDate(19, cvsMlsListing.getStatusChangeDate());
//  ptmt.setDate(20, cvsMlsListing.getTempOffMarketDate());
//  ptmt.setDate(21, cvsMlsListing.getCancelDate());
//  ptmt.setString(22, cvsMlsListing.getuCB());
//  ptmt.setString(23, cvsMlsListing.getContingentRem());
//  ptmt.setString(26, cvsMlsListing.getSoldPrice());
//  ptmt.setFloat(27, cvsMlsListing.getPricePerSqFt());
//  ptmt.setString(28, cvsMlsListing.getLowPrice());
//  ptmt.setString(29, cvsMlsListing.getAssessedVal());
//  ptmt.setString(30, cvsMlsListing.getTerms());
//  ptmt.setString(31, cvsMlsListing.getFinancing());
//  ptmt.setString(32, cvsMlsListing.getMapCodeGrid());
//  ptmt.setString(33, cvsMlsListing.getLockBoxNbr());
//  ptmt.setInt(34, cvsMlsListing.getHouseNumber());
//  ptmt.setString(35, cvsMlsListing.getBldgNumber());
//  ptmt.setString(36, cvsMlsListing.getCompass());
//  ptmt.setString(37, cvsMlsListing.getStreetName());
//  ptmt.setString(38, cvsMlsListing.getUnitNumber());
//  ptmt.setString(39, cvsMlsListing.getStDirSfx());
//  ptmt.setString(40, cvsMlsListing.getStSuffix());
//  ptmt.setString(41, cvsMlsListing.getSubAgentDollarPercentage());
//  ptmt.setString(42, cvsMlsListing.getCityTownCode());
//  ptmt.setString(43, cvsMlsListing.getStateProvince());
//  ptmt.setString(44, cvsMlsListing.getCountyCode());
//  ptmt.setString(45, cvsMlsListing.getCountry());
//  ptmt.setString(46, cvsMlsListing.getZipCode());
//  ptmt.setString(47, cvsMlsListing.getGeoCounty());
//  ptmt.setString(48, cvsMlsListing.getGeoBlock());
//  ptmt.setString(49, cvsMlsListing.getGeoLat());
//  ptmt.setString(50, cvsMlsListing.getGeoLon());
//  ptmt.setString(51, cvsMlsListing.getApproxSqft());
//  ptmt.setString(52, cvsMlsListing.getSqft1());
//  ptmt.setString(53, cvsMlsListing.getSqft2());
//  ptmt.setFloat(54, cvsMlsListing.getBedroomsPlus());
//  ptmt.setString(55, cvsMlsListing.getSqft4());
//  ptmt.setString(56, cvsMlsListing.getYearBuilt());
//  ptmt.setString(57, cvsMlsListing.getStyle());
//  ptmt.setString(58, cvsMlsListing.getBuyerBrokerDollarPercentage());
//  ptmt.setString(59, cvsMlsListing.getApxLotSizeRange());
//  ptmt.setString(60, cvsMlsListing.getLotAcres());
//  ptmt.setString(61, cvsMlsListing.getBuyerBroker());
//  ptmt.setString(62, cvsMlsListing.getSubagents());
//  ptmt.setString(63, cvsMlsListing.getVariableCommission());
//  ptmt.setString(64, cvsMlsListing.getStories());
//  ptmt.setInt(65, cvsMlsListing.getTotalRooms());
//  ptmt.setInt(66, cvsMlsListing.getNumberBedrooms());
//  ptmt.setFloat(67, cvsMlsListing.getNumberBathrooms());
//  ptmt.setInt(68, cvsMlsListing.getNumberofInteriorLevels());
//  ptmt.setInt(69, cvsMlsListing.getExteriorStories());
//  ptmt.setString(70, cvsMlsListing.getBaths34());
//  ptmt.setString(71, cvsMlsListing.getSourceApxLotSqFt());
//  ptmt.setString(72, cvsMlsListing.getGarageStall());
//  ptmt.setString(73, cvsMlsListing.getPool());
//  ptmt.setString(74, cvsMlsListing.getZoning());
//  ptmt.setFloat(75, cvsMlsListing.getTaxes());
//  ptmt.setDate(76, cvsMlsListing.getTaxYear());
//  ptmt.setString(77, cvsMlsListing.getLegalSubdivision());
//  ptmt.setString(78, cvsMlsListing.getPublicRemarks());
//  ptmt.setString(79, cvsMlsListing.getPrivateRmksDND2());
//  ptmt.setString(80, cvsMlsListing.getAssessorNumber());
//  ptmt.setString(81, cvsMlsListing.getLegal());
//  ptmt.setString(82, cvsMlsListing.getDirections());
//  ptmt.setString(83, cvsMlsListing.getOwnrOccNameDND2());
//  ptmt.setString(84, cvsMlsListing.getOwnerOccPhnDND2());
//  ptmt.setString(85, cvsMlsListing.getMarketingName());
//  ptmt.setString(86, cvsMlsListing.getBuilderName());
//  ptmt.setString(87, cvsMlsListing.getModTimestamp());
//  ptmt.setString(88, cvsMlsListing.getAssessorParcelLtr());
//  ptmt.setString(89, cvsMlsListing.getOutofAreaSchlDst());
//  ptmt.setString(90, cvsMlsListing.getSourceofSqFt());
//  ptmt.setString(91, cvsMlsListing.getUserdefined4());
//  ptmt.setString(92, cvsMlsListing.getTaxMunicipality());
//  ptmt.setString(93, cvsMlsListing.getAuction());
//  ptmt.setString(94, cvsMlsListing.getHorses());
//  ptmt.setString(95, cvsMlsListing.getUserdefined8());
//  ptmt.setString(96, cvsMlsListing.getOwnership());
//  ptmt.setString(97, cvsMlsListing.getHundredBlock());
//  ptmt.setString(98, cvsMlsListing.getType());
//  ptmt.setString(99, cvsMlsListing.getElementarySchool());
//  ptmt.setString(100, cvsMlsListing.getJrHighSchool());
//  ptmt.setString(101, cvsMlsListing.getHighSchool());
//  ptmt.setInt(102, cvsMlsListing.getElemSchoolDistNumber());
//  ptmt.setInt(103, cvsMlsListing.getHighSchoolDistNumber());
//  ptmt.setString(104, cvsMlsListing.getModel());
//  ptmt.setString(105, cvsMlsListing.getApproxSqFtRange());
//  ptmt.setString(106, cvsMlsListing.getHndrdBlkDirectionl());
//  ptmt.setString(107, cvsMlsListing.getZip4());
//  ptmt.setString(108, cvsMlsListing.getWeekAvailTimeshare());
//  ptmt.setString(109, cvsMlsListing.getComptoSubagent());
//  ptmt.setString(110, cvsMlsListing.getCompToAgent());
//  ptmt.setString(111, cvsMlsListing.getComptoBuyerBroker());
//  ptmt.setString(112, cvsMlsListing.getOtherCompensation());
//  ptmt.setString(113, cvsMlsListing.getGuestHouseSqFt());
//  ptmt.setString(114, cvsMlsListing.getApproxLotSqFt());
//  ptmt.setString(115, cvsMlsListing.getUserdefined27());
//  ptmt.setFloat(116, cvsMlsListing.getAssessorsBookNumber());
//  ptmt.setFloat(117, cvsMlsListing.getAssessorsMapNumber());
//  ptmt.setFloat(118, cvsMlsListing.getAssessorsParcelNumber());
//  ptmt.setString(119, cvsMlsListing.getUserdefined31());
//  ptmt.setString(120, cvsMlsListing.getUserdefined32());
//  ptmt.setString(121, cvsMlsListing.getOffMarketDate());
//  ptmt.setString(122, cvsMlsListing.getCrossStreet());
//  ptmt.setString(123, cvsMlsListing.getSubdivision());
//  ptmt.setString(124, cvsMlsListing.getPhotoURL());
//  ptmt.setInt(125, cvsMlsListing.getDaysonMarket());
//  ptmt.setString(126, cvsMlsListing.getRooms());
//  ptmt.setString(127, cvsMlsListing.getFeatures());
}
