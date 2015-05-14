<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.FeaturedPage" %>
<%@ page import="java.util.*, com.gs.pages.RecentActivityPage, com.gs.pages.base.PageSessionSingleton" %>

<% RecentActivityPage recentActivityPage = new RecentActivityPage(request, response, session, application); %>

<% if (recentActivityPage.getRunPage()) { %>
	<%@ include file="/recentactivity/inc_recent_activity.jsp" %>
<% } %>