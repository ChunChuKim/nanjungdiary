<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function (){
	<c:if test="error eq 'dupl'">
		alert('서비스 연결이 끊겼습니다. 다시 로그인 해주세요');
	</c:if>

	//아이디저장 쿠키값이 있다면 셋팅
	var login_id = $.cookie('rememberid');
	if (login_id != undefined) {
		//아이디에 쿠키값을 담는다
		$("#loginid").val(login_id);
		//아이디저장 체크박스 체크를 해놓는다
		$("#rememberid").prop("checked", true);
	}

	// 숫자만 입력
	$(".onlyNumber").on('keyup input', function() {
		$(this).val($(this).val().replace(/[^0-9]/g, ""));
	});

	// 아이디 찾기 팝업
	$("#btnScrhIdPop").on('click', function() {
		// form reset
		$("#srchIdfrm").each(function() {
            this.reset();
        });
		$("#srchIdPop").show();
	});

	$("#srchIdRsltPop").find("#btnClose").click(function(){
		$("#srchIdRsltPop").hide();
	});

	// 비밀번호 초기화 팝업
	$("#btnScrhPwdPop").on('click', function() {
		// form reset
		$("#initPwdfrm").each(function() {
            this.reset();
        });
		$("#initPwdPop").show();
	});

	jQuery.support.cors = true;
});

function goLogin(){
	if($("#loginid").val() == ""){
        alert("아이디를 입력해주세요.");
        $("#loginid").focus();
        return false;
    }else if($("#loginpwd").val() == ""){
        alert("비밀번호를 입력해주세요.");
        $("#loginpwd").focus();
        return false;
    }else{
    	//아이디저장 체크인 경우 쿠키저장
		if ($("#rememberid").prop("checked")) {
			$.cookie('rememberid', $("#loginid").val(),{
			            //쿠키보관일
			            expires : 7
			            //도메인
			           //,domain : 'http://hellogk.tistory.com'
			            //https/http 결정
			           ,secure : false
			});
			$.cookie('rememberid', $("#loginid").val());
		//아이디저장 미체크인 경우 쿠키 삭제
		} else {
			$.removeCookie("rememberid");
		}

        $.ajax({
            url : '<c:url value="/j_spring_security_check" />',
            //url : '/loginProcess',
            //contentType : "application/json",
            data: $('#loginfrm').serialize(),
            type: 'POST',
            cache: false,
            dataType : 'json'
       }).done(function(result) {
			var code = result.code;
            var message = result.message;
            var targetUrl = result.targetUrl;
            if (code == "0000") {
                if (targetUrl == '' || targetUrl == '/') targetUrl = '<c:url value="${config['admin.home.uri']}" />';
                location.replace(targetUrl);
            }else{
           		alert(message);
           		return;
            }

       }).fail(function(xhr){
    	   console.log("xhr => \n"+JSON.stringify(xhr));
       		//alert(xhr.responseText + xhr.status + xhr.error);
       		alert(xhr.statusText);
       });
    }
}
</script>
</head>
<body>
	<div>
		<form action="/loginProc" method="post" enctype="multipart/form-data">
			<div>
				<label for="email">email</label> <input type="text" id="email"
					name="email" placeholder="email 입력하세요.">
			</div>
			<div class="form-group">
				<label for="password">password</label> <input type="password"
					id="password" name="password" placeholder="비밀번호 입력하세요.">
			</div>
			<button type="submit">로그인</button>
			
		</form>
		<button onclick="location.href='/signup'">회원가입</button>
	</div>
</body>
</html>