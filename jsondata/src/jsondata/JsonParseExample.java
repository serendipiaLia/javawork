package jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParseExample {
	
	public static void main(String[] args) {
		// 파일로 부터 JSON 열기
		// 보조 스트림에 기반 스트림 연결
		Reader reader;
		try {
			reader = new FileReader("C:/File/member.json");
			BufferedReader br = new BufferedReader(reader);
			
			String json = br.readLine(); // 문자열로만든 json 1행 읽기
			br.close();
			
			System.out.println(json);
			
			//json parsing(해석) - 문자열로 출력됨
			JSONObject member = new JSONObject(json);
			System.out.println("- id : " + member.getString("id"));
			System.out.println("- name : " + member.getString("name")); 
			System.out.println("- age : " + member.getInt("age"));  // age는 int
			
			//객체 속성 정보 읽기 (tel, skill)
			JSONObject tel = member.getJSONObject("tel");
			System.out.println("- home tel. " + tel.getString("home"));
			System.out.println("- iPhone. " + tel.getString("iPhone"));
			
			// 배열 속성 정보 읽기 
			JSONArray skill = member.getJSONArray("skill");
			//array이므로 향상 for문으로 출력
			for(int i=0; i<skill.length(); i++) {
				System.out.print("/ skill : " + skill.get(i) + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} //m
} //c
