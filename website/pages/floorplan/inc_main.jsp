<div class="container">
<% 	for (Iterator<Community> iter = floorPlanPage.getCommunities().iterator(); iter.hasNext(); ) { %>
<% 		Community community = iter.next(); %>
		<div id="<%= community.getAbbreviation() %>" <% if (count != 0) { %> style="display:none" <% } %> >
			<table>
	  			<thead>
	    			<tr><th colspan="5"><%= community.getName() %> Floor Plans</th></tr>
	  			</thead>
	  			<tbody>
	  			<% if (community.hasFloorPlanDetails()) { %>
	  				<% 	for (Iterator<FloorPlanDetail> iter2 = community.getFloorPlanDetails().iterator(); iter2.hasNext(); ) { %>
	  				<% FloorPlanDetail floorPlanDetail = iter2.next(); %>
	  					<tr>
	  						<td colspan="1"><a href="/floorplandetails?fp=<%= floorPlanDetail.getId() %>" class="button"><%= floorPlanDetail.getName() %></a></td>
	  						<td colspan="1"><%= floorPlanDetail.getSquareFeet() %> SQ FT</td>
	  						<td colspan="1"><%= floorPlanDetail.getBedRooms() %> Bed Rooms</td>
	  						<td colspan="1"><%= floorPlanDetail.getBathRooms() %> Bath Rooms</td>
	  						<td colspan="1"><a href="/floorplandetails?fp=<%= floorPlanDetail.getId() %>" class="button">View</a></td>
	  					</tr>
	  				<% } %>
	  			<% } else { %>
	  				<tr>
	  					<td colspan="1"></td>
	  					<td colspan="3">Comming Soon</td>
	  					<td colspan="1"></td>
	  				</tr>
	  			<% } %>
	  			</tbody>
			</table>
		</div>
		<% count++; %>
<% } %>
</div>