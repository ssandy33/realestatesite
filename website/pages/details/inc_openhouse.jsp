<% if (listingDetailPage.getListing().getOpenHouse() != null) { %>

<span class="open-house-verbiage">I'll be showing this house on</span>
<span class="open-house-start-time"><%= listingDetailPage.getListing().getOpenHouse().getStartDateFormatted() %></span>
<span class="open-house-verbiage">from</span>
<span class="open-house-start-time"><%= listingDetailPage.getListing().getOpenHouse().getStartTimeFormatted() %></span>
<span class="open-house-verbiage">until</span>
<span class="open-house-start-time"><%= listingDetailPage.getListing().getOpenHouse().getEndTimeFormatted() %></span>

<% } %>