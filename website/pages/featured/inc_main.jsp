<div id="featured_listings">
	<%
	Iterator<Listing> listingsIt = featuredListingsPage.getListings().iterator();
	
	while (listingsIt.hasNext()) { 
	listing = listingsIt.next();
	%>
		<div id="listing">
			<img class="thumblisting" src="<%= listing.getMainImage() %>" border="0"/>
			<p id="listingarea"><%= listing.getLegalSubdivision() %></p>
			<p id="listingprice"><%= listing.getListPriceFormatted() %></p>
			<hr id="listinghr">
			<p id="listingaddressvalue"><%= listing.getFullStreetAddress() %>  <%= listing.getCityStateZip() %></p>
			<p id="listingstatuslabel">Status:</p><p id="listingstatusvalue"><%= listing.getStatus() %></p>
			<p id="listingtypelabel">Type:</p><p id="listingtypevalue">Single Family</p>
			
			<p id="listingbedlabel">Bedrooms:</p><p id="listingbedvalue"><%= listing.getNumberBedrooms() %></p>
			<p id="listingbathlabel">Bathrooms:</p><p id="listingbathvalue"><%= listing.getNumberBathrooms() %></p>
			<p id="listingsqftlabel">SQFT:</p><p id="listingsqftvalue"><%= listing.getSqftFormatted() %></p>
			<p id="listingyearlabel">Year Built:</p><p id="listingyearvalue"><%= listing.getYearBuilt() %></p>
			<div id="listingcalltoaction">
				<a class="modalbox<%= listing.getId() %>" href="#inline"><img id="informationlisting" src="/images/listings/requestinformation.gif" border="0"/></a>
				<script type="text/javascript">
				$(".modalbox<%= listing.getId() %>").click(function() {
					$("#requestshowinglistingid").val(<%= listing.getId() %>);
					$(".address").html("<%= listing.getFullStreetAddress() %> <br/>  <%= listing.getCityStateZip() %>");
					$(".modalbox<%= listing.getId() %>").fancybox();
				});
				</script>
				<% if (listing.hasFloorPlanImage()) { %>
					<div id=floorplandiv>
						<a id="floorplan" class="lightview" href="<%= listing.getFloorPlanImageUrl() %>"><img src="/images/global/floorplan.jpg"><div id="floorplantxt">view<br/>floorplan</div></a>
					</div>
				<% } %>
				<a href="/listingdetails?listing=<%= listing.getId() %>" id="listingview">View This Listing>></a>
			</div>
		</div>
    		<% } %>
</div>