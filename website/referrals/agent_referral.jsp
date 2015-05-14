<%
response.setHeader("Expires", new java.util.Date().toString());
response.setHeader("Cache-Control", "no-cache, must-revalidate");
response.setHeader("Pragma", "no-cache");
%>
<%@ page language="java" buffer="64kb"%>
<%@ page import="java.util.*,com.gs.pages.AgentReferralPage, com.gs.pages.base.PageSessionSingleton" %>

<% AgentReferralPage agentReferralPage = new AgentReferralPage(request, response, session, application); %>

<% if (agentReferralPage.getRunPage()) { %>
	<%@ include file="/referrals/inc_agent_referral_page.jsp" %>
<% } %>