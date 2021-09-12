package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class A_If { //If 만약 (조건)이 참,거짓 인지 알아보는것

	public void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요:");
		int num=sc.nextInt();
		
		if(num > 0) { // ★ If에서 조건이 참이면 "무조건 첫번째 명령문을 실행함"
			System.out.println("입력하신 숫자는 양수입니다.");
		} // ★ 이건 무조건 참일때만 가능 펄스일때는 불가능 이렇게 하는 이유는 가독성을 위함 or 실행문이 2개 이상 일때 {} 각자 해주기
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(num < 0 ) {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		System.out.println("프로그램 종료");
		// 프로그램은 위에서 아래로 실행 되기 때문에 계속 만들어 갈 수 있다!
		
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 ");
		int num=sc.nextInt();		
		
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수 입니다.");
		}
		
		if(num % 2 != 0) {
		// if(num % 2 == 1) 이것도 가능
		    System.out.println("입력하신 숫자는 홀수 입니다.");
		}
		
		System.out.println("프로그램 종료");
		
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
		// String student=null;     <- 변수 선언 안한 경우 예시 (1)
		
		//if(gender == 'M' || gender == 'm') {
		// String student="남학생";
		// }  <- 변수 선언 안한 경우 예시 (1)
		
		if(gender == 'M' || gender == 'm') {
			student="남학생";
		}
		
		if(gender == 'F' || gender == 'f') {
			student="여학생";
		}
		
		if(gender != 'M' && gender != 'F' && gender != 'm' && gender != 'f' ) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " + name + " " + student + "의 성적은 " + score + "이다.");
		
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("나이:");
		int age=sc.nextInt();
		
		String str=null;
		
		if( age <= 13 ) {
			str="어린이";
		}
		
		if( age > 13 && age <= 19 ) {
			str="청소년";
		}
		
		if( age > 19 ) {
			str="성인";
		}
		
		System.out.println(str);
	}
	
	public void method5() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어 :");
		int kor=sc.nextInt();
		System.out.print("영어 :");
		int eng=sc.nextInt();
		System.out.print("수학 :");
		int math=sc.nextInt();
	
		int sum= kor+eng+math;
		double avg=sum/3.0;
		
		System.out.println("총합계 :"+sum);
		System.out.println("총평균 :"+avg);
		
		String result=kor >= 40 && eng >=40 && math >=40 && avg >= 60 ? "합격" :"불합격";
		System.out.println(result);
		
		if ( kor > 40 || eng > 40 || math > 60) {
			System.out.println("합격");
		}
		
		if ( kor < 40 || eng < 40 || math < 60) {
			System.out.println("불합격");
			}
		
	}
	
	public void method6() {
		Scanner sc=new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(-포함)");
		char pId=sc.nextLine().charAt(7);

		
		if (pId == '1' || pId =='3') {
			System.out.println("남자입니다.");
			}
		
		if (pId == '2' || pId =='4') {
			System.out.println("여자입니다.");
			}
		
		if (pId != '1' && pId !='2' && pId != '3' && pId != '4') {
			System.out.println("잘못입력하셨습니다.");
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
		
		if ((input <= num1) || (input <= num2)) {
			System.out.println(true);
		}
		
		if ((input > num1) && (input > num2)) {
			System.out.println(false);
		}
		// 또는
		
		if ( ! (input <= num1) || ! (input < num2)) {
			System.out.println(false);
		}
		
		if ( ! (input <= num1) && ! (input < num2)) {
			System.out.println(false);
		}
	}
	
		public void method8() {
		      Scanner sc=new Scanner(System.in);
		      int num1;
		      int num2;
		      int num3;
		      
		      System.out.print("입력1 : ");
		      num1=sc.nextInt();
		      System.out.print("입력2 : ");
		      num2=sc.nextInt();
		      System.out.print("입력3 : ");
		      num3=sc.nextInt();
		      
		      boolean isTrue=( num1 == num2 ) && (num2 == num3);
		      
		      if(isTrue) {
		      System.out.println("세수가 모두 같습니다.");
		      }
		      if(isTrue) {
		      System.out.println("세수가 모두 같지 않습니다.");
		      sc.close();
		      }
			
		
	}
}


