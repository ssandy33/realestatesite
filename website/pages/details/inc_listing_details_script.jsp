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