<div id="tabs">
		<div id="interior_details">
			<p id="listing_details_header">Listing Information</p>
			<div class="cont">
				<div class="left">Bedrooms:</div>
				<div class="left"><%= listingDetailPage.getListing().getNumberBedrooms() %></div>
				<div class="clear"></div>
				<div class="left">Estimated Square Feet:</div>
				<div class="left"><%= listingDetailPage.getListing().getApprxSqftFormatted() %></div>
				<div class="clear"></div>
				<div class="left">Garage:</div>
				<div class="left"><%= listingDetailPage.getListing().getGarage() %></div>
				<div class="clear"></div>
				<div class="left">Floor Plan:</div>
				<div class="left"><%= listingDetailPage.getListing().getMarketingName() %></div>
				<div class="clear"></div>
				<div class="left">Water:</div>
				<div class="left"><%= listingDetailPage.getListing().getWater() %></div>
				<div class="clear"></div>
				<div class="left">Available Utilities:</div>
				<div class="left"><%= listingDetailPage.getListing().getUtilities() %></div>
				<div class="clear"></div>
				<div class="left">Bathrooms:</div>
				<div class="left"><%= listingDetailPage.getListing().getNumberBathrooms() %></div>
				<div class="clear"></div>
				<div class="left">Year Built:</div>
				<div class="left"><%= listingDetailPage.getListing().getYearBuilt() %></div>
				<div class="clear"></div>
				<div class="left">Construction:</div>
				<div class="left"><%= listingDetailPage.getListing().getConstruction() %></div>
				<div class="clear"></div>
				<div class="left">Builder:</div>
				<div class="left"><%= listingDetailPage.getListing().getBuilderName() %></div>
				<div class="clear"></div>
				<div class="left">Sewer:</div>
				<div class="left"><%= listingDetailPage.getListing().getSewer() %></div>
				<div class="clear"></div>
			</div>
		</div>
		<div id="lising_school">
			<p id="listing_school_header">School Information</p>
			<div class="cont">
				<div class="left">Elementary:</div>
				<div class="left"><%= listingDetailPage.getListing().getElementarySchool() %></div>
				<div class="clear"></div>
				<div class="left">Middle:</div>
				<div class="left"><%= listingDetailPage.getListing().getJrHighSchool() %></div>
				<div class="clear"></div>
				<div class="left">High:</div>
				<div class="left"><%= listingDetailPage.getListing().getHighSchool() %></div>
				<div class="clear"></div>
			</div>
		</div>
		
		<div id="listing_room">
			<p id="listing_room_header">Room Information</p>
			<div class="cont">
				<div class="left">Dining:</div>
				<div class="left"><%= listingDetailPage.getListing().getDiningArea() %></div>
				<div class="clear"></div>
				
				<div class="left">Kitchen:</div>
				<div class="left"><%= listingDetailPage.getListing().getKitchenFeatures() %></div>
				<div class="clear"></div>
				
				<div class="left">Master Bath:</div>
				<div class="left"><%= listingDetailPage.getListing().getMasterBath() %></div>
				<div class="clear"></div>
			</div>
		</div>
		
		
		<div id="exterior_features">
			<p id="exterior_features_header">Exterior Features</p>
			<div class="cont">
				<div class="left">Parking:</div>
				<div class="left"><%= listingDetailPage.getListing().getParkingFeatures() %></div>
				<div class="clear"></div>				
				<div class="left">Exterior:</div>
				<div class="left"><%= listingDetailPage.getListing().getConstructionFinish() %></div>
				<div class="clear"></div>			
				<div class="left">Roof:</div>
				<div class="left"><%= listingDetailPage.getListing().getRoofing() %></div>
				<div class="clear"></div>			
				<div class="left">Personal Pool:</div>
				<div class="left"><%= listingDetailPage.getListing().getPool() %></div>
				<div class="clear"></div>			
				<div class="left">Lot View:</div>
				<div class="left"><%= listingDetailPage.getListing().getLotView() %></div>
				<div class="clear"></div>				
				<div class="left">Fence:</div>
				<div class="left"><%= listingDetailPage.getListing().getFencing() %></div>
				<div class="clear"></div>				
				<div class="left">Additional Features:</div>
				<div class="left"><%= listingDetailPage.getListing().getExteriorFeatures() %></div>
				<div class="clear"></div>	
			</div>
		</div>
		<div id="financial_considerations">
			<p id="financial_considerations_header">Financial Considerations</p>
			<div class="cont">
				<div class="left">Association Fee:</div>
				<div class="left"><%= listingDetailPage.getListing().getAssociationFee() %></div>
				<div class="clear"></div>
				<div class="left">Tax/Property ID:</div>
				<div class="left"><%= listingDetailPage.getListing().getTaxId() %></div>
				<div class="clear"></div>
				<div class="left">Ownership Type:</div>
				<div class="left"><%= listingDetailPage.getListing().getOwnership() %></div>
				<div class="clear"></div>
				<div class="left">Tax Amount:</div>
				<div class="left"><%= listingDetailPage.getListing().getTaxesFormatted() %></div>
				<div class="clear"></div>
				<div class="left">Tax Year:</div>
				<div class="left"><%= listingDetailPage.getListing().getTaxYearFormatted() %></div>
				<div class="clear"></div>
			</div>
		</div>
		<div id="driving_directions">
			<p id="driving_directions_header">Driving Directions</p>
			<p id="listing_details_left"><%= listingDetailPage.getListing().getDirections() %></p>
		</div>
		
		<div id="lising_remarks">
			<p id="listing_remarks_header">Remarks</p>
			<p id="listing_details_left"><%= listingDetailPage.getListing().getPublicRemarks() %></p>
		</div>
	</div>