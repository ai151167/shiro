
$(document).ready(function() {
	$(".option").click(function(){
		var state = $(this).attr("value");
		if(state=="Projects"){
			$("#view_frame").attr("src","goodsInfo/goodsInfoList");
		}
		if(state=="Contact"){
			$("#view_frame").attr("src","user/userInfo");
		}
		alert(state);
	});
});
