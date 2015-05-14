<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style media="all" type="text/css">
	@import url("/css/reset.css");
	@import url("/css/clearfix.css");
	@import url("/css/global.css");
	@import url("/css/classes.css");
	
	/* Layout */
	@import url("/css/header.css");
	@import url("/css/footer.css");
	
</style>
<title>Gabby Sandy</title>
<%@include file="/includes/header.jsp"%>
</head>
<body style='font-family:Georgia, "Times New Roman", Times, serif;'>
	<%@ include file="/includes/header.jsp" %>

	<div id="content" class="innerwrapper pages clearfix">
		<div class="column-1b column">
			<div class="shadow module type-1 clearfix">
				<h2 class="title" style="color:#762d30; text-transform:uppercase;"><%= recentActivityPage.getCommunity().getName()  %></h2>
				<ul class="sidenav clearfix">
					<li><a <% if (recentActivityPage.getImageId() == 1) { %> class="current" href="#"<% } else { %> class="" href="/recentactivity?com=<%= recentActivityPage.getCommunity().getId() %>&im=1" <% } %> >Total Listings</a></li>
					<li><a <% if (recentActivityPage.getImageId() == 2) { %> class="current" href="#"<% } else { %> class="" href="/recentactivity?com=<%= recentActivityPage.getCommunity().getId() %>&im=2" <% } %> >Active</a></li>
					<li><a <% if (recentActivityPage.getImageId() == 3) { %> class="current" href="#"<% } else { %> class="" href="/recentactivity?com=<%= recentActivityPage.getCommunity().getId() %>&im=3" <% } %> >Sold By</a></li>
					<li><a <% if (recentActivityPage.getImageId() == 4) { %> class="current" href="#"<% } else { %> class="" href="/recentactivity?com=<%= recentActivityPage.getCommunity().getId() %>&im=4" <% } %> >Closed</a></li>
				</ul>
			</div>
		</div>
		<div class="column-2b column">
			<div style="width:900px;">
				<% if (recentActivityPage.getImageId() == 1) { %>
					<img src="/images/recentactivity/<%= recentActivityPage.getCommunity().getAbbreviation() %>/Total.png">
				<% } else if (recentActivityPage.getImageId() == 2) { %>
					<img src="/images/recentactivity/<%= recentActivityPage.getCommunity().getAbbreviation() %>/Active.png">
				<% } else if (recentActivityPage.getImageId() == 3) { %>
					<img src="/images/recentactivity/<%= recentActivityPage.getCommunity().getAbbreviation() %>/Solds.png">
				<% } else if (recentActivityPage.getImageId() == 4) { %>
					<img src="/images/recentactivity/<%= recentActivityPage.getCommunity().getAbbreviation() %>/Closed.png">
				<% } %>
			</div>
		</div>
	</div>
	<div class="push"></div>

	<%@ include file="/includes/footer.jsp"%>
</body>
</html>