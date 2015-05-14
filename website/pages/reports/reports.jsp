<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.FeaturedPage" %>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing,com.gs.pages.ReportsPage" %>

<% ReportsPage reportsPage = new ReportsPage(request, response, session, application); %>

<% if (reportsPage.getRunPage()) { %>
	<%@ include file="/pages/reports/inc_reports.jsp" %>
<% } %>