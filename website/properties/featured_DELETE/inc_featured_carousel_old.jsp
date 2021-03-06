<script>
$(document).ready(function(){
 	$('.bxslider').bxSlider({
  		minSlides: 1,
  		maxSlides: 1,
  		speed: 750,  
  		auto: true,
  		autoControls: true,
  		pager: false,
  		slideWidth: 647,
  		adaptiveHeight: true,
  		slideMargin: 10
	});
});
</script>
<ul class="bxslider">
<%  Iterator<CsvMlsListing> listingsIt = featuredPage.getListings().iterator();
	CsvMlsListing listing = null;
	while (listingsIt.hasNext()) { 
		listing = listingsIt.next();
%>					
		<li>	
			<div class="dynamicListing clearfix stripeDL">
				<a href="#" class="property" style="display:none;"></a>
				<div class="imageHolder">
					<a href="#"><img src="<%= listing.getPhotoURL() %>= " border="0"/></a>
				</div>
				<div class="detailsHolder">
					<h3 style="color:#762D30; font-weight:bold; text-transform:uppercase;font-size:14px;display:block;" >&nbsp;</h3>
						<span class="listingAddress"><a href="http://www.sandrawilken.com/rets-properties/4833669/6721-e-cheney-drive-/"><%= listing.getFullStreetAddress() %></a></span>
					<span class="listingNeighborhood"><%= listing.getCityStateZip() %></span><br/>
					<div class="featuresHolder">
						<%= listing.getNumberBedrooms() %> Beds   | <%= listing.getNumberBathrooms() %> Baths  | <%= listing.getSqft1() %> sq.ft<br /><br /><span>MLS #<%= listing.getListNumber() %></span>
					</div>        
				</div> 
				<div class="availabilityHolder">
					<span class="listingPrice"><%= listing.getListPriceFormatted() %></span><br />
				</div>
			</div>
		</li>				
<%
	}
%>
</ul>