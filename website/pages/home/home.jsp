<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.FeaturedPage" %>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing,com.gs.pages.HomePage, com.gs.pages.base.PageSessionSingleton" %>

<% HomePage homePage = new HomePage(request, response, session, application); %>

<% if (homePage.getRunPage()) { %>
	<%@ include file="/pages/home/inc_home.jsp" %>
<% } %>