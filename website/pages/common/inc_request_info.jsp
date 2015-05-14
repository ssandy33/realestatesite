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