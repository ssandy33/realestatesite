<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-Transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style media="all" type="text/css">
	@import url("/css/general/general.css");
	@import url("/css/general/header.css");
	@import url("/css/general/footer.css");
	@import url("/css/floorplan/floorplan.css");
</style>

<title>Floor Plans</title>

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<%@ include file="/pages/common/header.jsp" %>
		</div>
		<div id="sidebar">
			<%@ include file="/pages/floorplan/inc_sidebar.jsp" %>
		</div>
		<div id="right-column">
			<%@ include file="/pages/floorplan/inc_main.jsp" %>
		</div>
		<div id="footer">
			<%@ include file="/pages/common/footer.jsp" %>
		</div>
	</div>
	
	<script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
	<script type='text/javascript' src="/pages/floorplan/inc_functions.js"></script>
</body>
</html>