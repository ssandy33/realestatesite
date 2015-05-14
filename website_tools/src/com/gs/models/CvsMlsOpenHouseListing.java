package com.gs.models;

import java.sql.Date;

public class CvsMlsOpenHouseListing extends BaseModel {
	private String mlsUrl;
	private String openDates;
	
	public CvsMlsOpenHouseListing(String agencyName, String agencyPhone, String listingAgent, String coListingAgent, Date listDate, String originalListPrice, String listPrice,
			float pricePerSqFt, String houseNumber, String compass, String streetName, String stSuffix, String cityTownCode, String stateProvince, String countyCode, String country,
			String zipCode, String approxSqft, int numberBedrooms, float numberBathrooms, String legalSubdivision, String builderName, String model, String photoURL, int listNumber,
			String yearBuilt, String publicRemarks, String approxLotSqFt, float taxes, String features, String mlsUrl, String openDates, String pool, String bookSection, 
			String marketingName, String elementary, String jrHigh, String highSchool, String directions, Date taxYear, float taxAmount, int assessorsBookNumber,
			int assessorsMapNumber, int assessorsParcelNumber, String ownerShip) {
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
		this.garage = parseGarage(features);
		this.construction = parseConstruction(features);
		this.sewer = parseSewerFeatures(features);
		this.mlsUrl = mlsUrl;
		this.openDates = openDates;
		this.hoaName = parseHoaName(features);
	}
}
