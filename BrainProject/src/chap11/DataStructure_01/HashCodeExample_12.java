package chap11.DataStructure_01;

public class HashCodeExample_12 {
	
	public static void main(String[] args) {
		String obj1=new String("루피");
		String obj2=new String("루피");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		// 해쉬코드: 해당 되는 문자열을 주면 번호를 만들어 줌 --> 우린 이 과정을 알필요없다!
		/* 톰캣 실행
		1522004
		1522004
		ㄴ 위에 처럼 똑같이 번호가 만들어져 나옴
		 */
		
		Integer obj3=new Integer(5);
		Integer obj4=new Integer(5);
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		/* 톰캣 실행
		5
		5
		 */
		
	}
}
