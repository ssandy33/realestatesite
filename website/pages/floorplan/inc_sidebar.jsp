<div id="agentprofile-widget">
  <ul id="site_nav">
<% 	for (Iterator<Community> iter = floorPlanPage.getCommunities().iterator(); iter.hasNext(); ) { %>
<% 		Community community = iter.next();  													   %>
		<li><a href="#<%= community.getAbbreviation() %>"><%= community.getName() %> Floor Plans</a></li>
<% } 																							   %>
  </ul>
</div>
