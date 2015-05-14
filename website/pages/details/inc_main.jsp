<div id="my-folio-of-works" class="svwp">
	<ul>
		<% for (Iterator<File> iter = listingDetailPage.getListing().getListingImagesIterator(); iter.hasNext(); ) { %>
			<% File file = iter.next(); %>
			<li><img width="473" height="350" alt="Gabby Sandy" src='<%= listingDetailPage.getListing().getImageDirectory() %><%= java.net.URLDecoder.decode(file.getName().trim()) %>' /></li>
		<% } %>
	</ul>
</div>
<div id="address_price_details">
	<p id="listing_address"><%= listingDetailPage.getListing().getFullStreetAddress() %>  <%= listingDetailPage.getListing().getCityStateZip() %></p>
	<p id="listing_price"><%= listingDetailPage.getListing().getListPriceFormatted() %></p>
	<a href="/featured" id="listingview">&lt;&lt;Back To Listing</a>
	<a class="modalbox" href="#inline"><img id="informationlisting" src="/images/listings/requestinformation.gif" border="0"/></a>
		<script type="text/javascript">
			$(".modalbox").click(function() {
				$("#requestshowinglistingid").val(<%= listingDetailPage.getListing().getId() %>);
				$(".address").html("<%= listingDetailPage.getListing().getFullStreetAddress() %> <br/>  <%= listingDetailPage.getListing().getCityStateZip() %>");
				$(".modalbox").fancybox();
			});
		</script>
		<% if (listingDetailPage.getListing().hasFloorPlanImage()) { %>
			<a id="floorplan" style="margin-left: 20px;" class="lightview" href="<%= listingDetailPage.getListing().getFloorPlanImageUrl() %>"><img src="/images/global/floorplan.jpg"></a>
		<% } %>
	
	<!-- <img id="informationlisting" src="/images/listings/requestinformation.gif" border="0"/>  -->
</div>

<div id="interior_features">
	<p id="interior_features_header">Interior Features</p>
	<div class="cont">
		<div class="left">Appliances:</div>
		<div class="left"><%= listingDetailPage.getListing().getAppliances() %></div>
		<div class="clear"></div>
		<div class="left">Flooring:</div>
		<div class="left"><%= listingDetailPage.getListing().getFlooring() %></div>
		<div class="clear"></div>
		<div class="left">Cooling:</div>
		<div class="left"><%= listingDetailPage.getListing().getCooling() %></div>
		<div class="clear"></div>
		<div class="left">Heating:</div>
		<div class="left"><%= listingDetailPage.getListing().getHeating() %></div>
		<div class="clear"></div>
		<div class="left">Fireplaces:</div>
		<div class="left"><%= listingDetailPage.getListing().getFireplaces() %></div>
		<div class="clear"></div>
		<div class="left">Additional Interior Features:</div>
		<div class="left"><%= listingDetailPage.getListing().getInteriorFeatures() %></div>
		<div class="clear"></div>
	</div>
</div>


<div id="community_features">
	<p id="community_features_header">Community Features</p>
	<div class="cont">
		<div class="left">Community Amenities:</div>
		<div class="left"><%= listingDetailPage.getListing().getCommunityFeatures() %></div>
		<div class="clear"></div>
		<div class="left">Association Name:</div>
		<div class="left"><%= listingDetailPage.getListing().getHoaName() %></div>
		<div class="clear"></div>
	</div>
</div>