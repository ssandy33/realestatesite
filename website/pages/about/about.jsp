<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.FeaturedPage" %>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing,com.gs.pages.AboutPage" %>

<% AboutPage aboutPage = new AboutPage(request, response, session, application); %>

<% if (aboutPage.getRunPage()) { %>
	<%@ include file="/pages/about/inc_about.jsp" %>
<% } %>