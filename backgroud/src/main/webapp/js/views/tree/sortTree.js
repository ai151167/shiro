function SortTreeLayer(){
	var htmlStr = "";
	htmlStr += '<div style="width:300px;height:200px" >';
	htmlStr += '<div style=" line-height:30px; text-indent:10px; margin-bottom:20px; background-color:#eee; position:relative;">类别</div>';
	htmlStr += '<div style="display:block; padding-bottom:5px;" align="center"  >';
	htmlStr += '<div><table><tr><td><input type="hidden" id="t_sortId" width="50px"/><input type="text" id="t_sortName" width="50px"><button onclick="SetSortInfoParam();">确定</button></td></tr></table></div>';
	htmlStr += '<div id="SortInfoTree" class="ztree"></div>';
	htmlStr += '</div>';
	htmlStr += '</div>';
	$.layer({
		type:1,
		title:false,
		area: ['auto', 'auto'],
		page:{
			html:htmlStr
		}
	});
	LoadSortTree();
}

function LoadSortTree(){
	var url = "/sortInfo/sortInfoList";
	var setting={
		data:{
			simpleData:{
				enable:false,
			}
		},
		async:{
			url:url,
			type:"get",
			dataType:"json",
			autoParam:["id","name"],
			enable:true,
		},
		callback:{
			onClick:ClickQueryOrgTreeNodeFunc
		}
		
	};
	
	var zNodes= [] ;
	var zTreeObj = $.fn.zTree.init($("#SortInfoTree"), setting, zNodes);
}
function ClickQueryOrgTreeNodeFunc(event, treeId, treeNode, clickFlag){
	$("#t_sortId").val(treeNode.id);
	$("#t_sortName").val(treeNode.name);
}

function SetSortInfoParam(){
	
		$("#sortId").val($("#t_sortId").val());
		$("#sortName").val($("#t_sortName").val());
	
		var index = layer.index;
	    layer.close(index);
}