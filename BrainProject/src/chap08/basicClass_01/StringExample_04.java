package chap08.basicClass_01;

public class StringExample_04 {

	public static void main(String[] args) {
		String str1=" Let it be. ";
		String str2=str1.trim();   // trim : 앞 뒤 공백 제거
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom.")); // cancat : 연결
		System.out.println(str2.toUpperCase()); // 대문자
		System.out.println(str2.toLowerCase()); // 소문자
		System.out.println(str2.replace('e', 'a'));  // e 가 a 로 바껴라
		System.out.println(str1);
		System.out.println(str2);  // 대입을 한거라 공백제공 나머진 그대로 나옴
		
	}
}


