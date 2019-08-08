package com.spring.client.board.vo;

import com.spring.common.vo.CommonVO;

public class BoardVO extends CommonVO {

	private int b_num = 0; // 글 번호
	private String b_name = ""; // 작성자
	private String b_title = ""; // 제목
	private String b_content = ""; // 글 내용
	private String b_date = ""; // 작성일
	private String b_pwd = ""; // 비밀번호

	// 디폴트 생성자
	public BoardVO() {
		super();
	}

	// 모든 생성자
	public BoardVO(int b_num, String b_name, String b_title, String b_content, String b_date, String b_pwd) {
		super();
		this.b_num = b_num;
		this.b_name = b_name;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_date = b_date;
		this.b_pwd = b_pwd;
	}

	// 접근자와 설정자 생성
	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getB_pwd() {
		return b_pwd;
	}

	public void setB_pwd(String b_pwd) {
		this.b_pwd = b_pwd;
	}

}
