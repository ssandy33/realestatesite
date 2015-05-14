$(document).ready(function(){
	$("#CreateOpenHouseButton").click(function(){
  		$("#CreateOpenHouseContainer").show();
		$("#ViewOpenHousesContainer").hide();
	});
});

$(document).ready(function(){
	$("#ViewOpenHousesButton").click(function(){
  		$("#CreateOpenHouseContainer").hide();
		$("#ViewOpenHousesContainer").show();
	});
});

$(document).ready(function(){
	$('.editlink').on('click', function (e) {
		alert($(this).attr("id"));
	});
});

$(document).ready(function(){
	$('.deletelink').on('click', function (e) {
		deleteListing($(this).attr("id"));
	});
});

$(document).ready(function(){
	$("#openhousesubmit").click(function(){
		var startDate = $("#openhousestarttime").val();
		var endDate = $("#openhouseendtime").val();
		var listingId = $("#listingId").val();
		alert(startDate);
		alert(endDate);
		sendData(startDate, endDate, listingId);
		getLastListing();
	});
});

function deleteListing(openHouseId) {
	var actionType = 4;
	alert('madeit');
	$.ajax({
    	type: "POST",
    	url: "/openhouse",
    	data: { openhouseid : openHouseId, actiontype : actionType },
		dataType: "json",
    	success: function(pointsResponse) {
      	},
      	error: function(xhr, textStatus, error) {
      		alert(error);
      	}
  	});
}

function getLastListing() {
	var actionType = 3;
	$.ajax({
    	type: "POST",
    	url: "/openhouse",
    	data: { actiontype : actionType },
		dataType: "json",
    	success: function(pointsResponse) {
      	},
      	error: function(xhr, textStatus, error) {
      		alert(error);
      	}
  	});
}

function getOpenHouseListings() {
	var actionType = 2;
	$.ajax({
    	type: "POST",
    	url: "/openhouse",
    	data: { actiontype : actionType },
		dataType: "json",
    	success: function(pointsResponse) {
    		alert('here are listings');
      	},
      	error: function(xhr, textStatus, error) {
      		alert(error);
      	}
  	});
}

function sendData(startDate, endDate, listingId){
	var actionType = 1;
	$.ajax({
    	type: "POST",
    	url: "/openhouse",
    	data: { actiontype : actionType, start : startDate, end : endDate, listingId : listingId },
		dataType: "json",
    	success: function(pointsResponse) {
    		$("#CreateOpenHouseContainer").hide();
    		$('#openhousetable').append('<tr><td></td><td>' + startDate + '</td><td>' + endDate + '</td><td>EDIT</td><td>DELETE</td></tr>');
    		$("#ViewOpenHousesContainer").show();
      	},
      	error: function(xhr, textStatus, error) {
      	}
  	});
	
}