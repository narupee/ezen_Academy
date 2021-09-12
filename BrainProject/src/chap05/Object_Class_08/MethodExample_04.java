package chap05.Object_Class_08;

public class MethodExample_04 { // 예외처리 2021-08-26
	
//	저기throw 작성하신건 예외 발생 강제로 시키려고 만드신거고
//	그 예외를 throws Exception으로
//	저기 example클래스의
//	withdraw메서드 호출한곳으로
//	강제발생시킨 예외를 떠넘긴거라
//	저기서 try catch해서 예외를 처리하겠다
	

	public static void main(String[] args) {
		Account obj=new Account("777-777-777777", "최대박",10);
		
		try {
			int amount=obj.withraw(100000000);
			System.out.println("인출액:"+amount);
		}
		catch(Exception e) {
			String msg=e.getMessage();
			System.out.println(msg);
				
		}
	}
}
