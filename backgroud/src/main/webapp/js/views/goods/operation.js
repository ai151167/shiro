
$(document).ready(function() {
	$(".option").click(function(){
		var state = $(this).attr("value");
		$("#view_frame").attr("src","goodsInfo/goodsInfoList");
	});
});
