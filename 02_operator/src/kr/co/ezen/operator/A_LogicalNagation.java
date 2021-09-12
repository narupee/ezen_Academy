package kr.co.ezen.operator;

import java.util.Scanner;

public class A_LogicalNagation {

	public void method1() {
		System.out.println("true의 부정"+!true);
		System.out.println("false의 부정"+!false);
		
		boolean bool1=false;
		boolean bool2=true;
		
		System.out.println("bool1="+bool1);
		System.out.println("!bool1="+!bool1);
		System.out.println("bool2="+bool2);
		System.out.println("!bool2="+!bool2);
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 하나 입력:");
		int num=sc.nextInt();
		
		System.out.println("입력한 정수가 양수인가?"+(num>0)); // >,<
		System.out.println("입력한 정수가 양수인가?"+!(num<0));
	}
	
	
}
