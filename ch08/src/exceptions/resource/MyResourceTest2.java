package exceptions.resource;

public class MyResourceTest2 {
	
	public static void main(String[] args) throws Exception {

		MyResource res1 = null;
		
		try {
		res1 = new MyResource("res1");
		
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));

		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {	//리소스 닫는 코드는 여기에 작성함
			res1.close();	
		}
	}
}
