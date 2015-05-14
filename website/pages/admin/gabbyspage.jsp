<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.AdminPage, com.gs.models.Listing, com.gs.models.OpenHouse" %>

<% AdminPage adminPage = new AdminPage(request, session); %>

<% if (adminPage.getRunPage()) { %>
	<%@ include file="/pages/admin/inc_gabbyspage.jsp" %>
<% } %>