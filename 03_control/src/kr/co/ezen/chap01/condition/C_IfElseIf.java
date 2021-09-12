package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	// if(조건식) {
	//       실행할 문장1;
	//   }else if(조건식) {
	//       실행할 문장2;
	//   }else {
	//       실행할 문장3;
	//   }  cf: 아닐때가 어디에 해당 되는지가 중요
	public void method1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 한개 입력하세요.");
		int num=sc.nextInt();
		
		if(num > 0) {
			System.out.println("입력하신 숫자는 양수입니다.");
		}else if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		
		sc.close();
		
	}
	
	public void method2() {
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
		}else if (gender == 'F' || gender == 'f') {
			student = "여학생";
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println(grade + "학년" + classNum + "반" + num + "번" + gender + "성별" + name + "" + student + "의 성적은" + score);
		
		
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 :");
		int age=sc.nextInt();
		
		String str=null;
		
		
		if (age <= 13) {
			str="어린이";
		}else if(age > 19) {
			str="성인";
		}else {
			str="청소년";
		}
		
		System.out.println(str);
		
		sc.close();
		
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("주민 번호를 입력하ㅔ요(-포함) :");
		char pId=sc.nextLine().charAt(7);
		
		if(pId == '1' || pId =='3') {
			System.out.println("남자 입니다");
		}else if(pId == '2' || pId == '4') {
			System.out.println("여자 입니다");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void method5() {
		// 점수를 하나 입력 받아 등급을 나누어 점수와 등급을 출력하시오.
		// 등급은, 90점 이상은 A등급
		// 90점 미만 80점 이상은 B등급
		// 80점 미만 70점 이상은 C등급
		// 70점 미만 60점 이상은 D등급
		// 60점 미만 F등급으로 나눈다.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score=sc.nextInt();
		char grade=' '; // 초기화(: 처음에 주는 값)
		
		if(score >= 90) {
			grade='A';
		}else if(score <90 && score >=80) {
			grade='B';
		}else if(score <80 && score >=70) {
			grade='C';
		}else if(score <70 && score >=60) {
			grade='D';
		}else {
			grade='F';
		}

		System.out.println("당신의 점수는"+score+"이고, 등급은"+grade+"입니다");
		System.out.printf("당신의 점수는 %d이고, 등급은 %c입니다.",score,grade);
		
		sc.close();
		
	}
	
	public void method6() {
		// 점수 등급별 중간 점수 이상의 경우에는
		// 등급에 "+" 라는 문자를 추가하여 출력
		// 예) 95점 이상은 A+로 출력
	Scanner sc=new Scanner(System.in);
	System.out.println("점수를 입력하세요.");
	int score=sc.nextInt();
	String grade=" ";
	
	if(score >= 95) {
		grade="A+";
	}else if(score >= 90) {
		grade="A";
	}else if(score <90 && score >=80) {
		grade="B";
	}else if(score <80 && score >=70) {
		grade="C";
	}else if(score <70 && score >=60) {
		grade="D";
	}else {
		grade="F";
	}

	System.out.println("당신의 점수는"+score+"이고, 등급은"+grade+"입니다");
	
	sc.close();
	
}
	
	public void method7() {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int score=sc.nextInt();
		
		String grade="";
		
		if(score >= 90 ) {
			grade="A";
			if(score >= 95) {
				grade +="+"; // grade = grade + "+"; 복합된연산자
			}
		}else if (score >= 80) {
			grade="B";
			if(score >= 85) {
				grade +="+";
			}
		}else if (score >= 70) {
			grade="C";
			if(score >= 75) {
				grade +="+";
			}
		}else if (score >= 60) {
			grade="D";
			if(score >= 65) {
				grade +="+";
			}
		}else {
			grade="F";
		}
		
		System.out.println("당신의 점수는"+score+"이고, 등급은"+grade+"입니다.");
		
		sc.close();
	}
	
	public void method8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 :");
		int kor=sc.nextInt();
		System.out.print("영어 :");
		int eng=sc.nextInt();
		System.out.print("수학 :");
		int math=sc.nextInt();
		
		
		int sum=kor+eng+math;
		double avg=sum/3.0; 
		
		System.out.println("총 합계 :"+sum);
		System.out.println("총 평균 :"+avg);
		
		if(kor >= 40 && eng >= 40 && math >=40 && avg >= 60) {
			if(avg >= 60) {
			    System.out.println("합격");
			}else {
				System.out.println("평균이 부족합니다.");
			}
		}else {
			System.out.println("기준을 넘지 못했습니다.");
		}
		
		sc.close();
	}
}
