package kr.co.ezen.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수:");
		int num=sc.nextInt();
		
		String str=(num > 0) ? "양수다" : "양수가 아니다.";
		System.out.println(str);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수:");
		int num=sc.nextInt();
		
		String str=(num > 0) ? "양수다" :(num == 0 ? "0이다" : "음수다");
		System.out.println(str);
		
		sc.close();
	}
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수:");
		int num=sc.nextInt();
		
		String str=num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(str);
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		int people;
		int candy;
		
		System.out.print("인원수 :");
		people=sc.nextInt();
		
		System.out.print("사탕 개수 :");
		candy=sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :"+candy / people);
		System.out.println("남는 사탕 개수 :"+candy % people);
		
		sc.close();
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 :");
		String name=sc.nextLine();
		System.out.print("학년(숫자만) :");
		int grade=sc.nextInt();
		System.out.print("반(숫자만) :");
		int classNum=sc.nextInt();
		System.out.print("번호(숫자만) :");
		int num=sc.nextInt();
		System.out.print("성별(M/F) :");
		char gender=sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째 자리까지) :");
		double score=sc.nextDouble();
		
		String student=gender == 'M' ? "남학생" :"여학생";
		
		System.out.println();
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + "의 성적은 " + score + "이다.");
		
		sc.close();
	}
	
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 :");
		int age=sc.nextInt();
		
		String str=age <= 13? "어린이" :(age > 19 ? "성인" : "청소년");
		
		System.out.println(str);
		
		sc.close();
	}
	
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 :");
		int kor=sc.nextInt();
		System.out.print("영어 :");
		int eng=sc.nextInt();
		System.out.print("수학 :");
		int math=sc.nextInt();
		
		System.out.println();
		
		int sum=kor+eng+math;
		double avg=sum/3.0; // 정수/정수==>정수, 정수/실수==>실수
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+avg);
		
		String result=kor >= 40 && eng >=40 && math >=40 && avg >= 60 ? "합격" :"불합격";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("주민 번호를 입력하세요(-포함) :");
		char pId=sc.nextLine().charAt(7);
		String gender= pId == '1' || pId == '3' ? "남자":"여자";
		System.out.println(gender);
		
		sc.close();
	}
	
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int input;
		
		System.out.print("정수1 :" );
		num1=sc.nextInt();
		System.out.print("정수2 :" );
		num2=sc.nextInt();
		System.out.print("입력 :");
		input=sc.nextInt();
		
	}
	
	public void practice10() {
	      Scanner sc=new Scanner(System.in);
	      System.out.print("입력1 : ");
	      int num1=sc.nextInt();
	      System.out.print("입력2 : ");
	      int num2=sc.nextInt();
	      System.out.print("입력1 : ");
	      int num3=sc.nextInt();
	      
	      System.out.println(num1==num2&& num2==num3?"true":"false");
	      
	      sc.close();
	
	
	
	}

}
