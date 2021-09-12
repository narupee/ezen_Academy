package chap11.DataStructure_01; // 13번꺼 테스트

	import java.util.HashMap;

	class Name2{
		String firsName;
		String lastName;
		
		Name2(String fristName, String lastName){
			this.firsName=firsName;
			this.lastName=lastName;
		}
	}

	public class HashMapExample_14 {

		public static void main(String[] args) {
			Name2 obj1=new Name2("루피", "뽀");
			Name2 obj2=new Name2("루피", "뽀");
			// 객체생성 해서 저장된 값은 
			
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
					
			
			/* 톰캣 실행
			1508395126
			1638172114
			ㄴ 숫자 값이 다름~ 이 숫자 값은 Name 문자열 값이 아닌 
			객체생성에서의 저장한 주소값을 해쉬코드로 나타낸 숫자값.
			 */
	}

}

	
	