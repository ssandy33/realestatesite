<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style media="all" type="text/css">
	@import url("/css/newheader.css");
	@import url("/css/newfooter.css");
	@import url("/css/featuredlistings.css");
	@import url("/css/request.css");
	@import url("/fancybox/jquery.fancybox.css");
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

<%@ include file="/includes/inc_ga.jsp" %>

  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
  <script type="text/javascript" src="fancybox/jquery.fancybox.js?v=2.0.6"></script>

</head>

<body style='font-family:Georgia, "Times New Roman", Times, serif'>

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

	<div id="page-wrapper">
		<%@ include file="/includes/newheader.jsp" %>
		<div id="featured_listings">
			<%
			Iterator<Listing> listingsIt = featuredListingsPage.getListings().iterator();
			
			while (listingsIt.hasNext()) { 
			listing = listingsIt.next();
			%>
				<div id="listing">
					<img class="thumblisting" src="<%= listing.getMainImage() %>" border="0"/>
					<p id="listingarea"><%= listing.getLegalSubdivision() %></p>
					<p id="listingprice"><%= listing.getListPriceFormatted() %></p>
					<hr id="listinghr">
					<p id="listingaddressvalue"><%= listing.getFullStreetAddress() %>  <%= listing.getCityStateZip() %></p>
					<p id="listingstatuslabel">Status:</p><p id="listingstatusvalue">Active</p>
					<p id="listingtypelabel">Type:</p><p id="listingtypevalue">Single Family</p>
					
					<p id="listingbedlabel">Bedrooms:</p><p id="listingbedvalue"><%= listing.getNumberBedrooms() %></p>
					<p id="listingbathlabel">Bathrooms:</p><p id="listingbathvalue"><%= listing.getNumberBathrooms() %></p>
					<p id="listingsqftlabel">SQFT:</p><p id="listingsqftvalue"><%= listing.getSqftFormatted() %></p>
					<p id="listingyearlabel">Year Built:</p><p id="listingyearvalue"><%= listing.getYearBuilt() %></p>
					<div id="listingcalltoaction">
						<a class="modalbox<%= listing.getId() %>" href="#inline"><img id="informationlisting" src="/images/listings/requestinformation.gif" border="0"/></a>
						<script type="text/javascript">
						$(".modalbox<%= listing.getId() %>").click(function() {
							$("#requestshowinglistingid").val(<%= listing.getId() %>);
							$(".address").html("<%= listing.getFullStreetAddress() %> <br/>  <%= listing.getCityStateZip() %>");
							$(".modalbox<%= listing.getId() %>").fancybox();
						});
						</script>
						<!-- <img id="appointmentlisting" src="/images/listings/requestinformation.gif" border="0"/>  -->
						<a href="/listingdetails?listing=<%= listing.getId() %>" id="listingview">View This Listing>></a>
					</div>
				</div>
      		<% } %>
		</div>
		<%@ include file="/includes/newfooter.jsp" %>
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