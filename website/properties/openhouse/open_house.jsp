<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing,com.gs.pages.OpenHousePage, com.gs.pages.base.PageSessionSingleton" %>


<% OpenHousePage openHousePage = new OpenHousePage(request, response, session, application); %>

<% if (openHousePage.getRunPage()) { %>
	<%@ include file="/properties/openhouse/inc_open_house.jsp" %>
<% } %>