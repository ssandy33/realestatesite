<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.FloorPlanPage, com.gs.models.FloorPlanDetail, com.gs.models.Community, com.gs.pages.base.PageSessionSingleton" %>

<% FloorPlanPage floorPlanPage = new FloorPlanPage(request); %>
<% int count = 0; %>

<% if (floorPlanPage.getRunPage()) { %>
	<%@ include file="/pages/floorplan/inc_floorplan.jsp" %>
<% } %>