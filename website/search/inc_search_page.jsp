<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style media="all" type="text/css">
	@import url("/css/reset.css");
	@import url("/css/clearfix.css");
	@import url("/css/global.css");
	@import url("/css/classes.css");
	@import url("/css/home.css");
	@import url("/css/homepage.css");
	@import url("/css/search.css");
	@import url("/css/effects.css");
	
	/* Layout */
	@import url("/css/header.css");
	@import url("/css/footer.css");
	
	
</style>
<title>Gabby Sandy</title>
<%@include file="/includes/header.jsp"%>
</head>
<body style='font-family:Georgia, "Times New Roman", Times, serif;'>
	<blockquote><%@include file="/includes/header.jsp"%><div id="content" class="innerwrapper clearfix"> 
		<div id="column-1" class="column-1 column"> 
			 
			<!--  <div id="quickSearch-column" class="shadow type-2 clearfixer"></div> -->
            <div id="searchColumn"> 
            
            <div id="propertySearch" class="shadow">
            
				<form action="/search" method="post" id="homesearch">
  				<h2 class="title">SEARCH FEATURED PROPERTIES</h2>
                   
	                <div class="searchRow clearfix searchSpacer">
	                     <div class="formBox"><label for="searchArea">Featured Area</label><br>
	                     <select id="searchArea" name="searchArea">
	                     	<%= searchPage.getSearchOptions().getSearchAreasAsSelectOptions() %>                       
	                     </select>
	                     </div>
                   		<div class="formBox"><label for="minPrice">MIN PRICE</label><br>                         
                        <select id="minPrice" name="minPrice"> 
                             <%= searchPage.getSearchOptions().getMinPriceRangeOptions() %>               
                        </select>                         
                        </div> 
                        <div class="formBox"><label for="maxPrice">MAX PRICE</label><br> 
                        <select id="maxPrice" name="maxPrice"> 
	                     	<%= searchPage.getSearchOptions().getMaxPriceRangeOptions() %>  
                        </select> 
                        </div> 
	               </div>  
                   
                  <div class="searchRow clearfix"> 
                   		<div class="formBox" style="padding-top: 5px;"><label for="minBed">MIN BED</label><br>                         
                        <select id="minBed" name="minBed" style="width: 100px;"> 
                        <option value="0">Any</option>  
                        <option value="1">1+</option><option value="2">2+</option><option value="3">3+</option><option value="4">4+</option><option value="5">5+</option><option value="6">6+</option><option value="7">7+</option><option value="8">8+</option><option value="9">9+</option><option value="10">10+</option>                        
                        </select>                         
                        </div> 
                        <div class="formBox" style="padding-top: 5px;"><label for="minBath">MIN BATH</label><br> 
                        <select id="minBath" name="minBath" style="width: 100px;"> 
                        <option value="0">Any</option>  
                        <option value="1">1+</option><option value="2">2+</option><option value="3">3+</option><option value="4">4+</option><option value="5">5+</option><option value="6">6+</option><option value="7">7+</option><option value="8">8+</option><option value="9">9+</option><option value="10">10+</option>                        
                        </select> 
                        </div> 
                        <div class="formBox" style="padding-top: 5px;"><label for="sqft">SQUARE FT.</label><br> 
                        <select id="sqft" name="sqft" style="width: 100px;"> 
                        <option value="0">Any</option>  
                        <option value="1000">1,000 sqft</option><option value="2000">2,000 sqft</option><option value="3000">3,000 sqft</option><option value="4000">4,000 sqft</option><option value="5000">5,000 sqft</option><option value="6000">6,000 sqft</option><option value="7000">7,000 sqft</option><option value="8000">8,000 sqft</option><option value="9000">9,000 sqft</option><option value="10000">10,000 sqft</option>                        
                        </select> 
                        </div>  
                                                
                  </div>       
				<div class="searchRow clearfix" style="margin-bottom: 10px;">
					<div class="formBox" style="padding-top: 20px;"><label for="order">Order Results By</label><br> 
                        <select id="order" name="order" style="width: 100px;"> 
                        <option value="approx_sqft">Square Feet</option>  
                        <option value="list_price_int">Price</option><option value="list_date">Listing Date</option>                       
                        </select> 
                    </div>
					<div class="formBox" style="padding-top: 20px;"><label for="sort">Sort Results</label><br> 
                        <select id="sort" name="sort" style="width: 100px;"> 
                        <option value="desc">Descending</option>  
                        <option value="asc">Ascending</option>                       
                        </select> 
                    </div>    
					<div id="buttonHolder" style="padding-top:20px;"> 
                		<input type="submit" class="button" name="listSearch" id="listSearch"> 
					</div> 
				</div>                  
   </form>                  
                        
            </div>  <!-- propertySearch --> 
          <!-- &lt;/form&gt;-->                  
             </div>  <!--SearchColumn --> 
		
		
			<%@include file="/search/inc_listings.jsp"%>	

		
	    	<div id="navleft-1" class="navleft">
	     		<% if (searchPage.getCurrentPage() != 1) { %>
	    			<a href="/search?page=<%= searchPage.getCurrentPage() - 1 %>&searchArea=<%= searchPage.getSearchArea() %>&sqft=<%= searchPage.getSqft() %>&minPrice=<%= searchPage.getMinPrice() %>&maxPrice=<%= searchPage.getMaxPrice() %>&minBed=<%= searchPage.getMinBed() %>&minBath=<%= searchPage.getMinBath() %>">Previous</a>
	 			<% } %>
	    	</div>
	    	<div id="navcenter-1" class="navcenter"></div>
	    	<div id="navright-1" class="navright">
	     		<% if (searchPage.getCurrentPage() < searchPage.getNumPages()) { %>
	    			<a href="/search?page=<%= searchPage.getCurrentPage() + 1 %>&searchArea=<%= searchPage.getSearchArea() %>&sqft=<%= searchPage.getSqft() %>&minPrice=<%= searchPage.getMinPrice() %>&maxPrice=<%= searchPage.getMaxPrice() %>&minBed=<%= searchPage.getMinBed() %>&minBath=<%= searchPage.getMinBath() %>">Next</a>
	 			<% } %>
	    	</div>
			 
		</div> 
		<div id="column-2" class="column-2 column"> 
        	<div class="concierge-home type-1 shadow" style="padding: 10px; margin-bottom: 10px;"> 
                                    </div> 
			<div class="shadow module type-2 clearfixer"> <a href="http://www.sandrawilken.com/search/" id="search-mls"> 
				<h2 class="hidden">Search Homes on MLS</h2> 
			</a> </div> 
			<div class="shadow module type-1 clearfix"> 
				<h2 class="title">Neighborhoods</h2> 
				<ul class="clearfix s12 uppercase l18 ls5"> 
                	<li><a href="/featured?sa=1">Sun City Grand</a></li> 
                    <li><a href="/featured?sa=2">Sun City West</a></li> 
               </ul> 
			</div> 
			<div class="shadow module type-2 clearfixer"> <a href="http://www.sandrawilken.com/properties/distressed-properties/" id="search-distressed"> 
				<h2 class="hidden">Search Distressed Properties</h2> 
				</a> </div> 
			<div class="shadow module type-1 pageflip clearfixer"> 
				<h2 class="title relative">Recent Blog Posts <img class="atr" style="top: 2px; right: 10px;" src="http://www.sandrawilken.com/images/home/blog.png" alt="Blog Posts"></h2> 
				<div id="blogs"> 
					<ul id="homeNewsList"> 
						<li class="remove"> 
							<ul id="RssLoader"> 
							</ul> 
						</li> 
						<li> 
							<ul id="RssFeeds"> 
							</ul> 
						</li> 
					</ul> 
				</div> 
				<a href="http://www.sandrawilken.com/blog/" class="readmore redirect-more clearfix" style="padding: 8px 10px 15px;">read more posts</a>  
			</div> 
			<div class="shadow module type-2 form-module clearfixer"> 
				<h2 class="hidden">Join our email list</h2> 
						<form action="http://www.sandrawilken.com/" method="post" enctype="application/x-www-form-urlencoded" id="mailing-list"> 
					<fieldset> 
						<legend class="hidden">Join our email list</legend> 
						<label for="email" class="hidden">Email</label> 
						<input type="text" tabindex="0" value="Enter Your Email Address" id="email" name="email" onfocus="if (this.value == 'Enter Your Email Address') this.value = '';" onblur="if (this.value=='') this.value='Enter Your Email Address';"> 
						<input type="submit" tabindex="1" value="submit" name="submit" id="submit"> 
					</fieldset> 
				</form> 
					</div> 
			<div class="shadow module type-1 clearfix"> 
				<h2 class="title" style="background-image: url(images/global/header-twitter-updates.jpg); height: 18px;"><span class="hidden">Twitter Updates</span></h2> 
				 
				<a href="http://twitter.com//" target="_blank" class="redirect-more clearfix s11">Follow Sandra on twitter</a>  
			</div> 
             
		</div> 
	</div><%@include file="/includes/footer.jsp"%></blockquote>


	


	
</body>
</html>