<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<meta name="author" content="Shawn Sandy">

<%@ include file="/includes/inc_ga.jsp"%>

<style media="all" type="text/css">
	@import url("/css/general/general.css");
	@import url("/css/general/header.css");
	@import url("/css/general/footer.css");
	@import url("/css/general/request.css");
	@import url("/css/featured/featured.css");
	@import url("/fancybox/jquery.fancybox.css");
	@import url("/css/lightview/lightview.css");
</style>

<title>Gabby's Listings</title>
	
	<link rel="stylesheet" href="css/svwp_style.css" type="text/css" media="screen" /> 
	<script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
	<script type='text/javascript' src="js/jquery.slideViewerPro.1.5.js"></script>
	<script type='text/javascript' src="js/jquery.timers.js"></script>
  	<script type="text/javascript" src="fancybox/jquery.fancybox.js?v=2.0.6"></script>
  	<script type="text/javascript" src="/js/lightview/lightview.js"></script>

</head>
<body>
	<div id="wrapper">
		<%@ include file="/pages/common/inc_request_info.jsp" %>
		<div id="header">
			<%@ include file="/pages/common/header.jsp" %>
		</div>
		<div id="sidebar">
			<%@ include file="/pages/featured/inc_sidebar.jsp" %>
		</div>
		<div id="right-column">
			<%@ include file="/pages/featured/inc_main.jsp" %>
		</div>
		<div id="footer">
			<%@ include file="/pages/common/footer.jsp" %>
		</div>
	</div>
</body>
</html>