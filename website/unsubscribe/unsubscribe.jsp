<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.UnsubscribePage, com.gs.pages.base.PageSessionSingleton" %>

<% UnsubscribePage unsubscribePage = new UnsubscribePage(request); %>

<% if (unsubscribePage.getRunPage()) { %>
	<%@ include file="/unsubscribe/inc_unsubscribe.jsp" %>
<% } %>