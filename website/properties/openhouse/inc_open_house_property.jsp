<div class="dynamicListing clearfix stripeDL">
	<a href="#" class="property" style="display:none;"></a>
	<div class="imageHolder">
		<img src="<%= openHousePage.getListing().getPhotoURL() %>" border="0"/></a>
	</div>
	<div class="detailsHolder">
		<h3 style="color:#762D30; font-weight:bold; text-transform:uppercase;font-size:14px;display:block;" >&nbsp;</h3>
			<span class="listingAddress"><a href="#"><%= openHousePage.getListing().getFullStreetAddress() %></a></span>
			<span class="listingNeighborhood"><%= openHousePage.getListing().getCityStateZip() %></span><br/>
		<div class="featuresHolder">
			<%= openHousePage.getListing().getNumberBedrooms() %> Beds | <%= openHousePage.getListing().getNumberBathrooms() %> Baths | <%= openHousePage.getListing().getApprxSqftInt() %> sq.ft <br />
			<br />
			<span>MLS #<%= openHousePage.getListing().getListNumber() %></span>
		</div>        
	</div> 
	<div class="availabilityHolder">
		<span class="listingPrice"><%= openHousePage.getListing().getListPriceFormatted() %></span>
		<br /><br /><br /><br /><br />
		<a href="<%= openHousePage.getListing().getMlsUrl() %>" target="_blank">Click Here for Details</a>
	</div>
</div>