package com.spring.client.login.vo;

public class LoginHistory {

	// 로그인 시도 횟수 제한시 고려해야할 항목 정리
	// 1. 로그인 시도횟수- 로그인 시도시마다 1씩 증가시켜 시도횟수가 5보다 큰 경우 일정 시간 동안 로그인기능이 잠금상태가 되도록하낟
	// 2. 마지막으로 실패한로그인시간정보-이시간 정보를 이용하여 로그인 잠금상태가 유지되어야 하는 시간을 설정할수있다
	// 3. 마지막으로 성공한 로그인시간 정보- 이시간 정보를 이용하여 마지막으로 로그인한 시간정보를 사용자에게 알려줌으로써 자기계정이 혹시
	// 다른사람에
	// 의해 사용되었는지 여부를 사용자가 점검할수있도록 한다
	// 4. 로그인한 사용자의 ip 정보

	private int idx;// 순번
	private int retry;// 로그인 시도횟수
	private long lastFailedLogin;// 마지막으로 실패한 로그인 시간
	private long lastSuccessedLogin;// 마지막으로 성공한 로그인 시간
	private String clientIp;// 로그인한 사용자의 ip주소
	
	
	public LoginHistory() {
		super();
	}


	public LoginHistory(int idx, int retry, long lastFailedLogin, long lastSuccessedLogin, String clientIp) {
		super();
		this.idx = idx;
		this.retry = retry;
		this.lastFailedLogin = lastFailedLogin;
		this.lastSuccessedLogin = lastSuccessedLogin;
		this.clientIp = clientIp;
	}


	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}


	public int getRetry() {
		return retry;
	}


	public void setRetry(int retry) {
		this.retry = retry;
	}


	public long getLastFailedLogin() {
		return lastFailedLogin;
	}


	public void setLastFailedLogin(long lastFailedLogin) {
		this.lastFailedLogin = lastFailedLogin;
	}


	public long getLastSuccessedLogin() {
		return lastSuccessedLogin;
	}


	public void setLastSuccessedLogin(long lastSuccessedLogin) {
		this.lastSuccessedLogin = lastSuccessedLogin;
	}


	public String getClientIp() {
		return clientIp;
	}


	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	
	
	
	
	
	
	
}
