package kr.co.ezen.variable;

import java.util.Scanner;

public class C_keyboardinput {
	
	// java.util 패키지에서 제공하는 클래스를 이용한 키보드 입력
	public void inutScanner1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 이름은 무엇 입니까?");
		String name=sc.next(); // 공백 미포함
		//String name=sc.nextLine();
		System.out.println("당신의 나이는 몇살입니까?");
		int age=sc.nextInt();
		System.out.println("당신의 키는 몇입니까");
		double height=sc.nextDouble();
		
		System.out.println("이름은"+name+"나이는"+age+"키는"+height);
		
		sc.close();
	}
	
	public void inputScanner2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름:");
		String name=sc.nextLine();
		
		System.out.println("나이:");
		int age=sc.nextInt();
		
		//sc.nextLine();
		System.out.println("주소:");
		//String address =sc.nextLine(); 바로 위 주석이랑 이거랑 같이 써도 됨
		String address=sc.next();
		
		System.out.println("키:");
		double height=sc.nextDouble();
		
		System.out.println(name+"님은"+age+"세이며,사는 곳은"+address+"이고,키는"+height);
		
		sc.close();
		
	}
	
	public void inputScanner3() {
		String name;
		char gender;
		int age;
		double height;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름:");
		name=sc.nextLine();
		System.out.println("성별(M/F)");
		gender=sc.nextLine().charAt(0);
		System.out.println("나이:");
		age=sc.nextInt();
		System.out.println("키:");
		height=sc.nextDouble();
		
		System.out.println(name+"님의 개인 정보");
		System.out.println("성별"+gender);
		System.out.println("나이"+age);
		System.out.println("키"+height);
		
		sc.close();
	}
	

}
