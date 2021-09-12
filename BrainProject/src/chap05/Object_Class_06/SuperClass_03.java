package chap05.Object_Class_06;

public class SuperClass_03 {
	final String name= "gemini";               // final : 값 고정 (같이 사용하면 못바꿈)
//	String name="gemini";
	int age=10;
	
	public void printinfo() {                  // 여기에선 public 생략 가능, 붙여도 상관없음
		System.out.println(name+":"+age);
	}
	
	public void changeValue() {                  
//		name="johnharu";                       // final 을 해주면 여기서도 'name'이 오류가 되어 값이 안바뀜 그러므로 위에서 같이 고정을 시켜야함 
		age=20;
	}
	

	public static void main(String[] args) {   // 프로그램을 실행할때 시작하는 메서드 main
		SuperClass_03 sc3=new SuperClass_03();
		sc3.printinfo();
		sc3.changeValue();
		sc3.printinfo();
//		sc3.name="gemini2";  // final 값 고정땜에 'name'에 에러 나는 경우를 보여준 예시  , 같은 가족이지만 final을 넣어버리면 값이 고정되어 못바꾼다
		
	}                                          // 다 같은 가족인 상태 = 내부 아이들
}
