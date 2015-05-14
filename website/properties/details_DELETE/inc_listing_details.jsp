<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-GB">
<head>
	<title>Featured Properties</title>
	<style media="screen" type="text/css">
	
		@import url("/css/header.css");
		@import url("/css/general.css");
		@import url("/css/listingdetails.css");
		@import url("/css/footer.css");
		@import url("/css/request.css");
		@import url("/fancybox/jquery.fancybox.css");
	
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
	<script type='text/javascript' src="js/jquery.timers.js"></script>
  	<script type="text/javascript" src="fancybox/jquery.fancybox.js?v=2.0.6"></script>
	
	
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

<!-- hidden inline form -->
<div id="inline">
	<h2>Request Information - <span class="address"></span></h2>
	<br>
	<form id="contact" name="contact" action="#" method="post">
		<label for="firstname">First Name</label>
		<input type="text" id="firstname" name="firstname" class="txt">
		<br>
		<label for="lastname">Last Name</label>
		<input type="text" id="lastname" name="lastname" class="txt">
		<br>
		<label for="phone1">Phone</label>
		<input type="text" id="phone1" name="phone1" class="phone" maxlength="3">
		<input type="text" id="phone2" name="phone2" class="phone" maxlength="3">
		<input type="text" id="phone3" name="phone3" class="phone" maxlength="4">
		<br>
		<label for="email">E-mail</label>
		<input type="email" id="email" name="email" class="txt">
		<br>
		<label for="msg">Enter a Message</label>
		<textarea id="msg" name="msg" class="txtarea"></textarea>
		<input type="hidden" id="requestshowinglistingid" name="requestshowinglistingid" value="">
		
		<button id="send">Send E-mail</button>
	</form>
</div>

<div id="container">
   <div id="header">
   	<%@ include file="/includes/newheader.jsp" %>
   </div>
   <div id="body">
	<div id="images">
		<div id="my-folio-of-works" class="svwp">
			<ul>
				<% for (Iterator<File> iter = listingDetailPage.getListing().getListingImagesIterator(); iter.hasNext(); ) { %>
					<% File file = iter.next(); %>
					<li><img width="530" height="350" alt="Gabby Sandy" src='<%= listingDetailPage.getListing().getImageDirectory() %><%= java.net.URLDecoder.decode(file.getName().trim()) %>' /></li>
				<% } %>
			</ul>
		</div>
		<div id="address_price_details">
			<p id="listing_address"><%= listingDetailPage.getListing().getFullStreetAddress() %>  <%= listingDetailPage.getListing().getCityStateZip() %></p>
			<p id="listing_price"><%= listingDetailPage.getListing().getListPriceFormatted() %></p>
			<a href="/featured" id="listingview">&lt;&lt;Back To Listing</a>
			<a class="modalbox" href="#inline"><img id="informationlisting" src="/images/listings/requestinformation.gif" border="0"/></a>
				<script type="text/javascript">
					$(".modalbox").click(function() {
						$("#requestshowinglistingid").val(<%= listingDetailPage.getListing().getId() %>);
						$(".address").html("<%= listingDetailPage.getListing().getFullStreetAddress() %> <br/>  <%= listingDetailPage.getListing().getCityStateZip() %>");
						$(".modalbox").fancybox();
					});
				</script>
			<!-- <img id="informationlisting" src="/images/listings/requestinformation.gif" border="0"/>  -->
		</div>
	</div>
	<div id="tabs">
		<div id="interior_details">
			<p id="listing_details_header">General Details</p>
			<p id="listing_details_left">Bedrooms:&nbsp <%= listingDetailPage.getListing().getNumberBedrooms() %></p>
			<p id="listing_details_right">Bathrooms:&nbsp <%= listingDetailPage.getListing().getNumberBathrooms() %></p>
			<p id="listing_details_left">Estimated Square Feet:&nbsp <%= listingDetailPage.getListing().getApprxSqftFormatted() %></p>
			<p id="listing_details_right">Estimated Lot size:&nbsp <%= listingDetailPage.getListing().getApproxLotSqFtForDisplay() %></p>
			<p id="listing_details_left">Year Built:&nbsp <%= listingDetailPage.getListing().getYearBuilt() %></p>
			<p id="listing_details_right">Taxes:&nbsp <%= listingDetailPage.getListing().getTaxesFormatted() %></p>
			<p id="listing_details_left">Swimming Pool:&nbsp <%= listingDetailPage.getListing().getPool() %></p>
			<p id="listing_details_left">Builder:&nbsp <%= listingDetailPage.getListing().getBuilderName() %></p>
			<p id="listing_details_left">Property Type:&nbsp <%= listingDetailPage.getListing().getBookSection() %></p>
		</div>
		<div id="lising_remarks">
			<p id="listing_remarks_header">Remarks</p>
			<p id="listing_remarks_detail"><%= listingDetailPage.getListing().getPublicRemarks() %></p>
		</div>
	</div>
   </div>
   <div id="footer">
   	<%@ include file="/includes/newfooter.jsp" %>
   </div>
</div>

<!-- basic fancybox setup -->
<script type="text/javascript">
	function validateEmail(email) { 
		var reg = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
		return reg.test(email);
	}
	
	function validatePhoneOneAndTwo(phone) {
		var reg = /^[0-9]{3,3}$/;
		return reg.test(phone);
	}
	
	function validatePhoneFour(phone) {
		var reg = /^[0-9]{4,4}$/;
		return reg.test(phone);
	}
	
	function validateName(name) {
		var reg = /^[a-z ,.'-]+$/i;
		return reg.test(name);
	}

	$(document).ready(function() {
		
		$("#contact").submit(function() { return false; });
	
		$("#send").on("click", function(){
			var emailval  = $("#email").val();
			var msgval    = $("#msg").val();
			var phone1val = $("#phone1").val();
			var phone2val = $("#phone2").val();
			var phone3val = $("#phone3").val();
			var firstnameval = $("#firstname").val();
			var lastnameval = $("#lastname").val();
			var requestshowinglistingid = $("#requestshowinglistingid").val();
			var msglen    = msgval.length;
			var mailvalid = validateEmail(emailval);
			var phone1valid = validatePhoneOneAndTwo(phone1val);
			var phone2valid = validatePhoneOneAndTwo(phone2val);
			var phone3valid = validatePhoneFour(phone3val);
			var firstnamevalid = validateName(firstnameval);
			var lastnamevalid = validateName(lastnameval);
			
			if (phone1valid == false || phone2valid == false) {
				$("#phone1").addClass("error");
				$("#phone2").addClass("error");
				$("#phone3").addClass("error");
			}
			else if (phone1valid == true && phone2valid == true) {
				$("#phone1").removeClass("error");
				$("#phone2").removeClass("error");
				$("#phone3").removeClass("error");
			}
			
			if (phone3valid == false) {
				$("#phone1").addClass("error");
				$("#phone2").addClass("error");
				$("#phone3").addClass("error");
			}
			else if (phone3valid == true) {
				$("#phone1").removeClass("error");
				$("#phone2").removeClass("error");
				$("#phone3").removeClass("error");
			}
			
			if(lastnamevalid == false) {
				$("#lastname").addClass("error");
			}
			else if(lastnamevalid == true){
				$("#lastname").removeClass("error");
			}
			
			if(firstnamevalid == false) {
				$("#firstname").addClass("error");
			}
			else if(firstnamevalid == true){
				$("#firstname").removeClass("error");
			}
			
			if(mailvalid == false) {
				$("#email").addClass("error");
			}
			else if(mailvalid == true){
				$("#email").removeClass("error");
			}
			
			if(mailvalid == true && firstnamevalid == true && lastnamevalid == true && phone1valid == true && phone2valid == true && phone3valid == true) {
				// if both validate we attempt to send the e-mail
				// first we hide the submit btn so the user doesnt click twice
				$("#send").replaceWith("<em>sending...</em>");
				
				$.ajax({
					type: "POST",
					url: "/requestlistingshowing",
					data: {requestshowinglistingid : requestshowinglistingid, lastname : lastnameval, firstname : firstnameval, phone1 : phone1val, phone2 : phone2val, phone3 : phone3val, msg : msgval, email : emailval},
					dataType: "json",
					success: function(data) {
						if(data.success == "true") {
							$("#contact").fadeOut("fast", function(){
								$(this).before("<p><strong>Success! Your feedback has been sent, thanks :)</strong></p>");
								setTimeout("$.fancybox.close()", 1000);
							});
						}
					}
				});
			}
		});
	});
</script>

</body>
</html>