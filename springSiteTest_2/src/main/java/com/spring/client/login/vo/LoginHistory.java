package com.spring.client.login.vo;

public class LoginHistory {

	// �α��� �õ� Ƚ�� ���ѽ� ����ؾ��� �׸� ����
	// 1. �α��� �õ�Ƚ��- �α��� �õ��ø��� 1�� �������� �õ�Ƚ���� 5���� ū ��� ���� �ð� ���� �α��α���� ��ݻ��°� �ǵ����ϳ�
	// 2. ���������� �����ѷα��νð�����-�̽ð� ������ �̿��Ͽ� �α��� ��ݻ��°� �����Ǿ�� �ϴ� �ð��� �����Ҽ��ִ�
	// 3. ���������� ������ �α��νð� ����- �̽ð� ������ �̿��Ͽ� ���������� �α����� �ð������� ����ڿ��� �˷������ν� �ڱ������ Ȥ��
	// �ٸ������
	// ���� ���Ǿ����� ���θ� ����ڰ� �����Ҽ��ֵ��� �Ѵ�
	// 4. �α����� ������� ip ����

	private int idx;// ����
	private int retry;// �α��� �õ�Ƚ��
	private long lastFailedLogin;// ���������� ������ �α��� �ð�
	private long lastSuccessedLogin;// ���������� ������ �α��� �ð�
	private String clientIP;// �α����� ������� ip�ּ�
	
	
	public LoginHistory() {
		super();
	}


	public LoginHistory(int idx, int retry, long lastFailedLogin, long lastSuccessedLogin, String clientIP) {
		super();
		this.idx = idx;
		this.retry = retry;
		this.lastFailedLogin = lastFailedLogin;
		this.lastSuccessedLogin = lastSuccessedLogin;
		this.clientIP = clientIP;
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


	public String clientIP() {
		return clientIP;
	}


	public void setClientIp(String clientIP) {
		this.clientIP = clientIP;
	}
	
	
	
	
	
	
	
}
