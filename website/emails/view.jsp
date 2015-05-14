<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.ViewEmailPage, com.gs.pages.base.PageSessionSingleton" %>

<% ViewEmailPage viewEmailPage = new ViewEmailPage(request); %>

<% if (viewEmailPage.getRunPage()) { %>
	<%@ include file="/emails/inc_viewemail.jsp" %>
<% } %>