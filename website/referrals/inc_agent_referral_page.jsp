<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-Transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style media="all" type="text/css">
	@import url("/css/reset.css");
	@import url("/css/clearfix.css");
	@import url("/css/global.css");
	@import url("/css/classes.css");
	
	/* Layout */
	@import url("/css/header.css");
	@import url("/css/footer.css");

        /* Page Specific*/
	@import url("/css/contact.css");
</style>
<%@include file="/includes/header.jsp"%>
</head>
<body style='font-family:Georgia, "Times New Roman", Times, serif;'>
	<%@ include file="/referrals/inc_validation.jsp" %>
    <!-- header -->
	<%@ include file="/includes/header.jsp" %>
    <!-- end header -->

</div><div id="content" class="innerwrapper pages  clearfix">
   <div class="column-1 column">
		<div class="shadow module type-1 clearfix">
			<h2 class="title" style="color:#762d30; text-transform:uppercase;">Contact Information</h2>
			<div style="padding:10px; width:270px; padding-top:0;font-family: Georgia, 'Times New Roman', Times, serif;font-size:15px;">
                            <address style="">
                            <b>Gabby Sandy, REALTOR &#174;</b><br />
                            14245 W. Grandy Ave, Suite 1<br />
                            Surprise,&nbsp;AZ&nbsp;85374<br />
                            </address><br />
                            P: 480 678 8817<br />
                            F: 623 584 5502<br /><br />
                            E: <a href="mailto:gsandy@longrealty.com">gsandy@longrealty.com</a><br />
                        </div>
		</div>
   </div>
   <div class="column-2 column">
  		<h5 class="page-title" style="margin:16px 0; font-size: 20px;">Agent Referral Form</h5>
 	<div class="statusMessage" style="color:#F00; font-weight:bold;" ></div>
					
					<style type="text/css">
					ul.disc li {
						list-style-type: disc;
						list-style-position: outside;
						margin-left: 35px;
						margin-bottom: 10px;
						color: #474340;
						font-size: 13px;
						font-family: Georgia, "Times New Roman", Times, serif;
					}
				</style>
				<p>Do you have clients wanting to buy or sell Real Estate in the West Valley of Phoenix, Arizona?</p>
				
				<h5 class="page-title bold" style="margin-top:12px; margin-bottom:6px; text-transform:uppercase;">Start the Process</h5>
				<p>I offer a 25% referral fee to any licensed agent that refers a client that results in a sale.</p>
				<p>Fill out the form below with your contact information and I will promptly call you to discuss the details of my agent referral program.  </p>
				
				<p>Alternatively, you can call me now at 480.678.8817.</p>
				
    <h2 style="color:#762d30;">Your Information</h2>
    <form id="contactForm" class="clearfix" method="post" onsubmit="return Validation(this)" action="agentreferralpost">
                	<div class="formBox">
                        <label for="firstName">First Name *</label>
                        <input type="text" tabindex="1" id="firstName" name="firstName" value="<%= agentReferralPage.getAgentFirstName() %>"/>
                    </div>
                    <div class="formBox">
                        <label for="lastName">Last Name *</label>
                        <input type="text" tabindex="2" id="lastName" name="lastName" value="<%= agentReferralPage.getAgentLastName() %>" />
                    </div>
                    
                    <div class="formBox">
                        <label for="email">Email</label>
						<input type="text" tabindex="3" id="email" name="email" value="<%= agentReferralPage.getAgentEmail() %>" />
                    </div>
                    <div class="formBox">
                        <label for="confirmEmail">Confirm Email</label>
                        <input type="text" tabindex="4" id="confirmEmail" name="confirmEmail" value="" />
                    </div>
                    
                    <div class="formBox">
                        <label>Cell Phone *</label>
                        <input class="phone short" type="text" tabindex="5" id="cell1" name="cell1"  maxlength="3" value="<%= agentReferralPage.getAgentCell1() %>" />
                        <input class="phone short" type="text" tabindex="6" id="cell2" name="cell2"  maxlength="3" value="<%= agentReferralPage.getAgentCell2() %>" />
                        <input class="phone" type="text" tabindex="7" id="cell3" name="cell3"  maxlength="4" value="<%= agentReferralPage.getAgentCell3() %>" />
                    </div>
                    
                <div id="contactFormFooter">
                    <label>Message</label>
                    <textarea id="comments" name="comments" cols="" rows="7"></textarea>

                   	<label class="contactUpdate"><input type="checkbox" id="noMail" name="noMail" checked="checked" value="1" />Please keep me updated with your listings and activities.</label>
                    <div id="contactFormDisclaimer">
   						<p class="formDirections"><span style="font-size:10px">* Indicates required field.</span></p>
          			</div>

                    <div id="contactFormSubmitContainer">
                        <input id="contactFormSubmit" type="submit" value="Send" />
                    </div>
                    
					<input type="hidden" name="guid" id="guid" value="<%= agentReferralPage.getAgentGuid() %>">
					
				</div>
    	</form>           
    </div>
</div>
    
    <!-- footer -->
	<%@ include file="/includes/footer.jsp" %>
	<!-- end footer -->

</body>
</html>