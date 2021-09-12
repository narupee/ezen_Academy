package chap05.Object_Class_08; //08-27

public class MethodExample_16 {

	public static void main(String[] args) {
		printCharacter('*',30);
		System.out.println("Hello,java");
		printCharacter('-',30);
	}
		
	public static void printCharacter(char ch, int num) {   // 캐릭터타입 ' ' 씀! , 스트링은 " " 씀!
		for(int cnt=0; cnt<num; cnt++)
		System.out.println(ch);
		System.out.println();
		
	}
}
