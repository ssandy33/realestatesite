<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="com.gs.pages.ContactPage" %>
<%@ page import="java.util.*,com.gs.models.CsvMlsListing" %>

<% ContactPage contactPage = new ContactPage(request, response, session, application); %>

<% if (contactPage.getRunPage()) { %>
	<%@ include file="/about/inc_contact.jsp" %>
<% } %>