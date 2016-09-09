package com.hanium.myapp;

import org.json.simple.JSONObject;

import com.hanium.myapp.DB.BackDBCheck;
import com.hanium.myapp.GPS.MyLocation.MyLocation;
import com.hanium.myapp.GPS.Terminal_Location.Terminal_Location;
import com.hanium.myapp.alarm.setting.alarm_setting;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class FunctionController { //해당 함수에 대한 텍스트 리턴

	private String text; 
	private int location;
	
	public String getaddress(int current, JSONObject jsonObj, SqlSession sqlSession) throws Exception
	{
		
		String answer = (String) jsonObj.get("content");
		
		if(answer.contains("00"))
		{
			BackDBCheck back = new BackDBCheck(current, sqlSession);
			current = back.getcurrent();
		}
		
		
		
		switch(current)
		{
		

			case 2000:
			{
				if(answer.contains("1"))
				{
					alarm_setting init = new alarm_setting();
					text = init.gettext();
					location = init.getno();
				}
				
				break;
			}
		
			
			
			case 3000 :
			{
				if(answer.contains("1"))
				{
					Terminal_Location init = new Terminal_Location();
					text = init.initmessage();
					location = init.getno();
				}
				
				else if(answer.contains("2"))
				{
					MyLocation init = new MyLocation();
					text = init.initmessage();
					location = init.getno();
				}
				
				break;
			}
			
			case 3100 :
			{
				Terminal_Location init = new Terminal_Location();
				text = init.detail_terminal(answer);
			}
			
			
			default : //basic
			{
				text = "0";
				location = 0;
				break;
			}
		}
		
		return this.text;
	}

	public int get_currentlocation() { return this.location;}
	
}
