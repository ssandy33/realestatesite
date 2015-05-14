package com.gs.models;

import java.sql.Date;

import com.gs.database.CvsMlsListingsDAO;

public class CsvMlsListing {
	
	private int id;
	private int listNumber; //2
	private String agencyName;
	private String agencyPhone;
	private String listingAgent;
	private String coListingAgent;
	private String propertyType;
	private String cardFormat;
	private String bookSection;
	private String sellingAgency;
	private String sellingAgent;
	private String coSellingAgent;
	private String endDate;
	private String dwellingType;
	private Date listDate; //14
	private Date closeofEscrowDate;
	private Date underContractDate;
	private Date fallthroughDate;
	private String status; //18
	private Date statusChangeDate; //19
	private Date tempOffMarketDate;
	private Date cancelDate;
	private String uCB; //22
	private String contingentRem;
	private String originalListPrice;
	private String listPrice;
	private String soldPrice;
	private float pricePerSqFt; //27
	private String lowPrice;
	private String assessedVal;
	private String terms;
	private String financing;
	private String mapCodeGrid;
	private String lockBoxNbr;
	private String houseNumber; //34
	private String bldgNumber;
	private String compass;
	private String streetName;
	private String unitNumber;
	private String stDirSfx;
	private String stSuffix;
	private String subAgentDollarPercentage;
	private String cityTownCode;
	private String stateProvince;
	private String countyCode;
	private String country;
	private String zipCode;
	private String geoCounty;
	private String geoBlock;
	private String geoLat; 
	private String geoLon;
	private String approxSqft;
	private String sqft1;
	private String sqft2; //53
	private float bedroomsPlus; //54
	private String sqft4;
	private String yearBuilt;
	private String style;
	private String buyerBrokerDollarPercentage;
	private String apxLotSizeRange; 
	private String lotAcres;
	private String buyerBroker;
	private String subagents;
	private String variableCommission;
	private String stories; //64
	private int totalRooms; //65
	private int numberBedrooms; //66
	private float numberBathrooms; //67
	private int numberofInteriorLevels; //68
	private int exteriorStories; //69
	private String baths34; //70
	private String sourceApxLotSqFt;
	private String garageStall;
	private String pool;
	private String zoning;
	private float taxes; //75
	private Date taxYear; //76
	private String legalSubdivision;
	private String publicRemarks;
	private String privateRmksDND2; 
	private String assessorNumber;
	private String legal;
	private String directions;
	private String ownrOccNameDND2;
	private String ownerOccPhnDND2;
	private String marketingName;
	private String builderName;
	private String modTimestamp;
	private String assessorParcelLtr;
	private String outofAreaSchlDst;
	private String sourceofSqFt;
	private String userdefined4;
	private String taxMunicipality;
	private String auction;
	private String horses;
	private String userdefined8;
	private String ownership;
	private String hundredBlock;
	private String type;
	private String elementarySchool;
	private String jrHighSchool;
	private String highSchool; //101
	private int elemSchoolDistNumber; //102
	private int highSchoolDistNumber; //103
	private String model;
	private String approxSqFtRange;
	private String hndrdBlkDirectionl;
	private String zip4;
	private String weekAvailTimeshare;
	private String compToAgent;
	private String comptoSubagent;
	private String comptoBuyerBroker;
	private String otherCompensation;
	private String guestHouseSqFt;
	private String approxLotSqFt;
	private String userdefined27; //114
	private float assessorsBookNumber;
	private float assessorsMapNumber;
	private float assessorsParcelNumber; //117
	private String userdefined31;
	private String userdefined32;
	private String offMarketDate;
	private String crossStreet;
	private String subdivision;
	private String photoURL; //123
	private int daysonMarket;
	private String rooms;
	private String features;
	private String exteriorFeatures;
	private String kitchenFeatures;
	private String communityFeatures;
	private String parkingFeatures;
	private String heating;
	private String cooling;
	private String fireplaces;
	private String roofing;
	private String water;
	private String sewer;
	private String mlsUrl;
	private String openDates;
	private String hoaName;
	
	public CsvMlsListing(String agencyName, String agencyPhone, String listingAgent, String coListingAgent, Date listDate, String originalListPrice, String listPrice,
			float pricePerSqFt, String houseNumber, String compass, String streetName, String stSuffix, String cityTownCode, String stateProvince, String countyCode, String country,
			String zipCode, String approxSqft, int numberBedrooms, float numberBathrooms, String legalSubdivision, String builderName, String model, String photoURL, int listNumber,
			String yearBuilt, String publicRemarks, String approxLotSqFt, float taxes, String features, String mlsUrl, String openDates) {
		super();
		this.agencyName = agencyName;
		this.agencyPhone = agencyPhone;
		this.listingAgent = listingAgent;
		this.coListingAgent = coListingAgent;
		this.listDate = listDate;
		this.originalListPrice = originalListPrice;
		this.listPrice = listPrice;
		this.pricePerSqFt = pricePerSqFt;
		this.houseNumber = houseNumber;
		this.compass = compass;
		this.streetName = streetName;
		this.stSuffix = stSuffix;
		this.cityTownCode = cityTownCode;
		this.stateProvince = stateProvince;
		this.countyCode = countyCode;
		this.country = country;
		this.zipCode = zipCode;
		this.approxSqft = approxSqft;
		this.numberBedrooms = numberBedrooms;
		this.numberBathrooms = numberBathrooms;
		this.legalSubdivision = legalSubdivision;
		this.builderName = builderName;
		this.model = model;
		this.photoURL = photoURL;
		this.listNumber = listNumber;
		this.yearBuilt = yearBuilt;
		this.publicRemarks = publicRemarks;
		this.approxLotSqFt = approxLotSqFt;
		this.taxes = taxes;
		this.exteriorFeatures = parseExteriorFeatures(features);
		this.kitchenFeatures = parseKitchenFeatures(features);
		this.communityFeatures = parseCommunityFeatures(features);
		this.parkingFeatures = parseParkingFeatures(features);
		this.heating = parseHeatingFeatures(features);
		this.cooling = parseCoolingFeatures(features);
		this.fireplaces = parseFireplaceFeatures(features);
		this.roofing = parseRoofingFeatures(features);
		this.water = parseWaterFeatures(features);
		this.sewer = parseSewerFeatures(features);
		this.mlsUrl = mlsUrl;
		this.openDates = openDates;
	}
	
	public CsvMlsListing(int listNumber, String agencyName, String agencyPhone, String listingAgent, String coListingAgent,
						String propertyType, String cardFormat, String bookSection, String sellingAgency, String sellingAgent, String coSellingAgent,
						String endDate, String dwellingType, Date listDate, Date closeofEscrowDate, Date underContractDate,
						Date fallthroughDate, String status, Date statusChangeDate, Date tempOffMarketDate, Date cancelDate, String uCB,
						String contingentRem, String originalListPrice, String listPrice, String soldPrice, float pricePerSqFt, String lowPrice,
						String assessedVal, String terms, String financing, String mapCodeGrid, String lockBoxNbr, String houseNumber,
						String bldgNumber, String compass, String streetName, String unitNumber, String stDirSfx, String stSuffix,
						String subAgentDollarPercentage, String cityTownCode, String stateProvince, String countyCode, String country,
						String zipCode, String geoCounty, String geoBlock, String geoLat, String geoLon, String approxSqft, String sqft1, String sqft2,
						Float bedroomsPlus, String sqft4, String yearBuilt, String style, String buyerBrokerDollarPercentage, String apxLotSizeRange,
						String lotAcres, String buyerBroker, String subagents, String variableCommission, String stories, int totalRooms,
						int numberBedrooms, float numberBathrooms, int numberofInteriorLevels, int exteriorStories, String baths34,
						String sourceApxLotSqFt, String garageStall, String pool, String zoning, float taxes, Date taxYear, String legalSubdivision,
						String publicRemarks, String privateRmksDND2, String assessorNumber, String legal, String directions,
						String ownrOccNameDND2, String ownerOccPhnDND2, String marketingName, String builderName, String modTimestamp,
						String assessorParcelLtr, String outofAreaSchlDst, String sourceofSqFt, String userdefined4, String taxMunicipality,
						String auction, String horses, String userdefined8, String ownership, String hundredBlock, String type,
						String elementarySchool, String jrHighSchool, String highSchool,
						int elemSchoolDistNumber, int highSchoolDistNumber, String model, String approxSqFtRange, String hndrdBlkDirectionl, String zip4,
						String weekAvailTimeshare, String compttoAgent, String comptoSubagent, String comptoBuyerBroker, String otherCompensation,
						String guestHouseSqFt, String approxLotSqFt, String userdefined27, float assessorsBookNumber, float assessorsMapNumber,
						float assessorsParcelNumber, String userdefined31, String userdefined32, String offMarketDate, String crossStreet,
						String subdivision, String photoURL, int daysonMarket, String rooms, String features) {
		super();
		this.id = id;
		this.listNumber = listNumber;
		this.agencyName = agencyName;
		this.agencyPhone = agencyPhone;
		this.listingAgent = listingAgent;
		this.coListingAgent = coListingAgent;
		this.propertyType = propertyType;
		this.cardFormat = cardFormat;
		this.bookSection = bookSection;
		this.sellingAgency = sellingAgency;
		this.sellingAgent = sellingAgent;
		this.coSellingAgent = coSellingAgent;
		this.endDate = endDate;
		this.dwellingType = dwellingType;
		this.listDate = listDate;
		this.closeofEscrowDate = closeofEscrowDate;
		this.underContractDate = underContractDate;
		this.fallthroughDate = fallthroughDate;
		this.status = status;
		this.statusChangeDate = statusChangeDate;
		this.tempOffMarketDate = tempOffMarketDate;
		this.cancelDate = cancelDate;
		this.uCB = uCB;
		this.contingentRem = contingentRem;
		this.originalListPrice = originalListPrice;
		this.listPrice = listPrice;
		this.soldPrice = soldPrice;
		this.pricePerSqFt = pricePerSqFt;
		this.lowPrice = lowPrice;
		this.assessedVal = assessedVal;
		this.terms = terms;
		this.financing = financing;
		this.mapCodeGrid = mapCodeGrid;
		this.lockBoxNbr = lockBoxNbr;
		this.houseNumber = houseNumber;
		this.bldgNumber = bldgNumber;
		this.compass = compass;
		this.streetName = streetName;
		this.unitNumber = unitNumber;
		this.stDirSfx = stDirSfx;
		this.stSuffix = stSuffix;
		this.subAgentDollarPercentage = subAgentDollarPercentage;
		this.cityTownCode = cityTownCode;
		this.stateProvince = stateProvince;
		this.countyCode = countyCode;
		this.country = country;
		this.zipCode = zipCode;
		this.geoCounty = geoCounty;
		this.geoBlock = geoBlock;
		this.geoLat = geoLat;
		this.geoLon = geoLon;
		this.approxSqft = approxSqft;
		this.sqft1 = sqft1;
		this.sqft2 = sqft2;
		this.bedroomsPlus = bedroomsPlus;
		this.sqft4 = sqft4;
		this.yearBuilt = yearBuilt;
		this.style = style;
		this.buyerBrokerDollarPercentage = buyerBrokerDollarPercentage;
		this.apxLotSizeRange = apxLotSizeRange;
		this.lotAcres = lotAcres;
		this.buyerBroker = buyerBroker;
		this.subagents = subagents;
		this.variableCommission = variableCommission;
		this.stories = stories;
		this.totalRooms = totalRooms;
		this.numberBedrooms = numberBedrooms;
		this.numberBathrooms = numberBathrooms;
		this.numberofInteriorLevels = numberofInteriorLevels;
		this.exteriorStories = exteriorStories;
		this.baths34 = baths34;
		this.sourceApxLotSqFt = sourceApxLotSqFt;
		this.garageStall = garageStall;
		this.pool = pool;
		this.zoning = zoning;
		this.taxes = taxes;
		this.taxYear = taxYear;
		this.legalSubdivision = legalSubdivision;
		this.publicRemarks = publicRemarks;
		this.privateRmksDND2 = privateRmksDND2;
		this.assessorNumber = assessorNumber;
		this.legal = legal;
		this.directions = directions;
		this.ownrOccNameDND2 = ownrOccNameDND2;
		this.ownerOccPhnDND2 = ownerOccPhnDND2;
		this.marketingName = marketingName;
		this.builderName = builderName;
		this.modTimestamp = modTimestamp;
		this.assessorParcelLtr = assessorParcelLtr;
		this.outofAreaSchlDst = outofAreaSchlDst;
		this.sourceofSqFt = sourceofSqFt;
		this.userdefined4 = userdefined4;
		this.taxMunicipality = taxMunicipality;
		this.auction = auction;
		this.horses = horses;
		this.userdefined8 = userdefined8;
		this.ownership = ownership;
		this.hundredBlock = hundredBlock;
		this.type = type;
		this.elementarySchool = elementarySchool;
		this.jrHighSchool = jrHighSchool;
		this.highSchool = highSchool;
		this.elemSchoolDistNumber = elemSchoolDistNumber;
		this.highSchoolDistNumber = highSchoolDistNumber;
		this.model = model;
		this.approxSqFtRange = approxSqFtRange;
		this.hndrdBlkDirectionl = hndrdBlkDirectionl;
		this.zip4 = zip4;
		this.weekAvailTimeshare = weekAvailTimeshare;
		this.compToAgent = compToAgent;
		this.comptoSubagent = comptoSubagent;
		this.comptoBuyerBroker = comptoBuyerBroker;
		this.otherCompensation = otherCompensation;
		this.guestHouseSqFt = guestHouseSqFt;
		this.approxLotSqFt = approxLotSqFt;
		this.userdefined27 = userdefined27;
		this.assessorsBookNumber = assessorsBookNumber;
		this.assessorsMapNumber = assessorsMapNumber;
		this.assessorsParcelNumber = assessorsParcelNumber;
		this.userdefined31 = userdefined31;
		this.userdefined32 = userdefined32;
		this.offMarketDate = offMarketDate;
		this.crossStreet = crossStreet;
		this.subdivision = subdivision;
		this.photoURL = photoURL;
		this.daysonMarket = daysonMarket;
		this.rooms = rooms;
		this.features = features;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getPrivateRmksDND2() {
		return privateRmksDND2;
	}
	public void setPrivateRmksDND2(String privateRmksDND2) {
		this.privateRmksDND2 = privateRmksDND2;
	}
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
	public float getAssessorsBookNumber() {
		return assessorsBookNumber;
	}
	public void setAssessorsBookNumber(float assessorsBookNumber) {
		this.assessorsBookNumber = assessorsBookNumber;
	}
	public float getAssessorsMapNumber() {
		return assessorsMapNumber;
	}
	public void setAssessorsMapNumber(float assessorsMapNumber) {
		this.assessorsMapNumber = assessorsMapNumber;
	}
	public float getAssessorsParcelNumber() {
		return assessorsParcelNumber;
	}
	public void setAssessorsParcelNumber(float assessorsParcelNumber) {
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
	
}
