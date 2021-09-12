package chap08.basicClass_01;

public class StringExample_01 {

	public static void main(String[] args) {
		String str="자바 커피";   // ★★★★★★ 자바끝까지나와! 잘알아두도록!
		int len=str.length();
		
		System.out.println(len);
		System.out.println(str);
		
		
		for(int cnt=0;cnt<len;cnt++) {
			char ch=str.charAt(cnt);
			System.out.println(ch);
		}
		
		
	}
}
