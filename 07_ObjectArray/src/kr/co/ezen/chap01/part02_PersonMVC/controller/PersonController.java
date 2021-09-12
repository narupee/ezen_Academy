package kr.co.ezen.chap01.part02_PersonMVC.controller; //09-01

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import kr.co.ezen.chap01.part02_PersonMVC.model.vo.Person;

public class PersonController {
	
	private Person[] people=new Person[2];   // 2사람만 만들어 처리
	Scanner sc=new Scanner(System.in);
	
	public PersonController() {
		
	}
	
	public void insertPerson() {
		for(int i=0;i<people.length;i++) {
			System.out.println("=====사원 정보 입력=====");
			System.out.println("이름: ");
			String name=sc.nextLine();
			System.out.println("나이: ");
			int age=sc.nextInt();
			System.out.println("재산: ");
			int wealth=sc.nextInt();
			sc.nextLine();
			people[i]=new Person(name,age,wealth);
			
		}
	}
	
	public void printPerson() {   // (데이터)값이 들어있다 라는 가정하에 처리해야함!
		/* // 1번
		for(int i=0;i<people.length;i++) { 
			System.out.print(people[i].inforamtion());  // i -> 인덱스지정 (people[i] -> 호출 inforamtion() == 객체를 가져옴
			
		}*/
		
		// 향산된 for문 // 2번
		for(Person P:people) {    // people[0], people[1] == 배열에 있는 객체를 가져옴
		        // ㄴ 변수(p) : 가져올대상 (people)
			System.out.println(P.inforamtion());
		}
	} // 1번과 2번의 표현방법 우린 2번 사용
	
	public void avgWealth() {   // 평균 구하기 
		int sum=0;              // 평균 ==> 무조건 sum
		
		for(int i=0;i<people.length;i++) {   // Wealth 갔다써야함! 
			sum+=people[i].getWealth();
		}
			System.out.println("평균 재산: "+sum/people.length);
		}
		
	public void searchPerson() {
		Person pe=new Person();
		
		System.out.println("검색할 이름: ");
		String searchName=sc.nextLine();
		
		for(int i=0;i<people.length;i++) {
			if(people[i].getName().equals(searchName)) {    // equals() 가로 안에 비교할 대상을 넣어야함 => 예) if(a == b)
				System.out.println(people[i].inforamtion());
				break;
//				return;
			}
			if(i==people.length-1) {
				System.out.println("검색된 회원이 없습니다.");
				System.out.println();
			}
		}
//		System.out.println("검색된 회원이 없습니다.");
		
	}
}


