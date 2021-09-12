package kr.co.ezen.chap02.Ioop; // 2021-08-10

import java.util.Scanner;

public class C_Dowhile {

	public void method1() {
		// 키보드로 영어 문자열값을 입력받아 출력 반복 실행
		Scanner sc=new Scanner(System.in);
		String str=null;
		do {                                      // 위에서 아래로 실행
			System.out.print("문자열 입력:");        // 명령문을 여기에 적는 것 // 선처리(1-1)
			str=sc.next();
			System.out.println("str:"+str);
		}while(!str.equals("exit"));              // equals: 문자열 비교하는 메서드 (exit와 같다)  // 후 비교(1-2) 
		                                          // !str: 여기에 입력된 값이 exit와 같지 않냐? => 부정형
		
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		String str=null;
		do {                                        
			System.out.print("문자열 입력:");        
			str=sc.next();
			System.out.println("str:"+str);
			if(str.equals("exit"));
			break;
		}while(!str.equals("exit"));
		
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		String str=null;
		do {
			System.out.println("1.테스트1");
			System.out.println("2.테스트2");
			System.out.println("3.테스트3");
			System.out.println("4.종료");
			System.out.println("메뉴 선택:");
			int menuNum=sc.nextInt();  
			
			switch(menuNum) {  
			case 1:
			    System.out.println(1);
			    break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println("종료합니다.");
				return; // 메서드를 강제종료 시키는 것!
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
	
	    }while(true);
		
	}
}


