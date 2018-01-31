var page = 1;
var count = 1;
$(document).ready(function() {
	
	$(".goodsInfo").click(function(){
		var genre = $(this).attr("genre");
		if(genre == "addInfo"){
			$("#gridSystemModalLabel").html("addInfo");
		}
		if(genre == "updateGoodsInfo"){
			$("#gridSystemModalLabel").html("updateGoodsInfo");
			var goodsId = $(this).attr("value");
			loadGoodsInfo(goodsId);
		}
		$('#info').modal();
		
	});
	
	$('#save').on('click', function () {
		    var $btn = $(this).button('loading')
		    $btn.button('reset')
	});
	loadPageNumber(1);
});
function loadPageNumber(startPage) {
	$("#page").empty();
	$("#page").paging({
	    pageNo:startPage,
	    totalPage: page,
	    totalSize: count,
	    callback: function(num) {
	    	
	    }
	})
}
function loadGoodsInfo(goodsId){
	$.ajax({
		url:"goodsInfo/goodsInfo",
		async:true,
		data:{ 
		      "goodsId" : goodsId 
	     },
		type:"GET",
		success:function(response){
			if(response!=null){
				$("#sortName").val();
				$("#sortId").val();
				$("#sortName").val();
				$("#sortName").val();
				$("#sortName").val();
				$("#sortName").val();
				$("#sortName").val();
				$("#sortName").val();
			}
		}
	});
}
