package com.gs.models;

import java.sql.Date;

import com.gs.database.CvsMlsListingsDAO;

public class Listing extends BaseModel {
	
	public Listing(String agencyName, String agencyPhone, String listingAgent, String coListingAgent, Date listDate, String originalListPrice, String listPrice,
			float pricePerSqFt, String houseNumber, String compass, String streetName, String stSuffix, String cityTownCode, String stateProvince, String countyCode, String country,
			String zipCode, String approxSqft, int numberBedrooms, float numberBathrooms, String legalSubdivision, String builderName, String model, String photoURL, int listNumber,
			String yearBuilt, String publicRemarks, String approxLotSqFt, float taxes, String features, String mlsUrl, String openDates, String pool, String bookSection, 
			String marketingName, String elementary, String jrHigh, String highSchool, String directions, Date taxYear, float taxAmount, int assessorsBookNumber,
			int assessorsMapNumber, int assessorsParcelNumber, String ownerShip, String mainImage) {
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
		this.garage = parseGarage(features);
		this.construction = parseConstruction(features);
		this.mlsUrl = mlsUrl;
		this.openDates = openDates;
		this.pool = pool;
		this.bookSection = bookSection;
		this.status_id = 1;
		this.marketingName = marketingName;
		this.utilities = parseUtilities(features);
		this.elementarySchool = elementary;
		this.jrHighSchool = jrHigh;
		this.highSchool = highSchool;
		this.masterBath = parseMasterBath(features);
		this.flooring = parseflooring(features);
		this.interiorFeatures = parseInteriorFeatures(features);
		this.exterior = parseExterior(features);
		this.lotView = parseLotView(features);
		this.fencing = parseFencing(features);
		this.hoaName = parseHoaName(features);
		this.directions = directions;
		this.assessorsBookNumber = assessorsBookNumber;
		this.assessorsMapNumber = assessorsMapNumber;
		this.assessorsParcelNumber = assessorsParcelNumber;
		this.associationFee = parseAssociationFee(features);
		this.ownership = ownerShip;
		this.constructionFinish = parseConstructionFinish(features);
		this.diningArea = parseDiningArea(features);
		this.taxYear = taxYear;
		this.mainImage = mainImage;
	}
	
	public Listing(int listNumber, String agencyName, String agencyPhone, String listingAgent, String coListingAgent,
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
						String guestHouseSqFt, String approxLotSqFt, String userdefined27, int assessorsBookNumber, int assessorsMapNumber,
						int assessorsParcelNumber, String userdefined31, String userdefined32, String offMarketDate, String crossStreet,
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
		this.status_id = 1;
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
//		this.privateRmksDND2 = privateRmksDND2;
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
}
