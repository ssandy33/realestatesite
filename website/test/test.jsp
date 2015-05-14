<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style media="all" type="text/css">
	@import url("/css/testheader.css");
	@import url("/css/testfooter.css");
	@import url("/css/testgeneral.css");
	<!-- bjqs.css contains the essential css needed for the slider to work -->
    @import url("/css/bjqs.css");
</style>

<title>Gabby Sandy</title>

<style>
body  {
	background-color:#FFFFFF;
	margin:0;
}

@font-face {
	font-family: socialMediaFont;
	src: url('/fonts/MonoSocialIconsFont-1.10.ttf'),
     	 url('/fonts/MonoSocialIconsFont-1.10.otf'); /* IE9 */
}
</style>


<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<!-- bxSlider Javascript file -->
<script src="/js/jquery.bxslider.min.js"></script>
<!-- bxSlider CSS file -->
<link href="/css/jquery.bxslider.css" rel="stylesheet" />

<script>
$(document).ready(function(){
 	$('.bxslider').bxSlider({
  		minSlides: 1,
  		maxSlides: 1,
  		speed: 1500, 
  		auto: true,
  		autoControls: false,
  		pager: false,
  		slideWidth: 950,
  		adaptiveHeight: false,
  		slideMargin: 10,
  		pause: 8000
	});
});


</script>

</head>

<body style='font-family:Georgia, "Times New Roman", Times, serif'>
	<div id="page-wrapper">
		<%@ include file="/includes/testheader.jsp" %>
		<div id="body-content">
		
<ul class="bxslider">
			
		<li>	
			<div class="dynamicListing clearfix stripeDL">
				<a href="#" class="property" style="display:none;"></a>
				<div class="imageHolder">
					<!-- <a href="#"> --><img src="/slides/slide-four.png" border="0"/><!-- </a> -->
				</div>
			</div>
		</li>				
		<li>	
			<div class="dynamicListing clearfix stripeDL">
				<a href="#" class="property" style="display:none;"></a>
				<div class="imageHolder">
					<img src="/slides/slide-seven.png" border="0"/>
				</div>
			</div>
		</li>				
		<li>	
			<div class="dynamicListing clearfix stripeDL">
				<a href="#" class="property" style="display:none;"></a>
				<div class="imageHolder">
					<img src="/slides/slide-six.png" border="0"/>
				</div>
			</div>
		</li>	
</ul>
		
		<div id="three-boxes">
			<div id="container1">
	   			<img id="show1" src="/images/global/gsclear.png"/>
	   			<div id="contactme">
	   				<a href="http://www.google.com">Contact Me >></a>
	   			</div>
			</div>
			
			<div id="container2">
				<img id="show2" src="/images/global/midyearmarketreporticonsmall.png"/>
				<div class="market">Housing Report</div>
			  	<div class="market-details-2">Sign up for complimentary
            	email reports of neighborhood
            	market trends and statistics.</div>
            	<div class="market-call-to-action-2">
            		<a href="http://www.google.com">Sign Up >></a>
            	</div>
			</div>
			
 			<div id="container3">
				<img id="show3" src="/images/global/in-touch-newslettersmall.png"/>
				<div class="market3">In Touch newsletter</div>
			  	<div class="market-details-3">Get monthly email updates on the
			  	market plus buying, selling and living in Arizona.</div>
            	<div class="market-call-to-action-3">
            		<a href="http://www.google.com">Subscribe >></a>
            	</div>
			</div>
			
			<div id="container4">
				<img id="show4" src="/images/global/marketvalue2.png"/>
				<div class="market4">Home Value</div>
			  	<div class="market-details-4">Find out your home's current market 
			  	value and suggested selling price</div>
            	<div class="market-call-to-action-4">
            		<a href="http://www.google.com">Find Out >></a>
            	</div>
			</div>
		</div>
		
		</div>
		<%@ include file="/includes/testfooter.jsp" %>
	</div>
</body>

</html>