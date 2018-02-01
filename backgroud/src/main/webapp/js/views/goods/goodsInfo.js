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
		alert($("#gridSystemModalLabel").html());
	    var param =	$("#goodsInfoForm").serialize();
	    var $btn = $(this).button('loading')
	    $btn.button('reset');
		$.ajax({
			type:"POST",
			url:"goodsInfo/saveGoodsInfo",
			data:param,
			success:function(msg){
				if(msg!=null){
					alert(msg);
				}else{
					alert("保存失败!");
				}
			}
		})    
	    
	});
	$("#close").click(function(){
		alert(1111);
		$("#sortName").val("");
		$("#sortId").val("");
		$("#goodsId").val("");
		$("#goodsName").val("");
		$("#goodsPrice").val("");
		$("#goodsCount").val("");
		$("#goodsDesc").val("");
		$("#goodsImage").attr("src","");
	});
	loadPageNumber(1);
});
function loadPageNumber(startPage) {
	var page = $("#pages").val();
	var count = $("#count").attr("value");
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
				$("#sortName").val(response.sortName);
				$("#sortId").val(response.sortId);
				$("#goodsId").val(response.goodsId);
				$("#goodsName").val(response.goodsName);
				$("#goodsPrice").val(response.goodsPrice);
				$("#goodsCount").val(response.goodsCount);
				$("#goodsDesc").val(response.goodsDesc);
				$("#goodsImage").attr("src",response.goodsImage);
			}
		}
	});
}
