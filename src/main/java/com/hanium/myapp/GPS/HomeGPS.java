package com.hanium.myapp.GPS;

/**
 * Handles requests for the application home page.
 */

public class HomeGPS {
	
	private String text;
	private int no;
	
	public String initmessage()
	{
		String text = "ȯ���մϴ�. ����� ��ġ Ȯ���� �����Ͽ����ϴ�~\n" +
					  "1. �͹̳� ��ġ ����\n" +
					  "2. ���� ���� ��ġ ����";
			
		this.text = text;
		this.no = 3000; 
				
		return this.text;
	}
	
	public int getno() { return this.no; }
	
}
