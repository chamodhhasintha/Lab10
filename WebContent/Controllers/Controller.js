
$(document).on("click","#btnLogin",function(){
	var result = isValidFormLogin();
	if(result=="true")
	{ $("#formLogin").submit(); }
	else
	{ $("#divStsMsgLogin").html(result);  }
});

function isValidFormLogin(){
	if($.trim($("#txtUserName").val())=="")
	{	return "Enter username";
	}
	if($.trim($("#txtPassword").val())=="")
	{	return "Enter password";
	}
	return "true";
	
}
$(document).on("click","#btnSave",function(){
	var result = isValidFormItem();
	if(result=="true")
	{	$("#formItems").submit();}
	else
	{	$("#divStsMsgItem").html(result);}
});

$(document).on("click","btnEdit",function(){
	$("#hidMode").val("update");
	$("#txtItemName").val($(this).closest("tr").find('td:eq(1)').text());
	$("#txtItemDesc").val($(this).closest("tr").find('td:eq(2)').text());
});

$(document).on("click","#btnRemove",function(){
	$("#hidMode").val("remove");
	$("hidID").val($(this).attr("param"));
	var res =confirm("are you sure?");
	if(res==true){
		$("#formItems").submit();
	}
});