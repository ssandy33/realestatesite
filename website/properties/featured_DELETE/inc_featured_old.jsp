<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style media="all" type="text/css">
	@import url("/css/reset.css");
	@import url("/css/clearfix.css");
	@import url("/css/global.css");
	@import url("/css/classes.css");
	@import url("/css/search.css");
	
	/* Layout */
	@import url("/css/header.css");
	@import url("/css/footer.css");
	
</style>
<title>Listing Your Property</title>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<!-- bxSlider Javascript file -->
<script src="/js/jquery.bxslider.min.js"></script>
<!-- bxSlider CSS file -->
<link href="/css/jquery.bxslider.css" rel="stylesheet" />
<%@include file="/includes/header.jsp"%>
</head>
<body style='font-family:Georgia, "Times New Roman", Times, serif;'>
	<%@ include file="/includes/header.jsp" %>
	
	<div id="content" class="innerwrapper pages clearfix">
		<div class="column-1 column">
			<%@ include file="/properties/featured/inc_featured_nav.jsp" %>
		</div>
		<div class="column-2 column">
			<h5 class="page-title bold" style="margin-top:12px; margin-bottom:6px; text-transform:uppercase;">Open House</h5>
			<div style="width:610px;">
				<%@ include file="/properties/featured/inc_featured_carousel.jsp" %>
			</div>
		</div>
	</div>
	<div class="push"></div>

	<%@ include file="/includes/footer.jsp"%>
</body>
</html>