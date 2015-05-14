<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.FeaturedListingsPage" %>
<%@ page import="com.gs.models.Listing" %>
<%@ page import="java.util.*" %>

<% Listing listing = null; %>

<% FeaturedListingsPage featuredListingsPage = new FeaturedListingsPage(request, response, session, application); %>

<% if (featuredListingsPage.getRunPage()) { %>
	<%@ include file="/properties/featured/inc_featured_listings.jsp" %>
<% } %>