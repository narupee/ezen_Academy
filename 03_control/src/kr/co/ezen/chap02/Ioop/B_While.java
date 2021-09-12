package kr.co.ezen.chap02.Ioop;  // 2021-08-10

import java.util.Scanner;

public class B_While {

	public void method1() {
		// 1부터 5까지 출력
		int i=1;
		while(i<=5) {
			System.out.println(i+"번째 반복문 수행");
			i++; 
		}
	}
	
	public void method2() {
		int i=5;
		while(i>=1) {
			System.out.println(i+"번째 반복문 수행");
			i--;
		}
		
	}
	
		public void method3() {
			// 1부터 10사이의 홀수만 출력
			// 1 3 5 7 9
			int i=1;
			while(i<=10) {
				 System.out.println(i);    // (세로방향)
			  // System.out.print(i+" ");  // (가로방향)
				 i+=2;
				}
			}
		
		public void method4() {
			// 정수를 하나 입력받아 그 수가 1~9사이의 수일때만 그 수의
			// 구구단 출력
			// 조건이 맞지 않으면 "1~9사이의 양수를 입력해야 합니다." 출력
			Scanner sc=new Scanner(System.in);
			System.out.println("1~9사이의 양수를 입력하세요.");
			int dan=sc.nextInt();
			
			if(dan >=1 && dan <=9) {
				int i=1;
				while(i<10) {
					System.out.printf("%d*%d =%d\n", dan,i,(dan*i));
					i++;
				}
			}else {
				System.out.println("1~9사이의 양수를 입력해야 합니다.");
			}
			
		}
		
		public void method5() {
			// 1부터 10사이의 임의의 난수를 정해
			// 1부터 난수까지의 정수 합계
			int sum=0;
			int i=1;
			int random=(int)(Math.random()*10+1);
			
			while(i<=random) {
				sum+=i;
				i++;
			}
			System.out.printf("1부터 %d까지의 정수 합:%d",random,random,sum);
				
			}
		
		public void method6() {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("첫번째 정수: ");
			int num1=sc.nextInt();
			
			System.out.print("두번째 정수: ");
			int num2=sc.nextInt();
			/*
			for(int i=num1;i<=num2;i++) {
				sum+=i;
			}
			
			System.out.println("sum"+sum);
			ㄴ 요롷게 하면 안된다~  */
			
			int min=0;
			int max=0;  
			int sum=0;
			
			if(num1>num2) {
				min=num2;
				max=num1;  
			}else if(num1<num2) {
				min=num1;
				max=num2; 
			}
			
			int i=min;
				while(i<=max) {
					sum+=i;
					i++;
			}
			
			System.out.printf("%d에서 %d까지의 합:%d",min,max,sum);
		
		}
		
		public void method7() {
			int dan=2;
			while(dan<=9) {
				int i=1;
				while(i<10) {
			
					System.out.printf("%d*%d=%d\n",dan,i,dan*i);
					i++;
				}
				dan++;
				System.out.println();
			}
		}
		
		public void method8() {
			Scanner sc=new Scanner(System.in);
			System.out.println("출력할 줄 수:");
			int row=sc.nextInt();
			
				int r=1;
				while (r<=row) {
					int c=1;
				while(c<=5) {
					System.out.print("*");
					c++;
				}
				    r++;
				    System.out.println();
			
		}
	}
		
		public void method9() {
			int hour=0;
			while(hour<24) {
				int min=0;
				while(min<60) {
					System.out.println();
					
				}
			}
		}
		
		public void method10() {
			/*
			 1*****
			 *2****
			 **3*** 
			 ***4**
			 ****5*
			 ******6
			*/
			Scanner sc=new Scanner(System.in);
			System.out.println("줄 수:"); // 6 , 바깥
			int row=sc.nextInt();
			System.out.println("칸 수:"); // 6 , 안쪽
			int col=sc.nextInt();
			
			/*
			for(int r=1;r<=row;r++) {
				for(int c=1;c<=5;c++) {
				System.out.print("*");
				*/
	
		int r=1;
		while(r<=row) {
			int c=1;
			while(c<=col) {
				if(r ==c) {
					System.out.println(r);
				}else {
					System.out.println("*");
				}
				c++;
			}
			r++;
			System.out.println();
		}		
	}
		
		public void method11() {
			// 문자열을 입력받아 인덱스별로 문자 출력
			Scanner sc=new Scanner(System.in);
			
			System.out.print("문자열 입력:");
			//String str=sc.next();  //공백을 만나면 출력멈춤
			String str=sc.nextLine();
			System.out.printf("문자열의 길이 str="+str.length());	
			
			int index=0;  //입력한 문자가 그대로 출력 되어야함
			while(index<=((int)str.length())-1) {  
				char ch=str.charAt(index);
				System.out.print(ch);
				index++;
			}
			
			/*//선생님 풀이
			 int index=0;
			 while(index < str.length()) {
			 char ch=str.charAt(index);
			 system.out.println(index+":"ch);
			 */
			
		}
		
		public void method12() {
			Scanner sc=new Scanner(System.in);
			
			while(true) {  // 조건에 상관없이 무조건 반복 = 무조건 true 
				// 반복문의 끝의 조건은 거짓이여야함!!!
				System.out.println("1.1~5까지 출력");
				System.out.println("2.5~1까지 출력");
				System.out.println("3.1~10사이의 홀수 출력");
				System.out.println("4.종료");
				System.out.println("메뉴 선택:");
				int menuNum=sc.nextInt();  // 정수값을 입력받자
				
				switch(menuNum) {  // 무한반복 안에 들어가있음
				case 1:
				    method1(); // 메서드를 다른 언어에서는 "함수"라고함 , 메서드는 자기 할일을 다하면 메모리에서 사라짐
				    break;
				case 2:
					method2();
					break;
				case 3:
					method3();
					break;
				case 4:
					System.out.println("종료합니다.");
					return; // 메서드를 강제종료 시키는 것!
				default:
					System.out.println("잘못 입력하셨습니다.");  // 해당 사항이 없을때 사용
				}  // end switch문
				
			} // end while문 
			
		} // end method12() {
}

