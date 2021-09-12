package kr.co.ezen.chap01.part01_ObjectVsObjectArray.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part01_ObjectVsObjectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		int[] arr=new int[3];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		/*  // 이 방법1
		Book[] bk=new Book[3]; // 정수 X 클래스 넣은것!
		
		bk[0]=new Book("자바 기초1","홍길동1","EZEN1",10000);
		bk[1]=new Book("자바 기초2","홍길동2","EZEN2",10000);
		bk[2]=new Book("자바 기초3","홍길동3","EZEN3",10000);
		*/
		
		// 또는
		
		Book[] bk= {new Book("자바 기초1","홍길동1","EZEN1",10000),
					new Book("자바 기초2","홍길동2","EZEN2",10000),
					new Book("자바 기초3","홍길동3","EZEN3",10000)
		}; // 이 방법2 , 만들어진 값을 넣은것! 
		
		for(int i=0;i<bk.length;i++) {
			System.out.println(bk[i].information());
		}
		
		// 도서 검색 for 도서 검색 방법
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String searchTirle=sc.nextLine();
		
		for(int i=0;i<bk.length;i++) {
			if(searchTirle.equals(bk[i].getTitle())) {   // 객체가 따로따로 들었다!?!
				System.out.println(bk[i].information());
			}
		}
	}
}
