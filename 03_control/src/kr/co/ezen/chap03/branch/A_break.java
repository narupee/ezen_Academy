package kr.co.ezen.chap03.branch; // 2021-08-11

import java.util.Scanner;

public class A_break {
	// break문은 가장 가까운 반복문을 나감
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요:");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=0;;i++) { // 조건식을 안쓰면 무한루프가 됨!
			sum+=i;         // i값을 무한으로 지정한것
			
			if(i==num) { // i 값을 내가 입력한 num값 과 같다면 멈춰라 라는 식!
			break;
		}
		System.out.println("1부터"+num+"까지의 합은"+sum+"입니다.");
	}
  }
}
