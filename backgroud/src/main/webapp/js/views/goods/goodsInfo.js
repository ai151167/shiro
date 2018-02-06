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
		$("#sortName").val("");
		$("#sortId").val("");
		$("#goodsId").val("");
		$("#goodsName").val("");
		$("#goodsPrice").val("");
		$("#goodsCount").val("");
		$("#goodsDesc").val("");
		$("#goodsImage").attr("src","");
	});
	
	$(".goodsInfoDelete").click(function(){
		var goodsId =  $(this).attr("value");
		$.ajax({
			url:"goodsInfo/deleteGoodsInfo",
			async:true,
			data:{ 
			      "goodsId" : goodsId 
		     },
			type:"GET",
			success:function(response){
				if(response!=null){
					alert(response);
				}
			}
		});
	});
	
	$("#deleteAll").click(function(){
		if($("#deleteAll").prop("checked")){
			$(".deleteOne").prop("checked",true);
		}else{
			$(".deleteOne").prop("checked",false);
		}
	});
	
	$(".deleteOne").click(function(){
		 if($("input[type='checkbox']:checked").length != $(".deleteOne").length){
			 $("#deleteAll").prop("checked",false);
		 }
		 if($("input[type='checkbox']:checked").length==$(".deleteOne").length)
		 {
			 $("#deleteAll").prop("checked",true);
		 }
	});
	
	$("#deleteGoodsInfoAll").click(function(){
		var k = $("input[class='deleteOne']:checked"); 
		if(k.length<=0){
			 alert("选着要删除的项！");
			 return ;
		}
		if(!confirm("确定要都删除？")){
			 return ;
		}
		var ids = "";
		for(var i=0;i<k.length;i++){
			ids += k[i].value+",";
		}
		$.ajax({
			url:"goodsInfo/deleteGoodsInfoAll",
			async:true,
			data:{ 
			      "ids" : ids 
		     },
			type:"GET",
			success:function(response){
				if(response!=null){
					alert(response);
				}
			}
		});
	});
	
	$("#sortInfoChange").click(function(){
		console.log(1111);
		var sb = ""
			sb+="<div id='J_cate' class='cate J_cate'>";
			sb+="<ul class='JS_navCtn cate_menu'>";
		sb+="<li class='cate_menu_item' data-index='1' clstag='h|keycount|head|category_01a'>";
		sb+="<a target='_blank' class='cate_menu_lk' href='//jiadian.jd.com'>家用电器</a>";
		sb+="</li>";
		sb+="<li class='cate_menu_item' data-index='2' clstag='h|keycount|head|category_02a'>";
		sb+="<a target='_blank' class='cate_menu_lk' href='//shouji.jd.com/'>手机</a>";
		sb+="</li>";
		sb+="</ul>";
		sb+="<div id='J_popCtn' class='JS_popCtn cate_pop mod_loading' style='display: none;'></div>";
		sb+="</div>";
		$("#sortInfo").html(sb);
		alert(sb);
	});
	
	$('#searchs').on('click', function () {
		alert(111);
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
