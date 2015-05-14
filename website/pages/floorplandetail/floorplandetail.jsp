<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.FloorPlanDetailPage" %>

<% FloorPlanDetailPage floorPlanDetailPage = new FloorPlanDetailPage(request); %>

<% if (floorPlanDetailPage.getRunPage()) { %>
	<%@ include file="/pages/floorplandetail/inc_floorplan_detail.jsp" %>
<% } %>