package chap05.Object_Class_02;  // 클래스가 만들어지고 어떻게 활용을 하는지

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;                   

class Avg {       // ☆ 변수 선언 -> 메서드에 갔다 씀
	String name;  // 변수 이름 지을때 의미를 꼭 생각하기 1
	
	// 밑에 자료형 메서드
	public String average(int i, int j) {   // 매개 변수 + 함수명 + 타입 꼭 있어야함!   , ☆☆ 넘어갈 데이터 타입은 'String' 타입 3
		int st_avg = (i+j)/2; // 지역변수 (변수 선언 한것)
		                             // 평균을 구해 저장 2 , 리턴 시킬꺼임 (리턴 시킨 쪽으로 호출함 average(70,80) 얘네들
		return name+" "+st_avg;  // 3
	}
}

public class AvgTest {

	public static void main(String[] args) {
		Avg student1=new Avg(); // new Avg 만들어진 주소값은 student1 ( 주소가 저장되 있는곳 : 문자열 올 수 X )에 들어가 있음!☆ 
		Avg student2=new Avg(); // new가 들어가면 무조건 만든다. 라고 생각하기
	
		student1.name="김철수";
		student2.name="김영희"; // 1
		
		String st1_avg=student1.average(70,80);
		String st2_avg=student2.average(80,90);
		
		System.out.println(st1_avg); // 김철수 75  ,3
		System.out.println(st2_avg); // 김영희 85
	}
}
