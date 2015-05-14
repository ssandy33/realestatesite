package com.gs.models;

import java.sql.Date;
import java.util.List;

import com.gs.utils.GenUtils;

public class BaseModel {
	
	protected int id;
	protected int listNumber; //2
	protected String agencyName;
	protected String agencyPhone;
	protected String listingAgent;
	protected String coListingAgent;
	protected String propertyType;
	protected String cardFormat;
	protected String bookSection;
	protected String sellingAgency;
	protected String sellingAgent;
	protected String coSellingAgent;
	protected String endDate;
	protected String dwellingType;
	protected Date listDate; //14
	protected Date closeofEscrowDate;
	protected Date underContractDate;
	protected Date fallthroughDate;
	protected int status_id; //18
	protected Date statusChangeDate; //19
	protected Date tempOffMarketDate;
	protected Date cancelDate;
	protected String uCB; //22
	protected String contingentRem;
	protected String originalListPrice;
	protected String listPrice;
	protected String soldPrice;
	protected float pricePerSqFt; //27
	protected String lowPrice;
	protected String assessedVal;
	protected String terms;
	protected String financing;
	protected String mapCodeGrid;
	protected String lockBoxNbr;
	protected String houseNumber; //34
	protected String bldgNumber;
	protected String compass;
	protected String streetName;
	protected String unitNumber;
	protected String stDirSfx;
	protected String stSuffix;
	protected String subAgentDollarPercentage;
	protected String cityTownCode;
	protected String stateProvince;
	protected String countyCode;
	protected String country;
	protected String zipCode;
	protected String geoCounty;
	protected String geoBlock;
	protected String geoLat; 
	protected String geoLon;
	protected String approxSqft;
	protected String sqft1;
	protected String sqft2; //53
	protected float bedroomsPlus; //54
	protected String sqft4;
	protected String yearBuilt;
	protected String style;
	protected String buyerBrokerDollarPercentage;
	protected String apxLotSizeRange; 
	protected String lotAcres;
	protected String buyerBroker;
	protected String subagents;
	protected String variableCommission;
	protected String stories; //64
	protected int totalRooms; //65
	protected int numberBedrooms; //66
	protected float numberBathrooms; //67
	protected int numberofInteriorLevels; //68
	protected int exteriorStories; //69
	protected String baths34; //70
	protected String sourceApxLotSqFt;
	protected String garageStall;
	protected String pool;
	protected String zoning;
	protected float taxes; //75
	protected Date taxYear; //76
	protected String legalSubdivision;
	protected String publicRemarks;
	protected String protectedRmksDND2; 
	protected String assessorNumber;
	protected String legal;
	protected String directions;
	protected String ownrOccNameDND2;
	protected String ownerOccPhnDND2;
	protected String marketingName;
	protected String builderName;
	protected String modTimestamp;
	protected String assessorParcelLtr;
	protected String outofAreaSchlDst;
	protected String sourceofSqFt;
	protected String userdefined4;
	protected String taxMunicipality;
	protected String auction;
	protected String horses;
	protected String userdefined8;
	protected String ownership; //96
	protected String hundredBlock;
	protected String type;
	protected String elementarySchool;
	protected String jrHighSchool;
	protected String highSchool; //101
	protected int elemSchoolDistNumber; //102
	protected int highSchoolDistNumber; //103
	protected String model;
	protected String approxSqFtRange;
	protected String hndrdBlkDirectionl;
	protected String zip4;
	protected String weekAvailTimeshare;
	protected String compToAgent;
	protected String comptoSubagent;
	protected String comptoBuyerBroker;
	protected String otherCompensation;
	protected String guestHouseSqFt;
	protected String approxLotSqFt;
	protected String userdefined27; //114
	protected int assessorsBookNumber;
	protected int assessorsMapNumber;
	protected int assessorsParcelNumber; //117
	protected String userdefined31;
	protected String userdefined32;
	protected String offMarketDate;
	protected String crossStreet;
	protected String subdivision;
	protected String photoURL; //123
	protected int daysonMarket;
	protected String rooms;
	protected String features;
	protected String exteriorFeatures;
	protected String kitchenFeatures;
	protected String communityFeatures;
	protected String parkingFeatures;
	protected String heating;
	protected String cooling;
	protected String fireplaces;
	protected String roofing;
	protected String water;
	protected String sewer;
	private int apprxSqftInt;
	protected String mlsUrl;
	protected String openDates;
	protected String mainImage;
	private String imageDirectory;
	private List listingImages;
	protected String garage;
	protected String construction;
	protected String utilities;
	protected String masterBath;
	protected String kitchen;
	protected String flooring;
	protected String interiorFeatures;
	private String appliances;
	protected String exterior;
	protected String lotView;
	protected String fencing;
	protected String hoaName;
	protected int associationFee;
	protected String constructionFinish;
	protected String diningArea;

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public String getMainImage() {
		return mainImage;
	}
	public String getDiningArea() {
		return diningArea;
	}
	public void setDiningArea(String diningArea) {
		this.diningArea = diningArea;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getListNumber() {
		return listNumber;
	}
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getAgencyPhone() {
		return agencyPhone;
	}
	public void setAgencyPhone(String agencyPhone) {
		this.agencyPhone = agencyPhone;
	}
	public String getListingAgent() {
		return listingAgent;
	}
	public void setListingAgent(String listingAgent) {
		this.listingAgent = listingAgent;
	}
	public String getCoListingAgent() {
		return coListingAgent;
	}
	public void setCoListingAgent(String coListingAgent) {
		this.coListingAgent = coListingAgent;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getCardFormat() {
		return cardFormat;
	}
	public void setCardFormat(String cardFormat) {
		this.cardFormat = cardFormat;
	}
	public String getBookSection() {
		return bookSection;
	}
	public void setBookSection(String bookSection) {
		this.bookSection = bookSection;
	}
	public String getSellingAgency() {
		return sellingAgency;
	}
	public void setSellingAgency(String sellingAgency) {
		this.sellingAgency = sellingAgency;
	}
	public String getSellingAgent() {
		return sellingAgent;
	}
	public void setSellingAgent(String sellingAgent) {
		this.sellingAgent = sellingAgent;
	}
	public String getCoSellingAgent() {
		return coSellingAgent;
	}
	public void setCoSellingAgent(String coSellingAgent) {
		this.coSellingAgent = coSellingAgent;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDwellingType() {
		return dwellingType;
	}
	public void setDwellingType(String dwellingType) {
		this.dwellingType = dwellingType;
	}
	public Date getListDate() {
		return listDate;
	}
	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}
	public Date getCloseofEscrowDate() {
		return closeofEscrowDate;
	}
	public void setCloseofEscrowDate(Date closeofEscrowDate) {
		this.closeofEscrowDate = closeofEscrowDate;
	}
	public Date getUnderContractDate() {
		return underContractDate;
	}
	public void setUnderContractDate(Date underContractDate) {
		this.underContractDate = underContractDate;
	}
	public Date getFallthroughDate() {
		return fallthroughDate;
	}
	public void setFallthroughDate(Date fallthroughDate) {
		this.fallthroughDate = fallthroughDate;
	}
	public int getStatus() {
		return status_id;
	}
	public void setStatus(int status) {
		this.status_id = status_id;
	}
	public Date getStatusChangeDate() {
		return statusChangeDate;
	}
	public void setStatusChangeDate(Date statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}
	public Date getTempOffMarketDate() {
		return tempOffMarketDate;
	}
	public void setTempOffMarketDate(Date tempOffMarketDate) {
		this.tempOffMarketDate = tempOffMarketDate;
	}
	public Date getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	public String getuCB() {
		return uCB;
	}
	public void setuCB(String uCB) {
		this.uCB = uCB;
	}
	public String getContingentRem() {
		return contingentRem;
	}
	public void setContingentRem(String contingentRem) {
		this.contingentRem = contingentRem;
	}
	public String getOriginalListPrice() {
		return originalListPrice;
	}
	public void setOriginalListPrice(String originalListPrice) {
		this.originalListPrice = originalListPrice;
	}
	public String getListPrice() {
		return listPrice;
	}
	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}
	public String getSoldPrice() {
		return soldPrice;
	}
	public void setSoldPrice(String soldPrice) {
		this.soldPrice = soldPrice;
	}
	public float getPricePerSqFt() {
		return pricePerSqFt;
	}
	public void setPricePerSqFt(float pricePerSqFt) {
		this.pricePerSqFt = pricePerSqFt;
	}
	public String getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}
	public String getAssessedVal() {
		return assessedVal;
	}
	public void setAssessedVal(String assessedVal) {
		this.assessedVal = assessedVal;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getFinancing() {
		return financing;
	}
	public void setFinancing(String financing) {
		this.financing = financing;
	}
	public String getMapCodeGrid() {
		return mapCodeGrid;
	}
	public void setMapCodeGrid(String mapCodeGrid) {
		this.mapCodeGrid = mapCodeGrid;
	}
	public String getLockBoxNbr() {
		return lockBoxNbr;
	}
	public void setLockBoxNbr(String lockBoxNbr) {
		this.lockBoxNbr = lockBoxNbr;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getBldgNumber() {
		return bldgNumber;
	}
	public void setBldgNumber(String bldgNumber) {
		this.bldgNumber = bldgNumber;
	}
	public String getCompass() {
		return compass;
	}
	public void setCompass(String compass) {
		this.compass = compass;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	public String getStDirSfx() {
		return stDirSfx;
	}
	public void setStDirSfx(String stDirSfx) {
		this.stDirSfx = stDirSfx;
	}
	public String getStSuffix() {
		return stSuffix;
	}
	public void setStSuffix(String stSuffix) {
		this.stSuffix = stSuffix;
	}
	public String getSubAgentDollarPercentage() {
		return subAgentDollarPercentage;
	}
	public void setSubAgentDollarPercentage(String subAgentDollarPercentage) {
		this.subAgentDollarPercentage = subAgentDollarPercentage;
	}
	public String getCityTownCode() {
		return cityTownCode;
	}
	public void setCityTownCode(String cityTownCode) {
		this.cityTownCode = cityTownCode;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getGeoCounty() {
		return geoCounty;
	}
	public void setGeoCounty(String geoCounty) {
		this.geoCounty = geoCounty;
	}
	public String getGeoBlock() {
		return geoBlock;
	}
	public void setGeoBlock(String geoBlock) {
		this.geoBlock = geoBlock;
	}
	public String getGeoLat() {
		return geoLat;
	}
	public void setGeoLat(String geoLat) {
		this.geoLat = geoLat;
	}
	public String getGeoLon() {
		return geoLon;
	}
	public void setGeoLon(String geoLon) {
		this.geoLon = geoLon;
	}
	public String getApproxSqft() {
		return approxSqft;
	}
	public void setApproxSqft(String approxSqft) {
		this.approxSqft = approxSqft;
	}
	public String getSqft1() {
		return sqft1;
	}
	public void setSqft1(String sqft1) {
		this.sqft1 = sqft1;
	}
	public String getSqft2() {
		return sqft2;
	}
	public void setSqft2(String sqft2) {
		this.sqft2 = sqft2;
	}
	public float getBedroomsPlus() {
		return bedroomsPlus;
	}
	public void setBedroomsPlus(float bedroomsPlus) {
		this.bedroomsPlus = bedroomsPlus;
	}
	public String getSqft4() {
		return sqft4;
	}
	public void setSqft4(String sqft4) {
		this.sqft4 = sqft4;
	}
	public String getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getBuyerBrokerDollarPercentage() {
		return buyerBrokerDollarPercentage;
	}
	public void setBuyerBrokerDollarPercentage(String buyerBrokerDollarPercentage) {
		this.buyerBrokerDollarPercentage = buyerBrokerDollarPercentage;
	}
	public String getApxLotSizeRange() {
		return apxLotSizeRange;
	}
	public void setApxLotSizeRange(String apxLotSizeRange) {
		this.apxLotSizeRange = apxLotSizeRange;
	}
	public String getLotAcres() {
		return lotAcres;
	}
	public void setLotAcres(String lotAcres) {
		this.lotAcres = lotAcres;
	}
	public String getBuyerBroker() {
		return buyerBroker;
	}
	public void setBuyerBroker(String buyerBroker) {
		this.buyerBroker = buyerBroker;
	}
	public String getSubagents() {
		return subagents;
	}
	public void setSubagents(String subagents) {
		this.subagents = subagents;
	}
	public String getVariableCommission() {
		return variableCommission;
	}
	public void setVariableCommission(String variableCommission) {
		this.variableCommission = variableCommission;
	}
	public String getStories() {
		return stories;
	}
	public void setStories(String stories) {
		this.stories = stories;
	}
	public int getTotalRooms() {
		return totalRooms;
	}
	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}
	public int getNumberBedrooms() {
		return numberBedrooms;
	}
	public void setNumberBedrooms(int numberBedrooms) {
		this.numberBedrooms = numberBedrooms;
	}
	public float getNumberBathrooms() {
		return numberBathrooms;
	}
	public void setNumberBathrooms(float numberBathrooms) {
		this.numberBathrooms = numberBathrooms;
	}
	public int getNumberofInteriorLevels() {
		return numberofInteriorLevels;
	}
	public void setNumberofInteriorLevels(int numberofInteriorLevels) {
		this.numberofInteriorLevels = numberofInteriorLevels;
	}
	public int getExteriorStories() {
		return exteriorStories;
	}
	public void setExteriorStories(int exteriorStories) {
		this.exteriorStories = exteriorStories;
	}
	public String getBaths34() {
		return baths34;
	}
	public void setBaths34(String baths34) {
		this.baths34 = baths34;
	}
	public String getSourceApxLotSqFt() {
		return sourceApxLotSqFt;
	}
	public void setSourceApxLotSqFt(String sourceApxLotSqFt) {
		this.sourceApxLotSqFt = sourceApxLotSqFt;
	}
	public String getGarageStall() {
		return garageStall;
	}
	public void setGarageStall(String garageStall) {
		this.garageStall = garageStall;
	}
	public String getPool() {
		return pool;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	public String getZoning() {
		return zoning;
	}
	public void setZoning(String zoning) {
		this.zoning = zoning;
	}
	public float getTaxes() {
		return taxes;
	}
	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
	public Date getTaxYear() {
		return taxYear;
	}
	public void setTaxYear(Date taxYear) {
		this.taxYear = taxYear;
	}
	public String getLegalSubdivision() {
		return legalSubdivision;
	}
	public void setLegalSubdivision(String legalSubdivision) {
		this.legalSubdivision = legalSubdivision;
	}
	public String getPublicRemarks() {
		return publicRemarks;
	}
	public void setPublicRemarks(String publicRemarks) {
		this.publicRemarks = publicRemarks;
	}
//	public String getPrivateRmksDND2() {
//		return privateRmksDND2;
//	}
//	public void setPrivateRmksDND2(String privateRmksDND2) {
//		this.privateRmksDND2 = privateRmksDND2;
//	}
	public String getAssessorNumber() {
		return assessorNumber;
	}
	public void setAssessorNumber(String assessorNumber) {
		this.assessorNumber = assessorNumber;
	}
	public String getLegal() {
		return legal;
	}
	public void setLegal(String legal) {
		this.legal = legal;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public String getOwnrOccNameDND2() {
		return ownrOccNameDND2;
	}
	public void setOwnrOccNameDND2(String ownrOccNameDND2) {
		this.ownrOccNameDND2 = ownrOccNameDND2;
	}
	public String getOwnerOccPhnDND2() {
		return ownerOccPhnDND2;
	}
	public void setOwnerOccPhnDND2(String ownerOccPhnDND2) {
		this.ownerOccPhnDND2 = ownerOccPhnDND2;
	}
	public String getMarketingName() {
		return marketingName;
	}
	public void setMarketingName(String marketingName) {
		this.marketingName = marketingName;
	}
	public String getBuilderName() {
		return builderName;
	}
	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}
	public String getModTimestamp() {
		return modTimestamp;
	}
	public void setModTimestamp(String modTimestamp) {
		this.modTimestamp = modTimestamp;
	}
	public String getAssessorParcelLtr() {
		return assessorParcelLtr;
	}
	public void setAssessorParcelLtr(String assessorParcelLtr) {
		this.assessorParcelLtr = assessorParcelLtr;
	}
	public String getOutofAreaSchlDst() {
		return outofAreaSchlDst;
	}
	public void setOutofAreaSchlDst(String outofAreaSchlDst) {
		this.outofAreaSchlDst = outofAreaSchlDst;
	}
	public String getSourceofSqFt() {
		return sourceofSqFt;
	}
	public void setSourceofSqFt(String sourceofSqFt) {
		this.sourceofSqFt = sourceofSqFt;
	}
	public String getUserdefined4() {
		return userdefined4;
	}
	public void setUserdefined4(String userdefined4) {
		this.userdefined4 = userdefined4;
	}
	public String getTaxMunicipality() {
		return taxMunicipality;
	}
	public void setTaxMunicipality(String taxMunicipality) {
		this.taxMunicipality = taxMunicipality;
	}
	public String getAuction() {
		return auction;
	}
	public void setAuction(String auction) {
		this.auction = auction;
	}
	public String getHorses() {
		return horses;
	}
	public void setHorses(String horses) {
		this.horses = horses;
	}
	public String getUserdefined8() {
		return userdefined8;
	}
	public void setUserdefined8(String userdefined8) {
		this.userdefined8 = userdefined8;
	}
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public String getHundredBlock() {
		return hundredBlock;
	}
	public void setHundredBlock(String hundredBlock) {
		this.hundredBlock = hundredBlock;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getElementarySchool() {
		return elementarySchool;
	}
	public void setElementarySchool(String elementarySchool) {
		this.elementarySchool = elementarySchool;
	}
	public String getJrHighSchool() {
		return jrHighSchool;
	}
	public void setJrHighSchool(String jrHighSchool) {
		this.jrHighSchool = jrHighSchool;
	}
	public String getHighSchool() {
		return highSchool;
	}
	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}
	public int getElemSchoolDistNumber() {
		return elemSchoolDistNumber;
	}
	public void setElemSchoolDistNumber(int elemSchoolDistNumber) {
		this.elemSchoolDistNumber = elemSchoolDistNumber;
	}
	public int getHighSchoolDistNumber() {
		return highSchoolDistNumber;
	}
	public void setHighSchoolDistNumber(int highSchoolDistNumber) {
		this.highSchoolDistNumber = highSchoolDistNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getApproxSqFtRange() {
		return approxSqFtRange;
	}
	public void setApproxSqFtRange(String approxSqFtRange) {
		this.approxSqFtRange = approxSqFtRange;
	}
	public String getHndrdBlkDirectionl() {
		return hndrdBlkDirectionl;
	}
	public void setHndrdBlkDirectionl(String hndrdBlkDirectionl) {
		this.hndrdBlkDirectionl = hndrdBlkDirectionl;
	}
	public String getZip4() {
		return zip4;
	}
	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}
	public String getWeekAvailTimeshare() {
		return weekAvailTimeshare;
	}
	public void setWeekAvailTimeshare(String weekAvailTimeshare) {
		this.weekAvailTimeshare = weekAvailTimeshare;
	}
	public String getComptoSubagent() {
		return comptoSubagent;
	}
	public void setComptoSubagent(String comptoSubagent) {
		this.comptoSubagent = comptoSubagent;
	}
	public String getComptoBuyerBroker() {
		return comptoBuyerBroker;
	}
	public void setComptoBuyerBroker(String comptoBuyerBroker) {
		this.comptoBuyerBroker = comptoBuyerBroker;
	}
	public String getOtherCompensation() {
		return otherCompensation;
	}
	public void setOtherCompensation(String otherCompensation) {
		this.otherCompensation = otherCompensation;
	}
	public String getGuestHouseSqFt() {
		return guestHouseSqFt;
	}
	public void setGuestHouseSqFt(String guestHouseSqFt) {
		this.guestHouseSqFt = guestHouseSqFt;
	}
	public String getApproxLotSqFt() {
		return approxLotSqFt;
	}
	public void setApproxLotSqFt(String approxLotSqFt) {
		this.approxLotSqFt = approxLotSqFt;
	}
	public String getUserdefined27() {
		return userdefined27;
	}
	public void setUserdefined27(String userdefined27) {
		this.userdefined27 = userdefined27;
	}
	public int getAssessorsBookNumber() {
		return assessorsBookNumber;
	}
	public void setAssessorsBookNumber(int assessorsBookNumber) {
		this.assessorsBookNumber = assessorsBookNumber;
	}
	public int getAssessorsMapNumber() {
		return assessorsMapNumber;
	}
	public void setAssessorsMapNumber(int assessorsMapNumber) {
		this.assessorsMapNumber = assessorsMapNumber;
	}
	public int getAssessorsParcelNumber() {
		return assessorsParcelNumber;
	}
	public void setAssessorsParcelNumber(int assessorsParcelNumber) {
		this.assessorsParcelNumber = assessorsParcelNumber;
	}
	public String getUserdefined31() {
		return userdefined31;
	}
	public void setUserdefined31(String userdefined31) {
		this.userdefined31 = userdefined31;
	}
	public String getUserdefined32() {
		return userdefined32;
	}
	public void setUserdefined32(String userdefined32) {
		this.userdefined32 = userdefined32;
	}
	public String getOffMarketDate() {
		return offMarketDate;
	}
	public void setOffMarketDate(String offMarketDate) {
		this.offMarketDate = offMarketDate;
	}
	public String getCrossStreet() {
		return crossStreet;
	}
	public void setCrossStreet(String crossStreet) {
		this.crossStreet = crossStreet;
	}
	public String getSubdivision() {
		return subdivision;
	}
	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	public int getDaysonMarket() {
		return daysonMarket;
	}
	public void setDaysonMarket(int daysonMarket) {
		this.daysonMarket = daysonMarket;
	}
	public String getRooms() {
		return rooms;
	}
	public void setRooms(String rooms) {
		this.rooms = rooms;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}

	public String getCompToAgent() {
		return compToAgent;
	}

	public void setCompToAgent(String compToAgent) {
		this.compToAgent = compToAgent;
	}
	
	public String getExteriorFeatures() {
		return exteriorFeatures;
	}

	public void setExteriorFeatures(String exteriorFeatures) {
		this.exteriorFeatures = exteriorFeatures;
	}

	public String getKitchenFeatures() {
		return kitchenFeatures;
	}

	public void setKitchenFeatures(String kitchenFeatures) {
		this.kitchenFeatures = kitchenFeatures;
	}

	public String getCommunityFeatures() {
		return communityFeatures;
	}

	public void setCommunityFeatures(String communityFeatures) {
		this.communityFeatures = communityFeatures;
	}

	public String getParkingFeatures() {
		return parkingFeatures;
	}

	public void setParkingFeatures(String parkingFeatures) {
		this.parkingFeatures = parkingFeatures;
	}

	public String getHeating() {
		return heating;
	}

	public void setHeating(String heating) {
		this.heating = heating;
	}

	public String getCooling() {
		return cooling;
	}

	public void setCooling(String cooling) {
		this.cooling = cooling;
	}

	public String getFireplaces() {
		return fireplaces;
	}

	public void setFireplaces(String fireplaces) {
		this.fireplaces = fireplaces;
	}

	public String getRoofing() {
		return roofing;
	}

	public void setRoofing(String roofing) {
		this.roofing = roofing;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getSewer() {
		return sewer;
	}

	public void setSewer(String sewer) {
		this.sewer = sewer;
	}

	public String getMlsUrl() {
		return mlsUrl;
	}

	public void setMlsUrl(String mlsUrl) {
		this.mlsUrl = mlsUrl;
	}

	public String getOpenDates() {
		return openDates;
	}

	public void setOpenDates(String openDates) {
		this.openDates = openDates;
	}

	public String getGarage() {
		return garage;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}

	public String getConstruction() {
		return construction;
	}

	public void setConstruction(String construction) {
		this.construction = construction;
	}

	public String getUtilities() {
		return utilities;
	}

	public void setUtilities(String utilities) {
		this.utilities = utilities;
	}

	public String getMasterBath() {
		return masterBath;
	}

	public void setMasterBath(String masterBath) {
		this.masterBath = masterBath;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getFlooring() {
		return flooring;
	}

	public void setFlooring(String flooring) {
		this.flooring = flooring;
	}

	public String getInteriorFeatures() {
		return interiorFeatures;
	}

	public void setInteriorFeatures(String interiorFeatures) {
		this.interiorFeatures = interiorFeatures;
	}

	public String getExterior() {
		return exterior;
	}

	public void setExterior(String exterior) {
		this.exterior = exterior;
	}

	public String getLotView() {
		return lotView;
	}

	public void setLotView(String lotView) {
		this.lotView = lotView;
	}

	public String getFencing() {
		return fencing;
	}

	public void setFencing(String fencing) {
		this.fencing = fencing;
	}

	public String getHoaName() {
		return hoaName;
	}

	public void setHoaName(String hoaName) {
		this.hoaName = hoaName;
	}

	public int getAssociationFee() {
		return associationFee;
	}

	public void setAssociatonFee(int associationFee) {
		this.associationFee = associationFee;
	}

	public String getConstructionFinish() {
		return constructionFinish;
	}

	public void setConstructionFinish(String constructionFinish) {
		this.constructionFinish = constructionFinish;
	}

	public String parseExteriorFeatures (String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder exteriorFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Exterior")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					exteriorFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (exteriorFeatures.length() > 0)
				exteriorFeatures.deleteCharAt(exteriorFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exteriorFeatures.toString();
	}
	
	public String parseKitchenFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder kitchenFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Kitchen")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					kitchenFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (kitchenFeatures.length() > 0)
				kitchenFeatures.deleteCharAt(kitchenFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kitchenFeatures.toString();
		
	}
	
	public String parseCommunityFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder communityFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Community")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					communityFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (communityFeatures.length() > 0)
				communityFeatures.deleteCharAt(communityFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return communityFeatures.toString();
		
	}
	
	public String parseParkingFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder parkingFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Parking")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					parkingFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (parkingFeatures.length() > 0)
				parkingFeatures.deleteCharAt(parkingFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return parkingFeatures.toString();
		
	}
	
	public String parseHeatingFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder heatingFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Heating")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					heatingFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (heatingFeatures.length() > 0)
				heatingFeatures.deleteCharAt(heatingFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return heatingFeatures.toString();		
	}
	
	public String parseCoolingFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder coolingFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Cooling")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					coolingFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (coolingFeatures.length() > 0)
				coolingFeatures.deleteCharAt(coolingFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return coolingFeatures.toString();		
	}
	
	public String parseFireplaceFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder fireplaceFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Fireplace")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					fireplaceFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (fireplaceFeatures.length() > 0)
				fireplaceFeatures.deleteCharAt(fireplaceFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fireplaceFeatures.toString();	
	}
	
	public String parseRoofingFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder roofingFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Roofing")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					roofingFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (roofingFeatures.length() > 0)
				roofingFeatures.deleteCharAt(roofingFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roofingFeatures.toString();	
	}
	
	public String parseWaterFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder waterFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Water")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					waterFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (waterFeatures.length() > 0)
				waterFeatures.deleteCharAt(waterFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return waterFeatures.toString();	
	}
	
	public String parseSewerFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder sewerFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Sewer")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					sewerFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (sewerFeatures.length() > 0)
				sewerFeatures.deleteCharAt(sewerFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sewerFeatures.toString();	
	}
	
	public String parseGarage(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder garageFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Garage Spaces")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					garageFeatures.append(found[2] + ", ");
				}
			}
		}
		try {
			if (garageFeatures.length() > 0)
				garageFeatures.deleteCharAt(garageFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return garageFeatures.toString();	
	}
	
	public String parseConstruction(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder constructionFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Construction")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					constructionFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (constructionFeatures.length() > 0)
				constructionFeatures.deleteCharAt(constructionFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return constructionFeatures.toString();	
	}
	
	public String parseUtilities(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder utilitiesFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Utilities")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					utilitiesFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (utilitiesFeatures.length() > 0)
				utilitiesFeatures.deleteCharAt(utilitiesFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return utilitiesFeatures.toString();	
	}
	
	public String parseMasterBath(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder masterBathFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Master Bathroom")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					masterBathFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (masterBathFeatures.length() > 0)
				masterBathFeatures.deleteCharAt(masterBathFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return masterBathFeatures.toString();	
	}
	
	public String parseInteriorFeatures(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder interiorFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.startsWith("Features|")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					interiorFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (interiorFeatures.length() > 0)
				interiorFeatures.deleteCharAt(interiorFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return interiorFeatures.toString();	
	}
	
	public String parseExterior(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder exteriorFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.startsWith("Const - Finish|")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					exteriorFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (exteriorFeatures.length() > 0)
				exteriorFeatures.deleteCharAt(exteriorFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exteriorFeatures.toString();	
	}
	
	public String parseLotView(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder lotView = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.startsWith("Property Description")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					lotView.append(found[1] + ", ");
				}
			}
		}
		try {
			if (lotView.length() > 0)
				lotView.deleteCharAt(lotView.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lotView.toString();	
	}
	
	public String parseFencing(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder fencing = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.startsWith("Fencing")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					fencing.append(found[1] + ", ");
				}
			}
		}
		try {
			if (fencing.length() > 0)
				fencing.deleteCharAt(fencing.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fencing.toString();	
	}
	
	public String parseHoaName(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder hoaName = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("HOA Name")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					hoaName.append(found[2]);
				}
			}
		}
		try {
			if (hoaName.length() > 0)
				hoaName.deleteCharAt(hoaName.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hoaName.toString();	
	}
	
	public int parseAssociationFee(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder associationFee = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Ttl Mthly Fee Equiv")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					associationFee.append(found[2]);
				}
			}
		}
		return Integer.parseInt(GenUtils.formatAsInt(associationFee.toString()));	
	}
	
	public String parseDiningArea(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder dining = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Dining Area")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					dining.append(found[1]);
				}
			}
		}
		
		try {
			if (dining.length() > 0)
				dining.deleteCharAt(dining.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dining.toString();	
		
	}
	
	public String parseConstructionFinish(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder finish = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Const - Finish")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					finish.append(found[1]);
				}
			}
		}
		
		try {
			if (finish.length() > 0)
				finish.deleteCharAt(finish.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return finish.toString();	
	}
	
	public String parseflooring(String features) {
		String[] splits = features.split(";");
		String[] found;
		String newFeature;
		StringBuilder flooringFeatures = new StringBuilder();
		
		for (String detail: splits) {
			
			if (detail.contains("Flooring")) {
				found = detail.split("\\|");
				if (found.length == 3) {
					flooringFeatures.append(found[1] + ", ");
				}
			}
		}
		try {
			if (flooringFeatures.length() > 0)
				flooringFeatures.deleteCharAt(flooringFeatures.length() - 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flooringFeatures.toString();	
	}

}
