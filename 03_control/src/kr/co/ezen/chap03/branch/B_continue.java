package kr.co.ezen.chap03.branch;  // 2021-08-11

import java.util.Scanner;

public class B_continue {

	public void method1() {
		int sum=0;
		
		for(int k=1;k<101;k++) {
			if(k%4==0)
				continue;       // 위로 증가하러감, 밑으로 안내려감!
			System.out.print(k+"+");
			sum+=k;
		}
		System.out.println();
		System.out.println("sum :"+sum);
	}
	
	public void method2() {
		
		for(int dan=2;dan<10;dan++) {
			System.out.println("======"+dan+"단======");
			for(int su=1;su<10;su++) {                      // dan, su 두개다 짝수가 출력 안되게 하기!
				if(dan%2==0 || su%2==0) {
					continue;
				}
				System.out.println(dan+"*"+su+"="+(dan*su));
				
			}
			System.out.println();
		}
	}
	
	public void method3() {                                 // kr.co.ezen.practice.chap01 실습문제 시작
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num=sc.nextInt();
		
		if (num>0) {
			if (num %2 == 0) {
				System.out.println("짝수다.");
			
		}else {
			System.out.println("홀수다.");
		}
		}else
			System.out.println("양수만 입력해주세요.");
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어");
		int kor=sc.nextInt();
		System.out.println("영어");
		int eng=sc.nextInt();
		System.out.println("수학");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		System.out.println("총합계 :"+sum);
		System.out.println("총평균 :"+avg);
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("ㅊㅋ합격");
		}else {
			System.out.println("불합격");
		}
	}
	
	public void method5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String ID=sc.nextLine();
		System.out.print("비밀번호 입력:");
		String Pw=sc.nextLine();
		
		if(ID.equals("myID")&&(Pw.equals("myPassword12"))) {
			System.out.println("로그인 성공.");
		}else if(!ID.equals("myID")) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	    sc.close();
     }
	
	public void method6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("메뉴 번호를 입력하세요:");
		int meum=sc.nextInt();
		
		switch(meum) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 5:
			System.out.println("종료 메뉴입니다.");
			break;
		default:
			System.out.println("메뉴를 잘못 입력했습니다.");
		}
		sc.close();
	}
	
	public void method7() {
		Scanner sc=new Scanner(System.in);
//		1~12사이의 정수를 입력해서 봄, 여름, 가을, 겨울을 출력하세요.
		System.out.println("12, 1, 2:겨울");
		System.out.println("3, 4, 5:봄");
		System.out.println("6, 7, 8:여름");
		System.out.println("9, 10, 11:가을");
		System.out.println("1~12 사이의 번호를 입력하세요.");
		String season;
		int num=sc.nextInt();
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		default:
			season="잘 못 입력된 달";
		}
		System.out.println(num+"월은"+season+"입니다.");
	
	   sc.close();
  }
	public void method8() {
		Scanner sc=new Scanner(System.in);
		System.out.println("권한을 확인 해주세요.");
		String user=sc.next();
		
		switch (user) {
		case "관리자":
			System.out.println("회원 관리 ");
			System.out.println("게시글 관리 ");
		case "회원":
			System.out.println("게시글 작성 ");
			System.out.println("댓글 작성 ");
		case "비회원":
			System.out.println("게시글 조회 ");
			break;
		default:
			System.out.println("권한을 다시 입력해주세요.");
		}
		System.out.println(user+"입니다.");
		
	    sc.close();
  }
	
	public void method9() {
		Scanner sc=new Scanner(System.in);
		System.out.println("키(m)를 입력해주세요:");
		Double kg=sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요:");
		Double m=sc.nextDouble();
		
		double bmi=kg/(m*m);
		String b=null;
		
	      if(bmi<18.5) {
	          b="저체중";
	       }else if(bmi<23) {
	          b="정상 체중";
	       }else if(bmi<25) {
	          b="과체중";
	       }else if(bmi<30) {
	          b="비만";
	       }else {
	          b="고도비만";
	       }
	       
	       System.out.println("BMI 지수:"+bmi);
	       System.out.println(b);
	}
	
	public void method10() {                    // 이건 무조건 또 보고 이해하기...
		Scanner sc=new Scanner(System.in);
		System.out.print("피연산자1 입력:");
		int i=sc.nextInt();
		System.out.print("피연산자2 입력:");
		int j=sc.nextInt();
//		 sc.nextLine();                     안됌
		System.out.print("연사자 입력(+,-,*,/,% :)");
		char op=sc.next().charAt(0);
//		char ch=sc.nextLine().charAt(0);    안됌
		
		double result1;  // 실수형 계산값을 저장하기 위한 변수
		int result;      // 정수형 계산값을 저장하기 위한 변수  
		
		if(i>=0 && j>=0) {
			switch(op) {
			case '+':
			    result= i+j;
			    break;
			case '-':
				result= i-j;
				break;
			case '*':
				result= i*j;
				break;
			case '/':
				result1=(double)i/j;
				System.out.printf("%d %c %d=%.6f",i,op,j,result1);
				return;
			case '%':
				result= i%j;
				break;
			default:
				System.out.println("연산기호를 잘못입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			}else {
				System.out.println("음수를 입력했습니다. 프로그램을 종료합니다.");
			return;
		}
			System.out.printf("%d %c %d= %d",i,op,j,result);
	}
	   public void method11() {                   // 2021-08-12
		      Scanner sc=new Scanner(System.in);
		      System.out.println("중간고사 점수: ");
		      int mid=sc.nextInt();
		      System.out.println("기말고사 점수: ");
		      int fin=sc.nextInt();
		      System.out.println("과제점수: ");
		      int ass=sc.nextInt();
		      System.out.println("출석회수: ");
		      int att=sc.nextInt();
		      
		      System.out.println("==========결과==========");
		      if(!(att<20*0.7)) {
		         System.out.println("중간고사 점수(20):"+mid*0.2);
		         System.out.println("기말고사 점수(30):"+fin*0.3);
		         System.out.println("과제 점수(30):"+ass*0.3);
		         System.out.println("출석 점수(20):"+att/20.0*100*0.2);
		         double sum=mid*0.2+fin*0.3+(att/20.0*100*0.2);
		         System.out.println("총점:"+sum);
		         
		      }else {
		         System.out.println("Fail[출석 횟수 부족]"+att);
		      }
		   }
  }
	