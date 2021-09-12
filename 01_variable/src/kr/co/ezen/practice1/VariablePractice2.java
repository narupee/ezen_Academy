package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void VariablePractice2() {
		int a, b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫 번째 정수:");
		a=sc.nextInt();
		System.out.println("두 번째 정수:");
		b=sc.nextInt();
		
		System.out.println("더하기 결과:"+(a+b));
		System.out.println("빼기 결과:"+(a-b));
		System.out.println("곱하기 결과:"+(a*b));
		System.out.println("나누기 몫 결과:"+(a/b));
	}

}
