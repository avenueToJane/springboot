login = function () {
	var data = {
			'account':$("#account").val(),
			'password':$("#password").val()
	};  
	/*需要注意的是，这里需要用JSON.stringfy()方法将json数据转化成字符流，
	添加至requestbody中。且在ajax方法中必须指明contentType和dataType属性。*/
	    $.ajax({
	        url: "login",
	        data: JSON.stringify(data),//必要,
	        //type、contentType必填,指明传参方式
	        type: "POST",
	        contentType: "application/json;charset=utf-8",
	        success: function(data){
	        //前端调用成功后，可以处理后端传回的json格式数据。  
	        	if(data.success){
	        		window.location.href="/register";
	        	}            
	       }
	   });
};