package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonCreateExample {
	
	public static void main(String[] args) {
	
		JSONObject member = new JSONObject();
		
		// "속성" : "속성 값(문자열)" 추가 
		member.put("id", "sky123");
		member.put("name", "강하늘");
		member.put("age", 28);
		
		// 객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("iPhone", "010-1111-2222");
		member.put("tel", tel); //member객체에 추가
		
		// 배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("JAVA");
		skill.put("C");
		skill.put("C++");
		member.put("skill", skill); //member객체에 skill배열 추가
			//{"skill":["JAVA","C","C++"], -> 순서 상관없이 나옴
		
		
		// 문자열로 얻기
				String json = member.toString();
				System.out.println(json);
				
				// 멤버 객체 출력
				//System.out.println(member); 
				
				//파일에 쓰기
				try {
					Writer writer = new FileWriter("C:/File/member.json",
							Charset.forName("utf-8"));
					writer.write(json); // json 데이터를 문자열로 쓰기
					writer.flush();
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

}
