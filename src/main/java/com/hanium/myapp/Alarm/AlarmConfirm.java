package com.hanium.myapp.Alarm;

public class AlarmConfirm {
	private String text;
	private int state;
	
	public String initmessage()
	{
		String text = "ȯ���մϴ�. �����  �˶� Ȯ����  �����Ͽ����ϴ�~\n Ȯ���� �˶� ������ ������ �ּ���." ;
		
		this.text = text;
		this.state = 2200; 
				
		return this.text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNo() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
