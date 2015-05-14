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
    	<%= viewEmailPage.getEmail() %>
    </div>
</div>
    
    <!-- footer -->
	<%@ include file="/includes/footer.jsp" %>
	<!-- end footer -->

</body>
</html>