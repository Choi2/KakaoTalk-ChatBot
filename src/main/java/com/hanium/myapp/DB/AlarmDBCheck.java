package com.hanium.myapp.DB;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;

import com.hanium.myapp.Alarm.ReservationDTO;

public class AlarmDBCheck {
	private SqlSession sqlSession;
	private HashMap<String, String> input;
	
	public AlarmDBCheck(SqlSession sqlSession, String user_key) throws ParseException
	{
		//String user_key =  (String) jsonObj.get("user_key");
		this.sqlSession = sqlSession;
		input = new HashMap<String, String>();
		input.put("user_key", user_key);
	//	logger.info(input.get("user_key"));
	}
	
	public List<ReservationDTO> getReservations(){ //userkey�� ������ ������ �ִ� ���೻�� ��������
		List<HashMap<String, String>> outputs = sqlSession.selectList("userControlMapper.client_check", input);
		LinkedList<ReservationDTO> reservations = new LinkedList<ReservationDTO>();
		Map<String, String> re = null;
		
		for(int i=0; i<outputs.size(); i++){
			re = outputs.get(i);
			
			int no = Integer.parseInt(re.get("no"));
			String user = re.get("user");
			String dep_ter = re.get("dep_ter");
			String arr_ter = re.get("arr_ter");
			String dep_time = re.get("dep_time"); //DateŸ�� //�������Ű���
			String res_time = re.get("res_time"); //TimestampŸ��//�������Ű���
			String level = re.get("level");
			int adult = Integer.parseInt(re.get("adult"));
			int child = Integer.parseInt(re.get("child"));
			
			reservations.add(new ReservationDTO(no,user,dep_ter,arr_ter,dep_time,res_time,level,adult,child));
		}
		return reservations;
	}
}
