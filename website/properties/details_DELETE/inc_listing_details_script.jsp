<script src="http://www.sandrawilken.com/js/jquery-1.4.min.js" type="text/javascript"></script>
<script src="http://www.sandrawilken.com/js/jquery-ui-1.7.2.custom.min.js" type="text/javascript"></script>
<script src="http://www.sandrawilken.com/js/jquery/jquery.jcarousel.min.js" type="text/javascript"></script>
<script src="http://www.sandrawilken.com/js/navHighlight.jquery.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function () {
	navHighlight('#navigation');
});
</script>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-12518909-3']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script><script type="text/javascript" src="http://www.sandrawilken.com/js/jquery/mousewheel.jquery.js"></script>
<script type="text/javascript" src="http://www.sandrawilken.com/js/gallerific/jquery.galleriffic.js"></script>
<script type="text/javascript" src="http://www.sandrawilken.com/js/gallerific/jquery.opacityrollover.js"></script>
<script type="text/javascript" src="http://www.sandrawilken.com/js/jquery/colorbox-min.jquery.js"></script>
<script type="text/javascript" src="http://www.sandrawilken.com/js/jquery-ui-1.7.2.custom.min.js"></script>
<script type="text/javascript" src="http://www.sandrawilken.com/js/jquery.tipsy.js"></script>
<script type="text/javascript">
/* <![CDATA[ */
jQuery.fn.fadeTo = function(speed,to,callback) {
	return this.animate({opacity: to}, speed, function() {
		if (to == 1 && jQuery.browser.msie)
			this.style.removeAttribute('filter');

		if (jQuery.isFunction(callback))
			callback();
	});
};

jQuery(document).ready(function() {	
	$("#ListingInformation").tabs({disabled: [1, 2]});
	
	//*************** colorbox ********************//
	$("a[rel='colorbox']").colorbox({ 
					initialWidth: "380px",
					initialHeight: "300px",
					width: "490px", 
					height: "480px", 
					iframe:true, 
					scrolling: false,
					slideshow: false,
					current: "",
					rel:'nofollow',
					close:"X" });	
	
	//*************** tooltip ********************//		
	listingsLinks();

	//*************** gallerific *****************//		
	var onMouseOutOpacity = 0.4;
	$('#thumbs ul.thumbs li').opacityrollover({
		mouseOutOpacity:   onMouseOutOpacity,
		mouseOverOpacity:  1.0,
		fadeSpeed:         'fast',
		exemptionSelector: '.selected'
	});
	
	$('#RetsListingSubnav li.navButton a[class != "disabled"]').tipsy({gravity: 's'});
				
	//galleriffic
	var gallery = $('#thumbs').galleriffic({
		delay:                     5500, // in milliseconds
		numThumbs:                 7, // The number of thumbnails to show page
		preloadAhead:              1, // Set to -1 to preload all images
		enableTopPager:            false,
		enableBottomPager:         true,
		maxPagesToShow:            0,  // The maximum number of pages to display in either the top or bottom pager
		imageContainerSel:         '#slideshow', // The CSS selector for the element within which the main slideshow image should be rendered
		controlsContainerSel:      '#controls', // The CSS selector for the element within which the slideshow controls should be rendered
		captionContainerSel:       '#caption', // The CSS selector for the element within which the captions should be rendered
		loadingContainerSel:       '#loading', // The CSS selector for the element within which should be shown when an image is loading
		renderSSControls:          false, // Specifies whether the slideshow's Play and Pause links should be rendered
		renderNavControls:         true, // Specifies whether the slideshow's Next and Previous links should be rendered
		playLinkText:              '',
		pauseLinkText:             '',
		prevLinkText:              '',
		nextLinkText:              '',
		nextPageLinkText:          '',
		prevPageLinkText:          '',
		enableHistory:             true, // Specifies whether the url's hash and the browser's history cache should update when the current slideshow image changes
		enableKeyboardNavigation:  true, // Specifies whether keyboard navigation is enabled
		autoStart:                 true,			syncTransitions:           true, // Specifies whether the out and in transitions occur simultaneously or distinctly
		defaultTransitionDuration: 900, // If using the default transitions, specifies the duration of the transitions
		onSlideChange:             function(prevIndex, nextIndex) {
			this.find('ul.thumbs').children()
				.eq(prevIndex).fadeTo('fast', onMouseOutOpacity).end()
				.eq(nextIndex).fadeTo('fast', 1.0);
		},
		onPageTransitionOut:       undefined,
		onPageTransitionIn:        undefined,
		onTransitionOut:           undefined, // accepts a delegate like such: function(slide, caption, isSync, callback) { ... }
		onTransitionIn:            undefined  // accepts a delegate like such: function(slide, caption, isSync) { ... }
	});
});
	
function hideColorBox(){
	$.fn.colorbox.close();
}

function rezizeIframe(h) {
	$.fn.colorbox.myResize(441, h); 
}

function listingsLinks(){
	$("#listingsLinks a[class!=disabled]").each(function (i) {
		var jt = $(this);
		jt.data('title', jt.attr('title'));
		jt.attr('title', '');
		jt.mouseenter(function(){
			var tip = $(this).data("title");
			$(this).parent().append('<div id="contentTip2"><span>'+tip+'</span></div>');
		});
		$(this).mouseleave(function(){
			$('#contentTip2').remove();
		});		
	});//end each
}
/* ]]> */
</script>