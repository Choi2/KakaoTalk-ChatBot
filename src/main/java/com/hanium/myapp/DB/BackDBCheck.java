package com.hanium.myapp.DB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class BackDBCheck {
	private int current;
	
	public BackDBCheck(int current,  SqlSession sqlSession)
	{
		  int back_location = 0;
		  HashMap<String, String> input = new HashMap<String, String>();
		  input.put("no", String.valueOf(current));
		  List<HashMap<String, String>> outputs = sqlSession.selectList("userControlMapper.process_check", input);
		  Map<String, String> tmp = outputs.get(0);
		  if(tmp.get("parent")!= null)
			  back_location = Integer.parseInt(tmp.get("parent"));
		  
		  current = back_location;
	}
	
	public int getcurrent() {return this.current;} 
}
