package kr.co.ezen.chap01.condition; // 연습

import java.util.Scanner;

public class A_Ifpractice {

//	public void method1() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("숫자를 한개 입력하세요: ");
//		int num=sc.nextInt();
//		
//		if(num > 0) { 
//			System.out.println("양수 입니다.");
//		}
//		
//	    if(num == 0) {
//	    	System.out.println("숫자 0 입니다.");
//	    }
//	    
//	    if(num < 0) {
//	    	System.out.println("음수 입니다.");
//	    }
//	    
//	    sc.close();
//	}
//	
//	public void method2() { // 고양이를 출력 하세요.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("좋아하는 동물을 입력하세요: ");
//		String cat=sc.next();
//		
//		System.out.println("고양이");
//  }
//	
//}

/*
//조건문 if, switch, 3항 연산 (유튭 공부)

switch(입력변수) {
case 조건값: 실행 구문, break;
//   ㄴ> 이걸 사용 안하면 모든 조건값이 실행됨
default: 기록 실행 구문;
}

3항연산
ㄴ> 조건? true인 경우 수행문장: false인 경우 수행문장;

조건이 true 인 경우? 다음에 오는 문장이 수행됨.
조건이 false 인 경우 : 오른쪽 문장이 수행됨

public static void main(String[] args) {
Conditiona1 com =new Condition1();
Scanner scan = new Scanner(System.in);

while(true) {                                                      // while(:반복문) 가로에 있는 조건이 참인 경우 반복이 됨
System.out.printf("# 메뉴를 선택하세요 (1: 로그인, 2:쪽지확인, x: 종료) ==> ");
String se1 = scan.next();

switch(se1) {
case "1": con.login();break;
sase "2": con.check();break;                                       // 체크메서드 클릭하면됨!
case "x": System.exit(0);
default: System.out.println("잘못된 입력 입니다.!!");
 }
}
}
private void check() {
    int cnt = 10;
    String msg = cnt > 0? "새로운 쪽지가 있습니다.!!" : "새로운 쪽지가 없습니다.!!";
    System.out.print(mag);                                     // 메세지 값 출력
 }
}
}
public void Iogin() {
Scanner scan Scanner(System.in);
System.out.print("## 아이디를 입력하세요: ");
String uname = scan.next();

System.out.print("## 비밀번호를 입력하세요: ");
String pwd = scan.next();

if((uname.equals == "hong") && (pwd.equals == "1234"")) { 
//문자열에 비교연산자를 사용하면 안됨. 그러므로, equals(이퀄스)를 넣어줘야함 
System.out.print("인증 확인!! --> 로그인 성공");
}else {
System.out.print("아이디나 비밀번호가 틀렸습니다.!!");
}
}
//반복문 (유튭 공부)

for, while 문이 대표적, 관계연산자와 함께 많이 사용함, 특정조건에 따라 동일한 작업을 반복해서 수행

for( 초깃값 : 조건식 : 증감식) {
 ...
} // for(;;) 는 무한루프가 됨

for( 변수 : 집합형데이터) {
 ...
} // 코드 간결, for-each, for-in 형식의 구문
// 배열, Collection 과 같은 집합형 데이터 처리에 적합

while(조건식) {
 ...
} // 조건식이 참인 경우 반복하는 구조 (ex: 시작~종료)
// while문 내에서 조건식이 변경되지 않으면 무한루프가 될 수 있음.

public class Loop {

public static void main(String[] args) {                   // 다양한 데이터들을 대열에 데이터를 다루는 방법!
  int power =  13;
  String members[] = {"홍길동","김길동","김사랑","아무개"};

  for(int i=1; i<=10; i++) {                              // 1~10까지 숫자을 값 출력하는 방법!
     System.out.println(i);
  }
  // 구구단 경우 
                                                        // 보이는것처럼 인벤테이션 즉 들여쓰기를 반드시 해주는게 좋음!
                                                        // 문법적 오류는 나는 것은 아니지만 구문이 보기가 좋음!
  for(int dan=2;dan<=0; dan++ ) {                       // 1-2 방법 (2단~9단까지 출력 되는 방법!)
      for(int i=1; i<=9; i++) {                         // 1-1 방법
      System.out.println("2 * %d = %d\n",i,2*i);        // 곱하기 여기서는 2곱하기가 됨! 
  }                                                     // dan을 붙여 쓸땐 2*가 아닌 바깥에 있는 단수여야 함으로 %d* 가 와야함! 
}                                                       // ㄴ> System.out.println("%d * %d = %d\n",dan,i,dan*i);로 변경!

  for(int i=0; i<members.length; i++) {
  System.out.println(members[i]);
 
  }
  
  System.out.println("-------------");

  for(String name : members) {
  System.out.println(name);
 }
  System.out.println("-------------");

  while(power > 10) {                                     // 와일문으로 특정 조건 만큼만 데이터를 순환할 수 있는 방법!
         System.out.println("go");  //무한루프가됨
         power--;  //무한루프를 감소로 막음
}
  System.out.println("stop");
}
}
} */

//업다운 게임을 실행하라.
//기준 값을 지정 후 입력한 값(1~100)이 기준 값보다 크면 up, 작으면 down, 정답일시 bomb 출력
      public void method4() {
      Scanner sc=new Scanner(System.in);
       System.out.println("업다운 게임 시작!");
       
        int sum=0;
		int i=1;
		int random=(int)(Math.random()*100+1);

       while(true) {
    	   System.out.println("1~100사이의 숫자를 입력하세요:");
           int num=sc.nextInt();
       }
    }
}
//      // 도훈님이 풀이한 답
//      public void method5() {
//
//          Scanner sc = new Scanner(System.in);
//
//          int ran = (int)(Math.random()*100+1);
//
//          while(true) {
//              System.out.println("1~100사이의 값을 입력해주세요");
//              //System.out.println( ran );
//              int i = sc.nextInt();
//              boolean a = i<ran && i<100 && i>0;
//
//              if(i<ran && i<100 && i>0) {
//                  System.out.println("up");
//
//              }else if(i>ran && i<100 && i>0){
//                  System.out.println("down");
//
//              }else if(i == ran && i<100 && i>0){
//                  System.out.println("정답입니다");
//                  break;
//              }else {
//                  System.out.println("1~100사이의 값을 입력해주세요");
//              }
//         }
//    }
//}