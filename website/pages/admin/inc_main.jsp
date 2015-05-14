<div id="CreateOpenHouseContainer" style="display:none">

		House To Hold Open: 
			<select id="listingId">
				<% for (Listing listing : adminPage.getListings()) { %>
						<option value="<%= listing.getId() %>"><%= listing.getFullStreetAddress() %></option>
				<% } %>
			</select>
		<br />
		Open House Start (date and time): <input type="datetime-local" name="openhousestarttime" id="openhousestarttime">
		<br />
		Open House End (date and time): <input type="datetime-local" name="openhouseendtime" id="openhouseendtime">
		<br />
		<input type="submit" id="openhousesubmit">
		
</div>

<div id="ViewOpenHousesContainer" style="display:none">
	<style>
		table,th,td {
			border:1px solid black;
		}
		th {
			text-align:left;
		}
	</style>
	
	<table id="openhousetable" style="width:800px">
		<tr>
  			<th>Property</th>
  			<th>Start Date / Time</th> 
  			<th>End Date / Time</th>
		</tr>
			<% for (OpenHouse openHouse : adminPage.getOpenHouses()) { %>
				<tr><td> <%= openHouse.getAddress() %></td><td> <%= openHouse.getStartDate() %></td><td> <%= openHouse.getEndDate() %> </td><td><a id="<%= openHouse.getId() %>" class="editlink" href="#">EDIT</a></td><td><a id="<%= openHouse.getId() %>" class="deletelink" href="#">DELETE</a></td></tr>
			<% } %>
	</table>
</div>