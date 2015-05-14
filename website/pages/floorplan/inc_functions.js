$('#agentprofile-widget a').click(function(e) {
    $('.container > div').hide();
    $(this.hash).show();
    e.preventDefault(); //to prevent scrolling
});