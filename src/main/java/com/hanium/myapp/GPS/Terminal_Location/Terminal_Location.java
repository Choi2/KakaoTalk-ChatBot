<<<<<<< HEAD
package com.hanium.myapp.GPS.Terminal_Location;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.XML;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Terminal_Location {
	
	private String text;
	private int no;
	
	public String initmessage()
	{
		String text = "환영합니다. 당신은 위치 확인을 선택하였습니다~\n" +
					  "지역 선택을 해주세요.\n";
				//	  "1. "
			
		this.text = text;
		this.no = 3100; 
				
		return this.text;
	}
	
	public int getno() { return this.no; }
	
	
	public String detail_terminal(String answer) throws IOException, Exception
	{
		 StringBuilder urlBuilder = new StringBuilder("http://openapi.tago.go.kr/openapi/service/ExpBusInfoService/getExpBusTrminlList"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=OeaajrjAncBXR7lHGuulY7SMYdiLLey0%2FEHM4u9Rwhzah5sjRCUygc8fngUNc%2BTBRPaKtQU%2FlnXf5HNj4rA6dg%3D%3D"); /*Service Key*/
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	 
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "UTF-8"));
	        }
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        
	        org.json.JSONObject obj = XML.toJSONObject(sb.toString());
	        String tmp = obj.toString();
	        JSONParser parser = new JSONParser();
	        
	        JSONObject total = (JSONObject) parser.parse(tmp); 
	        JSONObject response = (JSONObject) total.get("response");
	        JSONObject body = (JSONObject) response.get("body");
	        
	        JSONArray items = (JSONArray)((JSONObject) body.get("items")).get("item");
	        

	        System.out.println(items.toString());
	        
	        
	        switch(answer)
	        {
	        case "1" :
	        	
	        	break;
	        	
	        case "2" :
	        	
	        	break;
	        	
	        case "3" :
	        	
	        	break;
	        	
	        case "4" :
	        	
	        	break;
	        	
	        case "5" :
	        	
	        	break;
	        	
	        case "6" :
	        	
	        	break;
	        	
	        case "7" :
	        	
	        	break;
	        
	        }
	        
	        
	        
	        return "0";
	}
	
	
	
}
=======
package com.hanium.myapp.GPS.Terminal_Location;

public class Terminal_Location {
	
	private String text;
	private int no;
	
	public String initmessage()
	{
		String text = "환영합니다. 당신은 위치 확인을 선택하였습니다~\n" +
					  "지역 선택을 해주세요.";
			
		this.text = text;
		this.no = 3100; 
				
		return this.text;
	}
	
	public int getno() { return this.no; }
	
}
>>>>>>> branch 'master' of https://github.com/Choi2/Project-SookMyong.git
