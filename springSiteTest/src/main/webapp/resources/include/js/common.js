/**
 * 2019-08-07 김수현 p.187common.js 부분
 * 
 */
/*
 * 배열: 유효성 체크 시 필요한 정규식으로 배열을 초기화. pattern = [ 아이디 , 비밀번호, 핸드폰번호] 함수명:
 * inputVerify(배열 인덱스번호, 비교할 값, 출력영역)
 */
var pattern = [ "((?=.*[a-zA-Z])(?=.*[0-9]).{6,10})",
		"((?=.*[a-zA-Z])(?=.*[0-9@#$%]).{8,12})", "^\\d{3}-\\d{3,4}-\\d{4}" ];
function inputVerify(index, data, printarea) {
	var data_regExp = new RegExp(pattern[index]);
	var match = data_regExp.exec($(data).val());
	if (match == null) {
		$(printarea).html("입력값이 형식에 맞지 않습니다. 다시 입력해 주세요.");
		$(data).val("");
		return false;
	} else {
		return true;
	}
}

// 함수명: chkSubmit(유효성 체크 대상, 메시지 내용)
// 출력영역: alert로 출력!
// 예시: if(!chkSubmit($('#keyword'),"검색어를" return;

function chkSubmit(item, msg) {
	if (item.val().replace(/\s/g, "") == "") {
		alert(msg + " 입력해 주세요");
		item.val("");
		item.focus();
		return false;
	} else {
		return true;
	}
}

// 함수명: checkForm(유효성 체크 대상, 메시지 내용)
// 출력영역: placeholder 속성을 이용.
// 예시: if(!chkSubmit($('#keyword'), "검색어를")) return;
function checkForm(item, msg) {
	var message = "";
	if (item.val().replace(/\s/g, "") == "") {
		message = msg + " 입력해 주세요";
		item.attr("placeholder", message);
		return false;
	} else {
		return true;
	}
}

// 함수명: formCheck(유효성 체크 대상, 출력 영역, 메시지 내용)
// 출력영역: 매개변수 두번째 출력영역에
// 예시: if(!formCheck($('#keyword'), $('#msg'), "검색어를")) return;
function formCheck(main, item, msg) {
	if (main.val().replace(/\s/g, "") == "") {
		item.css("color", "#000099").html(msg + " 입력해주세요");
		main.val("");
		return false;
	} else {
		return true;
	}
}

// 함수명: chkData(유효성 체크 대상, 메시지 내용)
// 예시: if(!chkData("#keyword", "검색어를")) return;
function chkData(item, msg) {
	if ($(item).val().replace(/\s/g, "") == "") {
		alert(msg + " 입력해 주세요.");
		$(item).val("");
		$(item).focus();
		return false;
	} else {
		return true;
	}
}

function chkFile(item) {
	/*
	 * 배열내의 값을 찾아서 인덱스를 반환(요소가 없을 경우-1 반환) jQuery.inArray(찾을 값, 검색 대상의 배열)
	 */
	var ext = item.val().split('.').pop().toLowerCase();
	if (jQuery.inArray(ext, [ 'gif', 'png', 'jpg', 'jpeg' ]) == -1) {
		alert('gif, png, jpg, jpeg 파일만 업로드를 할 수 있습니다.');
		return false;
	} else {
		return true;
	}
}

// 관리자 페이지에서 추가되는 소스

// 함수 명 : getDateFormat (날자 데이터)
// 설명 : dataValue의 값을 년-월-일 형식에 맞춰서 반환합니다
function getDateFormat(dataValue) {

	var year = dateValue.getFullYear();

	var month = dateValue.getMonth + 1;
	month = (month < 10) ? "0" + month : month;

	var day = dateValue.getDate();
	day = (day < 10) ? "0" + day : day;

	var result = year + "-" + month + "-" + day;
	return result;
}
