<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="/js/jquery.bxslider.min.js"></script>
<link href="/css/jquery.bxslider.css" rel="stylesheet" />

<script>
	$(document).ready(function() {
		$('.bxslider').bxSlider({
			minSlides : 1,
			maxSlides : 1,
			speed : 1500,
			auto : true,
			autoControls : false,
			pager : false,
			slideWidth : 950,
			adaptiveHeight : false,
			slideMargin : 10,
			pause : 8000
		});
	});
</script>