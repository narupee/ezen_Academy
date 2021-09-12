package kr.co.ezen.chap01.run;

public class Test {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;  // 선언만 해놓고 안써도 됨
		
		
		if( a < 5 )
			b=10;
		int d=0;
		System.out.println(b);
		System.out.println(d);
		
		//if( a > 5 )
			//int e=100;    // if 문에서 int 3=100은 할 수도 안 할 수도 있는 경우 이므로 에러나옴! (원리를 이해해라)
		//System.out.println(e);
		
		if( a > 5 ) {
			int e=100;
		System.out.println(e);
		} // {}: 중괄호를 치게 되면 'e'라는 변수는 해당 되는 메서드 또는 블록 에서만 가능
		// cf) 지역변수 : 해당 되는 메서드 또는 블록 에서만 가능 
		// C언어 관련 이며, 자바와 공통된 {}의 의미와 변수 선언의 위치를 말하는 것! 이개념을 알아야함!
		// {}의 범위 안을 "블록" 이라고 한다
		
		
	}
	
}
