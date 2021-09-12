package kr.co.ezen.hw2.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part02_PersonMVC.model.vo.Person;
import kr.co.ezen.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student stu[]=new Student[10];
		int count=0;
		
		while(true) {
			System.out.println("학년: ");
			int grade=sc.nextInt();
			System.out.println("반: ");
			int classroom=sc.nextInt();
			System.out.println("이름: ");
			String name=sc.nextLine();
			System.out.println("국어 점수: ");
			int kor=sc.nextInt();
			System.out.println("영어 점수: ");
			int eng=sc.nextInt();
			System.out.println("수학 점수: ");
			int math=sc.nextInt();
			
			stu[count]=new Student(grade,classroom,name,kor,eng,math); // 0번째 위치에 객체 들어감
			count++; // 카운트증가
			
			System.out.println("계속 추가할 겁니까?(y/n): ");
			String str=sc.nextLine().toUpperCase(); // 대문자
			
			if (str.equals("N"))
				break;
		}
		for (Student s : stu) {
			if (s == null) {
				break;
			}
			int sum = s.getKor() + s.getEng() + s.getMath();
			System.out.println(s.inforamtion() + ", 평균=" + sum / 3);
		}

	}
}
