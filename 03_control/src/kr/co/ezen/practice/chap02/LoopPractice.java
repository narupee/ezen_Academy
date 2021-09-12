package kr.co.ezen.practice.chap02;  // 2021-08-12

import java.util.Scanner;

public class LoopPractice { 
	
	private static final Object i = null;

	public void practice1() {       // 반복문 실습문제
		Scanner sc=new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요:");
		int num=sc.nextInt();
		
		if (num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.println(i+" ");
		}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요: ");
	} sc.close();
  }
	
	public void practice2() {       
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요:");
		int num=sc.nextInt();
		
		if (num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
		}
			break; // 한번 출력하고 안할거면 이걸 쓴다
		}else {
			System.out.println("1이상의 숫자를 입력해야 합니다.");
	} sc.close();
		}  // end while
  }
	
	public void practice3() {       
		Scanner sc=new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요:");
		int num=sc.nextInt();
		
		if (num >= 0) {
			for(int i=1; i<=num; num--) {
				System.out.printf("%d",num);
		}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요: ");
	} sc.close();
	
	}
	
	public void practice4() {       
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.print("1이상의 숫자를 입력하세요:");
		int num=sc.nextInt();
		
		if (num >= 1) {
			for(int i=num; i>0; i--) {
				System.out.print(i+" ");
		}
			break;
		}else {
			System.out.println("1이상의 숫자를 입력해야 합니다.");
	} sc.close();
		}
  }		
	
	public void practice5() {       
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력하세요:");
		int num1=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=num1; i++) {
			System.out.print(i + "+");
            sum+=i;
		}
		System.out.print("= "+ sum);
		sc.close();
	}

	public void practice6() {   
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫 번째 숫자:");
		int num1=sc.nextInt();
		System.out.println("두 번째 숫자:");
		int num2=sc.nextInt();
		
		if( num1>0 && num2>0) {
			for(;num1 <= num2;num1++ ) {
				System.out.printf("%d",num1);
			}
		}else {
			System.out.println("1이상의 숫자를 입력해야 합니다.");
	} 
  }
	
	public void practice7() {    
		Scanner sc=new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력해 주세요");
		
		while(true) {
		System.out.println("첫 번째 숫자:");
		int num1=sc.nextInt();
		System.out.println("두 번째 숫자:");
		int num2=sc.nextInt();
		
		if( num1>0 && num2>0) {
			for(;num1 <= num2;num1++ ) {
				System.out.printf("%d",num1);
			}
		break;  // 만나는 즉시 반복문 전체 탈출
		}else {
			System.out.println("1이상의 숫자를 입력해야 합니다.");
			continue; // 만나면 해당 반복부분 탈출 후 다음반복실행
	} 
		}  // end while 
	}
	
	public void practice8() {    
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자:");
		int dan=sc.nextInt();
		System.out.printf("======%d단======\n",dan);
		
		for(int i=1; i<9; i++) {
		System.out.printf("%d * %d = %d\n",dan,i,dan*i);
	}
		sc.close();
  }
	
	public void practice9() {    
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			int max=0;
			int min=0;
			
		if(num1>num2) {
			max = num1;
			min = num2;		
		}else {
			max = num2;
			min = num1;
		}
		for(int i=min;i<=max;i++) {
			System.out.println(i+" ");
		}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice10() {   
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자:");
			int num=sc.nextInt();
			
			if(num <= 9) {
				System.out.printf("======%d단======\n",num);
				for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d =%d\n",num,i,num*i);
			}
				System.out.println();
				break;
		} else {
			System.out.println("9이하의 숫자를 입력해주세요.");
	}
		}
	}
	
	public void practice11() {    
		Scanner sc=new Scanner(System.in);
		System.out.println("시작 숫자:");
		int num1=sc.nextInt();
		System.out.println("공차:");
		int num2=sc.nextInt();
		
		for(int i=0;i<10;i++) {
			System.out.printf("%d",num1+(num2*i));
		}
		sc.close();
	}
	
//	2021-08-13
	public void practice12() { // 내가풀이한거 
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 첫번째 입력:");
		int i=sc.nextInt();
		System.out.print("정수 두번째 입력:");
		int j=sc.nextInt();
		System.out.printf("연산자 입력(+,-,*,/,%:)");  //exit 값이 들어올때까지 무한반복
		char cp=sc.next().charAt(0);
		
		double result1;
		int result = 0;
		
		if(i>=0 && j>=0) {
			switch (cp) {
			case '+':
				result= i+j;
				break;
			case '-':
				result= i-j;
			case '*':
				result= i*j;
				
			case '/':
				result1= (double)i/j;
				System.out.printf("%d %c %d=%.2f",i,cp,j,result1);
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요.");
				break;
			case '%':
				result= i%j;
				break;
			default:
				System.out.println("없는 연산자 입니다. 다시 입력해 주세요.");
				break;
			}
		}else {
		System.out.println("프로그램을 종료합니다.");
		System.out.println("exit"); 
	} 
		System.out.printf("%d %c %d= %d",i,cp,j,result);
 }
	
	public void practice13() { // 12번 문제랑 같음 , 선생님이풀이한것
		Scanner sc=new Scanner(System.in);
		
		while(true) {   // 무한루프는 while
			System.out.print("연산자(+,-,*,/,%):");
			String op=sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break; // 반복문을 빠져나가게 해줌!
			}
			
			System.out.print("정수1 :");
			int num1=sc.nextInt();
			System.out.print("정수2 :");
			int num2=sc.nextInt(); // num2 값이 0일때 다시 입력해달라고 밑에 출력
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue; // 값을 비교할때 문자열비교는 equals로 하고  숫자 비교는 ==이콜연산자로 쓰기 
			}
			switch(op) {
			case "+":
				System.out.printf("%d %s %d=%d\n",num1,op,num2,(num1+num2));
				break;
			case "-":
				System.out.printf("%d %s %d=%d\n",num1,op,num2,(num1-num2));
				break;
			case "*":
				System.out.printf("%d %s %d=%d\n",num1,op,num2,(num1*num2));
				break;
			case "/":
				System.out.printf("%d %s %d=%d\n",num1,op,num2,(num1/num2));
				break;
			case "%":
				System.out.printf("%d %s %d=%d\n",num1,op,num2,(num1%num2));
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해 주세요\n");
				continue;
			}
				System.out.println();
		}
		sc.close();
	}
	
	public void practice14() { 
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int row=sc.nextInt();
		
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=r;c++) { 
				System.out.print("*");
		}
		System.out.println();
	}
  }
	
	public void practice15() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=sc.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=i;j>0;j--) { 
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}