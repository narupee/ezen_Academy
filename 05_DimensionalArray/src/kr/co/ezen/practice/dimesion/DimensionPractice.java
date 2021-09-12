package kr.co.ezen.practice.dimesion; //2021-08-20

import java.util.Scanner;

import javax.transaction.xa.XAException;

public class DimensionPractice {
 /*
    printf의 지시자 표현!!!!
  
	System.out.printf("[%5d]\n",10);  // [   10]  자리수 지정
	System.out.printf("[%-5d]\n",10); // [10   ]  왼쪽 정렬
	System.out.printf("[%05d]\n",10); // [00010]  5자리 중 공백을 0으로 채움

	System.out.printf("[%d=%14.10f]\n",d); // [1.2345678900]
	// 전체 14자리 중 소수점 아래 10자리까지 출력
	// 부족한 앞 자리는 공백으로 채우고 뒤에 빈 자리는 0으로 채운다

	System.out.printf("[%s]\n", url);    // [www.codechobo.com]
	System.out.printf("[%20s]\n", url);  // [   www.codechobo.com]
	System.out.printf("[%-20s]\n", url); // [www.codechobo.com   ]
	System.out.printf("[%8s]\n", url);   // [www.code]
	                                                                 */
	
	
	public void method1() {
		String[][] arr=new String[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("(%d, %d)",i,j);   
			}
			System.out.println();
	}
}
	
	
	public void method2() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 1~16까지 값을 차례대로 저장
		// 2) 저장된 값들을 차례대로 출력
		
		int arr[][]=new int[4][4];
		int value=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=value++;
				System.out.printf("%-3d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16~1과 같이 값을 거꾸로 저장
	    // 2) 저장된 값들을 차례대로 출력
		
		int arr[][]=new int[4][4];
		int value=16;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=value--;
				System.out.printf("%-3d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method4() {
		// 4행 4열 2차원 배열을 생성하여
		// 0행 0열부터 2행 2열 까지는 1~10까지의 임의의 정수값 저장 후
		// 내용처럼 정리하세요 (표 모양, 열은 0열,1열,2열,3열로 되어있고, 행은 0행,1행,2행,3행 으로 되어 있음)
		
		int arr[][]=new int[4][4];
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				arr[i][j]=(int)(Math.random()*10)+1;
			}
		}
		for(int i=0;i<arr.length-1;i++) { 
			for(int j=0;j<arr[i].length-1;j++) {
				arr[i][3]+=arr[i][j];
				arr[3][j]+=arr[i][j]; // 반복 하는곳
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			arr[3][3]+=arr[i][3]+arr[3][i]; // 반복이 끝나는곳
			System.out.println();
		}
	}
	
	public void method5() {
		// 2차원 배열의 행과 열의 크기를 사용자에게 입력 받되
		// 1~10 사이 숫자가 아니면 "반드시 1~10 사이의 정수를 입력
		// 출력 후 다시 정수를 받게하기
		// 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤! 으로 들어가게 한 뒤 출력
		// (char 형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		Scanner sc=new Scanner(System.in);
		System.out.println("행 크기 : ");
		int row=sc.nextInt();
		System.out.println("열 크기 : ");
		int col=sc.nextInt();
		
		char arr[][]=new char[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= (char) (65+ (int) (Math.random()*26)+65);  // 랜덤 한 대문자 매스랜덤이 0*26+65<= math.random*26+65 
				System.out.println(arr[i][j]+ " ");                   // <1*26+65 범위가 65~90사이로 랜덤하게 출력해야 아스키코드상에서 대문자로 나온다!
			}
			System.out.println();
		}
	}
	
	public void method6() {
		// String[][] strArr= new String[][]
		// {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!!"}};
		// 위에서 아래로 출력 하게 하기
		// 단, print()를 사용해 값 사이에 띄어쓰기 ("") 가 존재하도록 출력
		
		Scanner sc=new Scanner(System.in);
		
		String[][] strArr= {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"},                     // 열
				{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!!"}};   // 행
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
	}
	
	public void method7() {   
//		2차원 배열은 무조건 행 과 열 !!!
//		사용자에게 행의 크기를 입력받고
//		그 수만큼의 반복을 통해 열의 크기도 받아 문자형 가변 배열을 선언 및 할당 하세요
//		각 인덱스에 'a' 부터 총 인덱스의 개수 만큼 하나씩 늘려 저장하고 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("행의 크기 :");
		int row=sc.nextInt();
		
		char[][] charArr=new char[row][];
		
		for(int i=0;i<row;i++) {
				System.out.print(i+"열의 크기 :");
				charArr[i]=new char[sc.nextInt()];
		}
		 char data='a';
		 for(int i=0;i<charArr.length;i++) {
	         for(int j=0;j<charArr[i].length;j++) {
	            charArr[i][j]=data++;
	            System.out.print(charArr[i][j]+" ");
	         }
	         System.out.println();
		 }
	}
	
	public void method8() {
//		1차원 배열에 12명의 학생들을 출석부 순으로 초기화
//		3행 2열 으로 2차원 배열 2개를 이용해 분단을 나눠
//		1분단 왼쪽부터 오른쪽, 1행에서 아래 행순으로 자리를 배치
//		
//		<출석부>
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		String[] student = {"강건강" , "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축","파풍표", "홍하하" };
		
		String[][] seat1 =new String[3][2];
		String[][] seat2 =new String[3][2];
		int count=0;
		
		System.out.println("===1분단===");
		for(int i=0;i<seat1.length;i++) {
			for(int j=0; j<seat1[i].length;j++) {
				seat1[i][j]=student[count];
				count++;
			System.out.print(seat1[i][j]+" ");
		}
			System.out.println();
		}
			System.out.println("===2분단===");
			for(int i=0;i<seat2.length;i++) {
				for(int j=0; j<seat2[i].length;j++) {
					seat2[i][j]=student[count];
					count++;
				
			System.out.print(seat2[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("==========");
		System.out.println("검색할 학생 이름을 입력하세요 :");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String na1[]= { "첫번째", "두번째", "세번째" };
		String na2[]= { "왼쪽", "오른쪽" };
		
		for(int i=0;i<seat1.length;i++) {
			for(int j=0;j<seat1[i].length;j++) {
				
				if(seat1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %s줄 %s에 있습니다. ", name,na1[i],na2[j]);
				}
				if(seat2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %s줄 %s에 있습니다. ", name,na1[i],na2[j]);
				}
			}
		}
}
	
	public void method9() {                     // 2021-08-05
//		String 2차원 배열 6행 6열 만들고
//		행의 맨위와 열의 맨앞은 각 인덱스를 저장
//		사용자에게 행과열을 입력받아
//		해당좌표의 값을 'X' 로 변환해 2차원 배열을 출력
//		ex.
//		행 인덱스 입력: 4
//		열 인덱스 입력: 2
//		   0 1 2 3 4
//		 0
//		 1
//		 2
//		 3
//		 4       X
		Scanner sc=new Scanner(System.in);
		String[][] board=new String[6][6];   // board (변수) 가 항상 가르키는 행은 [6]'행' 이다
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=" ";   // 배열 6행 6열 공백으로 초기화 한것!
			}
		}
		for(int i=0;i<board.length-1;i++) {
			board[0][i+1]=i+"";   // 열 고정
			board[i+1][0]=i+"";   // 행 고정
		}   // for 하나로  '행과 열의 인덱스를 다 처리' 하는 방법
		
		System.out.print("행 인덱스 입력 :");
		int row=sc.nextInt();
		
		System.out.print("열 인덱스 입력 :");
		int column=sc.nextInt();
		
		for(int i=0;i<board.length;i++) {           // 바깥쪽 for ==> 행
			for(int j=0;j<board[i].length;j++) {    // 안쪽 for ==> 열
				if(i == row && j == column) {       // 
					board[i+1][j+1]="X";
				}
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("프로그램 종료");
		sc.close();
	}
	
	public void method10() {   // 9번 하고 같은 문제 99입력 프로그램 종료 추가함!
		Scanner sc=new Scanner(System.in);
		String[][] board=new String[6][6];   // board (변수) 가 항상 가르키는 행은 [6]'행' 이다
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=" ";   // 배열 6행 6열 공백으로 초기화 한것!
			}
		}
		for(int i=0;i<board.length-1;i++) {
			board[0][i+1]=i+"";   // 열 고정
			board[i+1][0]=i+"";   // 행 고정
		}   // for 하나로  '행과 열의 인덱스를 다 처리' 하는 방법
		
		int row=0;
		int column=0;
		do {
		System.out.print("행 인덱스 입력 :");
		row=sc.nextInt();
		
		System.out.print("열 인덱스 입력 :");
		column=sc.nextInt();
		
		for(int i=0;i<board.length;i++) {           // 바깥쪽 for ==> 행
			for(int j=0;j<board[i].length;j++) {    // 안쪽 for ==> 열
				if(i == row && j == column) {       
					board[i+1][j+1]="X";
				}
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		}while(row != 99);
			System.out.println("프로그램 종료");
	}
}

/*
		객체(Object) 지향 프로그래밍
		class ? 
		
		basic (기본)
		
		
		
		
		
		
		
		
		
		

*/

