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
  		<h5 class="page-title" style="margin:16px 0; font-size: 20px;">Contact Us</h5>
   			<p class="formDirections">Please fill out the form below so that we may best help you. <span style="font-size:10px">* Indicates required field.</span></p>
 	<div class="statusMessage" style="color:#F00; font-weight:bold;" ></div>
	
    <h2 style="color:#762d30;">Your Information</h2>
    <form id="contactForm" class="clearfix" method="post" action="/gs/contactpost">
                	<div class="formBox">
                        <label for="firstName">First Name *</label>
                        <input type="text" tabindex="1" id="firstName" name="firstName" value=""/>
                    </div>
                    <div class="formBox">
                        <label for="lastName">Last Name *</label>
                        <input type="text" tabindex="2" id="lastName" name="lastName" value="" />
                    </div>
                    <!-- end row-->
                    
                    <div class="formBox">
                        <label for="email">Email *</label>
						<input type="text" tabindex="3" id="email" name="email" value="" />
                    </div>
                    <div class="formBox">
                        <label for="confirmEmail">Confirm Email *</label>
                        <input type="text" tabindex="4" id="confirmEmail" name="confirmEmail" value="" />
                    </div>
        
                    <div class="formBox">

                        <label>Address</label>
                        <input type="text" tabindex="5" id="address" name="address" value=""/>
                    </div>
                    
                    <div class="formBox">
                        <label>Apt/Suite</label>
                        <input type="text" tabindex="6" id="suite" name="suite" value=""/>
                    </div>
                    
                    <!-- end row-->

                    
                    <div class="formBox">
                        <label for="city">City</label>
                        <input type="text" tabindex="7" id="city" name="city" value=""/>
                    </div>
                    
                    <div class="formBox state">
                    	<label>State</label>
                        <select  tabindex="9" id="state" name="state">
                        <option value="AL">Alabama</option><option value="AK">Alaska</option><option selected="selected" value="AZ">Arizona</option><option value="AR">Arkansas</option><option value="CA">California</option><option value="CO">Colorado</option><option value="CT">Connecticut</option><option value="DE">Delaware</option><option value="FL">Florida</option><option value="GA">Georgia</option><option value="HI">Hawaii</option><option value="ID">Idaho</option><option value="IL">Illinois</option><option value="IN">Indiana</option><option value="IA">Iowa</option><option value="KS">Kansas</option><option value="KY">Kentucky</option><option value="LA">Louisiana</option><option value="ME">Maine</option><option value="MD">Maryland</option><option value="MA">Massachusetts</option><option value="MI">Michigan</option><option value="MN">Minnesota</option><option value="MS">Mississippi</option><option value="MO">Missouri</option><option value="MT">Montana</option><option value="NE">Nebraska</option><option value="NV">Nevada</option><option value="NH">New Hampshire</option><option value="NJ">New Jersey</option><option value="NM">New Mexico</option><option value="NY">New York</option><option value="NC">North Carolina</option><option value="ND">North Dakota</option><option value="OH">Ohio</option><option value="OK">Oklahoma</option><option value="OR">Oregon</option><option value="PA">Pennsylvania</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option><option value="SD">South Dakota</option><option value="TN">Tennesse</option><option value="TX">Texas</option><option value="UT">Utah</option><option value="VT">Vermont</option><option value="VA">Virginia</option><option value="WA">Washington</option><option value="WV">West Virginia</option><option value="WI">Wisconsin</option><option value="WY">Wyoming</option>
                        </select>
               
                    </div>

                    
                    <div class="formBox zipcode">
                         <label for="zipcode">Zip Code</label>
                         <input type="text"  tabindex="10" id="zipcode" name="zipcode" value=""/>
                    </div>
                    
                    <!-- end row-->

                    <div class="formBox">
                        <label>Home Phone #</label>
                        <input class="phone short" type="text" tabindex="11" id="phone1" name="phone1" maxlength="3" value="" />
                        <input class="phone short" type="text" tabindex="12" id="phone2" name="phone2" maxlength="3" value="" />
                        <input class="phone" type="text" tabindex="13" id="phone3" name="phone3" maxlength="4" value="" />
                    </div>

                    
                    <div class="formBox">
                        <label>Cell Phone #</label>
                        <input class="phone short" type="text" tabindex="14" id="cell1" name="cell1"  maxlength="3" value="" />
                        <input class="phone short" type="text" tabindex="15" id="cell2" name="cell2"  maxlength="3" value="" />
                        <input class="phone" type="text" tabindex="16" id="cell3" name="cell3"  maxlength="4" value="" />
                    </div>
                    <!-- end row-->
                    <h2 style="color:#762d30;">Property Interest</h2>
                    <div class="interests">
                       <p>I am interested in:</p>
                        <label><input type="checkbox" name="interesttype[]" class="checkbox" value="1" />Buying</label><label><input type="checkbox" name="interesttype[]" class="checkbox" value="2" />Selling</label><label><input type="checkbox" name="interesttype[]" class="checkbox" value="3" />Relocating</label><label><input type="checkbox" name="interesttype[]" class="checkbox" value="3" />Renting</label><label><input type="checkbox" name="interesttype[]" class="checkbox" value="5" />Investing</label>
                    </div>
					
                   <!-- <div class="interestContainer">
                        <div class="interestTitle clearfix">Areas of Interest</div>
                        <div class="interestBox">
                            <div class="interestItems">
                                <div class="itemContainer">
                                     	 <div>arcadia</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="38" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>biltmore</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="34" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>fountain hills</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="37" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>gainey ranch</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="40" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>miscellaneous</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="39" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>paradise valley</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="36" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>phoenix</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="35" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>scottsdale</div>
                                    	 <input type="checkbox" name="areaOfInterests[]" class="checkbox" value="33" />
                                	 	 </div>
                            </div>
                        </div>
                    </div>-->

					<div class="interestContainer">
                        <div class="interestTitle">Property Type</div>
                        <div class="interestBox">
                            <div class="interestItems">
                                <div class="itemContainer">
                                     	 <div>single family detached</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="1" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>golf property</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="2" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>horse property</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="3" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>patio home</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="4" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>condominium/flat</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="6" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>townhome</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="5" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>loft</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="7" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>vacant land</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="8" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>vacation property</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="9" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>rental property</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="10" />
                                	 	 </div><div class="itemContainer">
                                     	 <div>gated community</div>
                                    	 <input type="checkbox" name="propertyType[]" class="checkbox" value="11" />
                                	 	 </div>
                            </div>
                        </div>
                    </div>


                    <div class="formBoxWide">
                        <div id="bedroomBlock" class="formBox smlselect">
                            <label>Min Beds</label>
                            <select id="bedroom" name="bedroom">
                                <option>Any</option>
                           <option value="1" >1+</option><option value="2" >2+</option><option value="3" >3+</option><option value="4" >4+</option><option value="5" >5+</option><option value="6" >6+</option><option value="7" >7+</option><option value="8" >8+</option><option value="9" >9+</option><option value="10" >10+</option>
                            </select>
                        </div>
                        <div id="bathBlock" class="formBox smlselect">
                            <label>Min Baths</label>
                            <select id="bath" name="bath">
                                <option>Any</option>
                               <option value="1" >1+</option><option value="2" >2+</option><option value="3" >3+</option><option value="4" >4+</option><option value="5" >5+</option><option value="6" >6+</option><option value="7" >7+</option><option value="8" >8+</option><option value="9" >9+</option><option value="10" >10+</option>
                            </select>
                        </div>       
                       
                        <!--<div id="minSqtfBlock" class="formBox smlselect">
                              <label>Min Sqft</label>                                                          
                              <select type="text" id="minSqft" name="minSqft">
                                  <option>Any</option>
                                  
                              </select>
                        </div>
                        <div id="maxSqtfBlock" class="formBox smlselect">
                              <label>Max Sqft</label>
                              <select type="text" id="maxSqft" name="maxSqft">
                                  <option>Any</option>
                                  
                              </select>
                        </div>-->
                        
                        <div id="minPriceBlock" class="formBox midselect">
                              <label>Min Price</label>
                              <select id="minPrice" name="minPrice">
                                  <option>Any</option>
                                  <option value="200000" >200,000</option><option value="400000" >400,000</option><option value="600000" >600,000</option><option value="800000" >800,000</option><option value="1000000" >1,000,000</option><option value="1250000" >1,250,000</option><option value="1500000" >1,500,000</option><option value="1750000" >1,750,000</option><option value="2000000" >2,000,000</option><option value="2500000" >2,500,000</option><option value="3000000" >3,000,000</option><option value="4000000" >4,000,000</option><option value="5000000" >5,000,000</option><option value="6000000" >6,000,000</option><option value="7000000" >7,000,000</option><option value="8000000" >8,000,000</option><option value="9000000" >9,000,000</option><option value="10000000" >10,000,000</option>
                              </select>
                        </div>
                        
                        <div id="maxPriceBlock" class="formBox midselect">
                              <label>Max Price</label>
                              <select id="maxPrice" name="maxPrice">
                                  <option>Any</option>
                                  <option value="200000" >200,000</option><option value="400000" >400,000</option><option value="600000" >600,000</option><option value="800000" >800,000</option><option value="1000000" >1,000,000</option><option value="1250000" >1,250,000</option><option value="1500000" >1,500,000</option><option value="1750000" >1,750,000</option><option value="2000000" >2,000,000</option><option value="2500000" >2,500,000</option><option value="3000000" >3,000,000</option><option value="4000000" >4,000,000</option><option value="5000000" >5,000,000</option><option value="6000000" >6,000,000</option><option value="7000000" >7,000,000</option><option value="8000000" >8,000,000</option><option value="9000000" >9,000,000</option><option value="10000000" >10,000,000</option>
                              </select>
                        </div>
                    </div><!-- end .formBoxWide-->
                    
                    
                    
    
            <!-- contactFormFooter Start-->
                <div id="contactFormFooter">
                    <label>Message</label>
                    <textarea id="comments" name="comments" cols="" rows="7"></textarea>

                   	<label class="contactUpdate"><input type="checkbox" id="noMail" name="noMail" checked="checked" value="1" />Please keep me updated with your listings and activities.</label>
                    <div id="contactFormDisclaimer">
                    	<p></p>
                    </div>

                    <div id="contactFormSubmitContainer">
                        <input id="contactFormSubmit" type="submit" value="Send" />
                    </div>
                    

			</div><!-- formFooter End-->
    	</form>           </div>
</div><!-- end #container -->
    
    <!-- footer -->
	<%@ include file="/includes/footer.jsp" %>
	<!-- end footer -->

</body>
</html>
