package com.hanium.myapp.Alarm;

public class AlarmCancel {
	private String text;
	private int state;
	
	public String initmessage()
	{
		String text = "ȯ���մϴ�. �����  �˶� �����  �����Ͽ����ϴ�~\n" +
					  "����� ��ȣ�� ������ �ּ���.";
		
		this.text = text;
		this.state = 2300; 
				
		return this.text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}	
}
