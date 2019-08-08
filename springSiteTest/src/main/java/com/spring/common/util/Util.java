package com.spring.common.util;

public class Util {

	public static int nvl(String text) {
		return nvl(text, 0);
	}

	// nvl() 메서드는 문자열을 숫자로 변환하는 메서드로 @param (숫자로 변환할 문자열, 초기값으로 사용할 값(대체값))
	// 참고: 예외 처리는 체크예외와 비체크예외로 구분되는데, 체크 예외는 파일입출력/네트워크입출력/데이터베이스입출력이고, 나머지는 비체크 예외로
	// 인식된다.
	// @return int

	public static int nvl(String text, int def) {
		int ret = def;
		try {
			ret = Integer.parseInt(text);
		} catch (Exception e) {
			ret = def;
		}
		return ret;
	}

}