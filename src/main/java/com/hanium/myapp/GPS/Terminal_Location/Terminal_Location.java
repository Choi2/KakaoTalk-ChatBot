package com.hanium.myapp.GPS.Terminal_Location;

public class Terminal_Location {
	
	private String text;
	private int no;
	
	public String initmessage()
	{
		String text = "ȯ���մϴ�. ����� ��ġ Ȯ���� �����Ͽ����ϴ�~\n" +
					  "���� ������ ���ּ���.";
			
		this.text = text;
		this.no = 3100; 
				
		return this.text;
	}
	
	public int getno() { return this.no; }
	
}
