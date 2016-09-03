package com.hanium.myapp.alarm;
import com.hanium.myapp.Texttemplete;

/**
 * Handles requests for the application home page.
 */

public class HomeAlarm extends Texttemplete{
	
	public String initmessage()
	{
		String text = "환영합니다. 당신은 알람을 선택하였습니다~\n" +
					  "1. 알람 설정 선택\n" +
					  "2. 알람 확인 선택\n" +
					  "3. 알람 취소 선택\n";
		settext(text);
		setno(2000);
				
		return text;
	}
	
}
