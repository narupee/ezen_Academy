package chap08.basicClass_01;

public class StringExample_02 {

	public static void main(String[] args) {
		String str1="자바";
		String str2="자바";
		// equals 는 문자열 값 비교 "자바"; 얘를~~
		
		//String str1=new String("Java");
		//String str2=new String("Java");  // new 새로만든다 --> 주소값 틀림!
		
		
//		if(str1.equals(str2))  // equals 는 문자열 값 비교 "자바"; 얘를~~
		if(str1 == str2)       // 변수의 참조변수 --> 주소값 비교
			System.out.println("같음");
		else {
			System.out.println("다름");
		}
	}
}
