<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.ThankYouPage, com.gs.pages.base.PageSessionSingleton" %>

<% ThankYouPage thankYouPage = new ThankYouPage(request); %>

<% if (thankYouPage.getRunPage()) { %>
	<%@ include file="/referrals/inc_thank_you.jsp" %>
<% } %>