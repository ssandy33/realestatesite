<% 
	PageSessionSingleton pageSessionSingleton = PageSessionSingleton.getInstance(request);
%>

<div id="header-wrapper" class="clearfix">
	<div id="header">
		<div class="innerwrapper" style="position:relative;min-height:115px;">
			<h1 class="atl uppercase"><a id="client-logo" href="#" title="Gabby Sandy Properties"><span class="hidden">Gabby Sandy <br />Properties</span><img src="/images/global/gs.png" /></a></h1>
			<div id="social-networks">
				<h2 class="arno-reg"> 480 678 8817 | 877 469 7431 x1642 </h2>
				<h3 class="uppercase arno-reg">Call Me</h3>
				<ul class="clearfix" style="float:right; width: 235px;">
					<!-- <li style="margin-right: 5px;"><iframe src="http://www.facebook.com/plugins/like.php?href=http%3A%2F%2Fwww.facebook.com%2Fsandra.wilken.homes&amp;layout=button_count&amp;show_faces=false&amp;width=30&amp;action=recommend&amp;font=segoe+ui&amp;colorscheme=light&amp;height=21" scrolling="no" frameborder="0" style="border:none; overflow:hidden; width:125px; height:24px;" allowTransparency="true"></iframe></li> -->
					<li style=""><a href="https://www.facebook.com/pages/Gabby-Sandy-Real-Estate-Agent-Long-Realty-West-Valley/215909338500357" target="_blank" class="facebook icon"><span class="hidden">Facebook</span><img src="/images/FaceBook_24x24.png" /></a></li>
					<li style="margin-left:2px;"><a href="http://twitter.com/GabbyTweets" class="twitter icon" target="_blank" ><span class="hidden">Twitter</span><img src="/images/Twitter_24x24.png" /></a></li>
					<li style="margin-left:2px;"><a href="http://www.gabbyblogs.com/" class="twitter icon" target="_blank" ><span class="hidden">Gabby Blogs</span><img src="/images/Blogger.png" /></a></li>
					<!-- <li style="margin-left:2px;"><a href="http://www.linkedin.com/pub/sandra-wilken/1b/922/43" target="_blank"  class="linkedin icon"><span class="hidden">LinkedIn</span><img src="http:///images/linkedin_24X24.png" /></a></li> -->
					<!-- <li style="margin-left:2px;"><a href="http://www.yelp.com/biz/sandra-wilken-luxury-properties-scottsdale" target="_blank"  class="yelp icon"><span class="hidden">Yelp</span><img style="position:relative;top:-0.5px;" src="http:///images/yelp.png" /></a></li> -->
				</ul>
			</div>

		</div>
	</div>
	<div id="navigation">
		<div class="menu-header clearfix">
			<ul class="innerwrapper clearfix">
				<li><a class="arno-reg mainSelect" href="/home" title="Home Search">Home</a></li>
				<% if (PageSessionSingleton.showPropertiesMenuLink(request)) { %>
					<li><a class="arno-reg mainSelect"  href="/openhouse" title="Properties Portfolio">Properties</a>
						<ul>
							<!--<li><a href="/featured?sa=1" title="Properties Portfolio">Featured Properties</a></li>-->
							<!--<li><a href="/properties/search.jsp" title="Search Properties">Search Properties</a></li>-->
							<li><a href="/openhouse" title="Open House">Open Houses</a></li>
						</ul>
					</li>
				<% } %>
				<!--
				<li><a class="arno-reg mainSelect" href="http:///specialty-realty/" title="Search Distressed Properties">Specialty Realty</a>
					<ul>
						<li><a href="http:///distressed-properties/">Distressed Properties</a></li>
						<li><a href="http:///rental-properties/">Rental Properties</a></li>
						<li><a href="http:///commercial-properties/">Commercial Properties</a></li>
						<li><a href="http:///international-services/">International Buyer Services</a></li>
						<li><a href="http:///relocation-services/">Relocation Services</a></li>
					</ul>
				</li>
				 -->
				<% if (PageSessionSingleton.showServicesMenuLink(request)) { %>
					<li><a class="arno-reg mainSelect" href="/services/selling.jsp" title="Services">Services</a>
	                    <ul>
							<!-- <li><a href="http:///services/lifestyle/">Lifestyle Services</a></li> -->
							<li><a href="/services/selling.jsp">Selling Services</a></li>
							<li><a href="/services/buying.jsp">Buyer Services</a></li>
						</ul>
					</li>
				<% } %>
				
				<% if (PageSessionSingleton.showAboutMenuLink(request)) { %>
					<li><a class="arno-reg mainSelect" href="/gs/about" title="About Gabby Sandy">About</a>
						<ul>
							<li><a class="subSelect" href="/gs/about">About Long Reality</a></li>
							<li><a class="subSelect" href="/gs/contact">Contact</a></li>
						</ul>	
					</li>
				<% } %>
				
				<% if (PageSessionSingleton.showAgentReferralMenuLink(request)) { %>
					<li><a class="arno-reg mainSelect" href="/AgentReferral" title="Refer a Client">Refer a Client</a></li>
				<% } %>
				
				<% if (PageSessionSingleton.showRecentActivityLink(request)) { %>
					<li>
						<a class="arno-reg mainSelect" href="/recentactivity?com=2&im=1" title="Recent Activity">Recent Activity</a>
						<ul>
							<li><a class="subSelect" href="/recentactivity?com=2&im=1">Sun City Grand</a></li>
							<li><a class="subSelect" href="/recentactivity?com=3&im=1">Sun City West</a></li>
						</ul>
					</li>
				<% } %>
				<li><a class="arno-reg mainSelect" href="http://www.gabbyblogs.com/" title="Blog">Blog</a></li>
			</ul>
		</div>	
	</div>
</div>
    <!-- end header -->