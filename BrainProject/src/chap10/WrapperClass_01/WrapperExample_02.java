package chap10.WrapperClass_01;

public class WrapperExample_02 {

	public static void main(String[] args) {     // 메인에 있는 매개변수 String타입
		int total=0;
		
		for(int cnt=0;cnt<args.length;cnt++) {   // 래퍼 클래스 반복문
			Integer obj=new Integer(args[cnt]);  // 문자열의 값을 정수 타입에 준다는 것 (가능함 아무거나 되는건 아님) --> 문자열을 숫자에게 준다
			total += obj.intValue();
		}
		
		System.out.println(total);
	}

} 
// 톰캣 실행 --> 파일에 가서 마우스 우클릭 Run As -> 
// Run configurations  누르고 -> Arguments 첫번째에 숫자를 넣음 뜸


// 문자열 처리 가능
// 단, 숫자로 구성 되어 있을 경우 a200(X)



