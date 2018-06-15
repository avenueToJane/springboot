login = function () {
	var data = {
			account:$("#account").val(),
			password:$("#password").val()
	};  
	/*需要注意的是，这里需要用JSON.stringify()方法将json数据转化成字符流，
	添加至requestbody中。且在ajax方法中必须指明type和dataType属性。
	contentType必填,指明传参方式 contentType 主要设置你发送给服务器的格式，
	dataType设置你收到服务器数据的格式。*/
	    $.ajax({
	        url: "/login",
	        data: JSON.stringify(data),//必要,
	        type: "POST",
	        dataType:"json",
	        contentType : 'application/json',
	        success: function(data){
	        //前端调用成功后，可以处理后端传回的json格式数据。  
	        	if(data.success){	        
	        		window.location.href="/register";
	        	}else{
	        		alert("登陆失败")
	        	}            
	       }
	   });
};