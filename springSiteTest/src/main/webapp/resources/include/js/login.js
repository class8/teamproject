/**
 * 2019-08-07 김수현 login.js
 */
$(function() {
	// 아래 함수는 서버로 받아온 코드값에 대한 처리 함수
	errCodeCheck()
	$('#userId, #userPw').bind("keyup", function() {
		$(this).parents("div").find(".error").html("");
	});
	// 로그인 버튼 클릭시 처리 이벤트
	$("#loginBtn").click(function() {
		if (!formCheck($('#userId'), $('.error:eq(0)'), "아이디를"))
			return;
		else if (!inputVerify(0, '#userId', '.error:eq(0)'))
			return;
		else if (!formCheck($('#userPw'), $('.error:eq(1)'), "비밀번호를"))
			return;
		else if (!inputVerify(1, '#userPw', '.error:eq(1)'))
			return;
		else {
			$("#loginForm").attr({
				"method" : "POST",
				"action" : "/member/login.do"
			});
			$("#loginForm").submit();
		}
	});
	/* 회원가입 버튼 클릭 시 처리 이벤트 */
	$("#joinBtn").click(function() {
		location.href = "/member/join.do";
	});
});