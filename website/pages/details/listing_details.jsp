<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing,com.gs.pages.ListingDetailPage,java.io.File" %>

<% ListingDetailPage listingDetailPage = new ListingDetailPage(request, response, session, application); %>

<% if (listingDetailPage.getRunPage()) { %>
	<%@ include file="/pages/details/inc_listing_details.jsp" %>
<% } %>