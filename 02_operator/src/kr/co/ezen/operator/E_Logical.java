package kr.co.ezen.operator;

import java.util.Scanner;

public class E_Logical {

	public void method1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 하나 입력:");
		int num=sc.nextInt();
		System.out.println("1부터 100사이 인지 확인:"+(num >=1 && num<=100));
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자 하나 입력:");
		char ch=sc.next().charAt(0);
		System.out.println("영어 대문자인지 확인:"+(ch>='A' && ch<='Z'));
		
		System.out.println("계속 하실려면 y혹은 Y를 입력:");
		char ch2=sc.next().charAt(0);
		System.out.println("영문자 y인지:"+(ch2 == 'y' || ch2 =='Y'));
	}

	public void method3() {
		int num=10;
		boolean result=false && num>0;
		System.out.println("result확인:"+result);
		System.out.println("num="+num);
		
		boolean result2=true || num>0;
		System.out.println("result2확인"+result2);
		System.out.println("num="+num);
	}

	public void method4() {
		int a=2;
		int b=3;
		
		boolean c=a>b; // c=false
		boolean d=++a <= b++; // d=true
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println();
		System.out.println("!c:"+!c);
		System.out.println("c != d:"+(c != d));
		System.out.println("(a%b)==1:"+((a%b)==1));
		
	}
	
}







