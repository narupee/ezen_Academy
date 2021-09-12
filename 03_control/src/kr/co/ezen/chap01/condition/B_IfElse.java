package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class B_IfElse {  // Else : 이 조건이(sysout) 거짓일때 하는것!
	public void method1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("숫자 한 개를 입력하세요.:");
	int num=sc.nextInt();
	
	if(num > 0) {
		System.out.println("입력하신 숫자는 양수 입니다.");
	}else {
		System.out.println("입력하신 숫자는 움수 입니다.");
	}
	
	if(num > 0) { // <-이 족건이 참일때 2개를 실행하겠다 하는 방법  (참고 문제임!)
		System.out.println("입력하신 숫자는 양수 입니다.");  // if 참일땐 이 부분만 실행 하며 무조건 첫번째!
		System.out.println("입력하신 숫자는 양수2 입니다."); // 거짓일땐 이 부분을 함!
	}else { 
		System.out.println("입력하신 숫자는 움수 입니다.");
	} // Run은 실행할때 안나옴! 거짓일때만 나옴!
	
	if(num == 0) { // 음수 처리 하고 싶을때! + if(num == 0) 은 0을 양수라고 가정함!
		System.out.println("입력하신 숫자는 0입니다.");
	} // Run은 실행할때 안나옴! 거짓일때만 나옴!
	
	System.out.println("프로그램 종료.");
	
	}
	
	public void method01() {  
		// 1번 문제에서 위치, 순서 변경 하고 싶을때 이렇게!
		// 나온답) 숫자한개 입력에서 '0'을 입력하면 -> " 입력하신 숫자는 0입니다 " 이것만 나옴!
		// 그 이유는 " else if " 를 사용 했기 때문! 
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 한 개를 입력하세요.:");
		int num=sc.nextInt();
	
	if(num > 0 ) {
        System.out.println("입력하신 숫자는 양수입니다.");
	}
	
	else if(num == 0) { 
        System.out.println("입력하신 숫자는 0입니다");
     }else {
        System.out.println("입력하신 숫자는 음수입니다.");
     }
     
     System.out.println("프로그램 종료.");
}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 한개를 입력하세요:");
		int num=sc.nextInt();
		
		String str=num % 2 == 0 ? "짝수다" : "홀수다";
		
		if (num %2 == 0) {
			System.out.println("홀수 입니다.");
		}
		
		if (num %2 != 0) {
			System.out.println("짝수 입니다.");
		}
		
		System.out.println("프로그램 종료.");
	}
	
	public void method3() {
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
		
		String student=null; 
		
		if (gender == 'M' || gender == 'm' ) {
			student = "남학생";
		}if (gender == 'F' || gender == 'f') {
			student = "여학생";
		}
		
		if(gender != 'M' && gender != 'F' && gender != 'm' && gender != 'f') {
		System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 :");
		int age=sc.nextInt();
		
		String str=null;
		
		
		if (age <= 13) {
			str="어린이";
		}else {
			str="청소년";
		}
		if (age > 19) {
			str="성인";
		}
		System.out.println(str);
		
		sc.close();
		
	}
	
	public void method5() {
		Scanner sc=new Scanner(System.in);  // 다적고 ctrl+shift+한영키 누르면 import 바로 적용됨!!
		System.out.print("국어 :");
		int kor=sc.nextInt();
		System.out.print("영어 :");
		int eng=sc.nextInt();
		System.out.print("수학 :");
		int math=sc.nextInt();
		
		
		int sum=kor+eng+math;
		
		// double avg=(double) sum/3;
		double avg=sum/3.0; // 정수/정수==>정수, 정수/실수==>실수
		System.out.println("총 합계 :"+sum);
		System.out.println("총 평균 :"+avg);
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		sc.close();
		
	}
	
	public void method6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("주민 번호를 입력하ㅔ요(-포함) :");
		char pId=sc.nextLine().charAt(7);
		
		if(pId == '1' && pId =='3') {
			System.out.println("남자 입니다");
		}else {
			System.out.println("여자 입니다");
		}
		
		if(pId !='1' && pId !='2' && pId !='3' && pId !='4') {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void method7() {
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
		
		if((input <= num1) || (input > num2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	public void method8() {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.println("입력1 :");
		num1=sc.nextInt();
		System.out.println("입력2 :");
		num2=sc.nextInt();		
		System.out.println("입력3 :");
		num3=sc.nextInt();
		
		boolean isTrue=(num1 == num2 ) && (num2 == num3);
		if(isTrue) {
			System.out.println("세 수가 모두 같습니다.");
		}else {
			System.out.println("세 수가 모두 같지 않습니다.");
		}
		
		sc.close();
		
	}
	
}


