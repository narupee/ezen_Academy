package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void variablePractice4() {
		String eng;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요:");
		eng=sc.nextLine();
		
		System.out.println("첫번째문자:"+eng.charAt(0));
		System.out.println("두번째문자:"+eng.charAt(1));
		System.out.println("세번째문자:"+eng.charAt(2));
		
		sc.close();
	}

}
