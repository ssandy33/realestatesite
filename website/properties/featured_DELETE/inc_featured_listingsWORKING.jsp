<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-GB">
<head>
	<title>Featured Properties</title>
	<style media="screen" type="text/css">
	
		@import url("/css/header.css");
		@import url("/css/general.css");
		@import url("/css/listing_details.css");
		@import url("/css/footer.css");
	
	</style>
	<!--[if lt IE 7]>
	<style media="screen" type="text/css">
	#container {
		height:100%;
	}
	</style>
	<![endif]-->
	
	<link rel="stylesheet" href="css/svwp_style.css" type="text/css" media="screen" /> 
	<script type='text/javascript' src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
	<script type='text/javascript' src="js/jquery.slideViewerPro.1.5.js"></script>
	<SCRIPT type='text/javascript' src="js/jquery.timers.js"></SCRIPT>
	
	
	<script type="text/javascript">
		$(window).bind("load", function() {
			$("div#my-folio-of-works").slideViewerPro({
				easeTime: 750, 
				asTimer: 4000, 
				autoslide: false, 
				typo: true, 
				typoFullOpacity: 0.9, 
				galBorderWidth: 3, 
				galBorderColor: "#000000", 
				thumbs: 5, 
				thumbsVis: true, 
				shuffle: false, 
				thumbsPercentReduction: 15, 
				thumbsTopMargin: 3, 
				thumbsRightMargin: 3, 
				thumbsBorderWidth: 3, 
				thumbsBorderColor: "#d8d8d8", 
				thumbsActiveBorderColor: "#ff0000", 
				thumbsBorderOpacity: 0.9, 
				thumbsActiveBorderOpacity: 0.9, 
				buttonsTextColor: "#000000", 
				buttonsWidth: 20, 
				leftButtonInner: "-", 
				rightButtonInner: "+" 
			});
		});
	</script>
	
</head>
<body>

<div id="container">
   <div id="header">
   	<%@ include file="/includes/newheader.jsp" %>
   </div>
   <div id="body">
	<div id="images">
		<div id="my-folio-of-works" class="svwp">
			<ul>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/001 AZTraditions 047.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/002 AZTraditions 033.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/003 AZTraditions 032.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/004 AZTraditions 031.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/001 AZTraditions 047.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/002 AZTraditions 033.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/003 AZTraditions 032.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/004 AZTraditions 031.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/001 AZTraditions 047.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/002 AZTraditions 033.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/003 AZTraditions 032.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/004 AZTraditions 031.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/001 AZTraditions 047.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/002 AZTraditions 033.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/003 AZTraditions 032.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/004 AZTraditions 031.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/001 AZTraditions 047.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/002 AZTraditions 033.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/003 AZTraditions 032.jpg" /></li>
				<li><img width="530" height="350" alt="Gabby Sandy" src="images/listings/aztraditions/004 AZTraditions 031.jpg" /></li>
				<!--eccetera-->
			</ul>
		</div>
	</div>
	<div id="tabs">
		whatever
	</div>
   </div>
   <div id="footer">
   	<%@ include file="/includes/newfooter.jsp" %>
   </div>
</div>


</body>
</html>