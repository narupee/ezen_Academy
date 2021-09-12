package chap11.DataStructure_01;

import java.util.HashMap;

class Name{
	String firsName;
	String lastName;
	
	Name(String firsName, String lastName){  // 생성자
		this.firsName=firsName;
		this.lastName=lastName;
	}
	
	// 오버라이딩 방법임!!! 복습☆
	public boolean equals(Object a) {     // boolean : 트루 아님 폴스를 가지고 있고 구성된 자료형
		if(a instanceof Name) { // instanceof: a를 네임 타입으로 바꿀 수 있다 
			Name b =(Name) a;  
			return b.firsName.equals(firsName) && b.lastName.equals(lastName);  
			// equals 네임 뒤가 앞에 꺼랑 똑같냐? 물어보는것
			// b.lastName.equals(lastName); --> equals 뒤 내용은 필드 값 String 이다!
		}else {
			return false; 
		}
	}
	
	public int hashCode() { // 네임 안에든 필드값의 해쉬코드들을 이용해서 네임 타입의 해쉬코드가 나오도록 오버라이딩을 해줌 , 복습☆ 
		return firsName.hashCode()+lastName.hashCode();
	}
}

public class HashMapExample_13 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable=new HashMap<Name,Integer>();
		// 생성자호출 // 해쉬맵을 쓰기위한 준비!
		
//		Name na=new Name("루피","가");
		
		hashtable.put(new Name("뀨","한"),new Integer(95));   // 방법1 , // 복습☆
//		hashtable.put(na,95); // 복습☆
		hashtable.put(new Name("루피","가"),new Integer(95));   // 방법2
		hashtable.put(new Name("크롱","영"),new Integer(85));
		hashtable.put(new Name("에디","자"),new Integer(70));
		hashtable.put(new Name("뽀로로","바"),new Integer(100));
		
		/*
		Name na=new Name("루피","가");
		System.out.println(na.hashCode());
		System.out.println(new Name("루피","가").hashCode());
		// 톰캣
		1007251739
		1556595366
		new 는 각자의 객체 주소임 ( 객체는 new를 쓸때 마다 내용이 같다 하더라도 서로다른존재임 )
		그러므로 갖게 하기 위해선 오버라이딩을 해야함~
		*/
		
		// 클래스를 가지고 키값 --> new Name("루피","한"),95); 자체가 키 값임
		Integer num=hashtable.get(new Name("뀨","한"));  // 복습☆   , // 09-09 이어나감 ) 클래스 객체생성한곳
		Integer num1=hashtable.get(new Name("루피","가"));          // 같은 내용을 가지고 있는 별도의 주소값
		Integer num2=hashtable.get(new Name("크롱","영"));
		Integer num3=hashtable.get(new Name("에디","자"));
		Integer num4=hashtable.get(new Name("뽀로로","바"));
//		Integer num5=hashtable.get(na); // 복습☆

		System.out.println("뀨의 성적은? "+num);   // 복습☆
		System.out.println("루피의 성적은? "+num1);
		System.out.println("크롱의 성적은? "+num2);
		System.out.println("에디의 성적은? "+num3);
		System.out.println("뽀로로의 성적은? "+num4);
//		System.out.println("루피의 성정은? "+num5); // 복습☆
		
	}
}

// 해쉬코드 오브젝트가 단일문자열은 계산 잘함
// ㄴ> 오브젝트 클래스가 가지고 있는 해쉬코드는 내가 직접 클래스를 만들어서 한 '(new Name("뀨","한") ' 이거의 방법을 못한다.




