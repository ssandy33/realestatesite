<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.FeaturedPage" %>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing,com.gs.pages.FeaturedPage, com.gs.pages.base.PageSessionSingleton" %>


<% FeaturedPage featuredPage = new FeaturedPage(request, response, session, application); %>

<% if (featuredPage.getRunPage()) { %>
	<%@ include file="/properties/featured/inc_featured.jsp" %>
<% } %>