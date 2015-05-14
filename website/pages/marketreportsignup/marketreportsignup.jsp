<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.MarketReportSignupPage" %>

<% MarketReportSignupPage marketReportSignupPage = new MarketReportSignupPage(request, response, session, application); %>

<% if (marketReportSignupPage.getRunPage()) { %>
	<%@ include file="/pages/marketreportsignup/inc_marketreportsignup.jsp" %>
<% } %>