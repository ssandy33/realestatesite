<div class="shadow module type-1 clearfix">
	<h2 class="title" style="color:#762d30; text-transform:uppercase;">Featured Searches</h2>
	<ul class="sidenav clearfix">
		<li><a <% if (featuredPage.getSearchAreaId() == 1) { %> class="current" href="#" <% } else { %> class="" href="/featured?sa=1" <% } %>>Sun City Grand</a></li>
		<li><a <% if (featuredPage.getSearchAreaId() == 2) { %> class="current" href="#" <% } else { %> class="" href="/featured?sa=2" <% } %>>Sun City West</a></li>
	</ul>
</div>