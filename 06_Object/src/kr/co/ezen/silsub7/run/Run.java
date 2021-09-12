package kr.co.ezen.silsub7.run;

import java.util.Scanner;

import kr.co.ezen.silsub7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee em1=null;                  
		Employee em2=null;                  // 미리설정(만들어놓음) 대신 초기값은 객체사이 null 줌
		
		Scanner sc=new Scanner(System.in);  // 입력받을 준비완료!
		
		for(int i=0;i<2;i++) {              // 매개변수 생성자 이용 (초기값을 줌) -> 바로출력!
		System.out.print("사원명: ");         // 2명의 사원 정보 입력받기  // 사원1
		String empName=sc.nextLine();       // 입력 받는곳
		System.out.print("부서명: ");     
		String dept=sc.nextLine();    
		System.out.println("나이: ");
		int age=sc.nextInt();
		sc.hasNextLine();
		System.out.println("성별: ");
		char gender=sc.nextLine().charAt(0);
		System.out.println("급여: ");
		int salary=sc.nextInt();
		sc.nextLine();
		System.out.println("전화번호: ");
		String phone=sc.nextLine();
		System.out.println("주소: ");
		String address=sc.nextLine();
		
		if(i==0) {
			em1=new Employee(empName,dept,age,gender,salary,phone,address);
		}else {
			em2=new Employee(empName,dept,age,gender,salary,phone,address);
		}
		System.out.println(em1.information());
		System.out.println(em2.information());
		
		}
	}
}
