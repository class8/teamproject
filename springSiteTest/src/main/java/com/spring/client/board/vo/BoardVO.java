package com.spring.client.board.vo;

import org.springframework.web.multipart.MultipartFile;

import com.spring.common.vo.CommonVO;

public class BoardVO extends CommonVO {
	private int b_num = 0; // 글 번호
	private String b_name = "";// 글 작성자
	private String b_title = "";// 글 제목
	private String b_content = "";// 글 내용
	private String b_date = "";// 글 작성일
	private String b_pwd = "";// 글 비밀번호
	
	//파일 업로드를 위한 속성
	private MultipartFile file;//첨부파일
	private String b_file="";//실제 서버에 저장한 파일명
	
	//댓글수를 위한 속성
	private int r_cnt = 0;
	
	//Getters And Setters 새로 생성
	
	
	public BoardVO() {
		super();
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getB_file() {
		return b_file;
	}
	public void setB_file(String b_file) {
		this.b_file = b_file;
	}
	public int getR_cnt() {
		return r_cnt;
	}
	public void setR_cnt(int r_cnt) {
		this.r_cnt = r_cnt;
	}
	public BoardVO(int b_num, String b_name, String b_title, String b_content, String b_date, String b_pwd) {
		super();
		this.b_num = b_num;
		this.b_name = b_name;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_date = b_date;
		this.b_pwd = b_pwd;
	}
	
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
