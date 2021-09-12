package kr.co.ezen.chap01.part01_ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1=new Book("자바 기초1","홍길동1","EZEN1",10000);
		Book bk2=new Book("자바 기초2","홍길동2","EZEN2",10000);
		Book bk3=new Book("자바 기초3","홍길동3","EZEN3",10000);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 검색
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String searchTirle=sc.nextLine();
		
		// if문 도서 검색 방법
		if(bk1.getTitle().equals(searchTirle)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(searchTirle)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(searchTirle)) {
			System.out.println(bk3.information());
		}
		
	}
}
