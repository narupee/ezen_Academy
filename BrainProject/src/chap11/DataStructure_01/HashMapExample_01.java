package chap11.DataStructure_01; // 09-08

import java.util.HashMap;

public class HashMapExample_01 {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hashtable=new HashMap<String,Integer>();
		hashtable.put("가영", new Integer(93));
		hashtable.put("루피", new Integer(95));
		hashtable.put("크롱", new Integer(75));
		hashtable.put("뽀로로", new Integer(93));
		hashtable.put("에디", new Integer(80));
		
		Integer num=hashtable.get("가영");
		Integer num1=hashtable.get("루피");
		Integer num2=hashtable.get("크롱");
		Integer num3=hashtable.get("뽀로로");
		Integer num4=hashtable.get("에디");
		
		System.out.println("가영의 성적은? "+num+"점");
		System.out.println("루피의 성적은? "+num1+"점");
		System.out.println("크롱의 성적은? "+num2+"점");
		System.out.println("뽀로로의 성적은? "+num3+"점");
		System.out.println("에디의 성적은? "+num4+"점");
		
	}

}

// 해쉬맵 , 해쉬 코드, 키 값이 제일 중요 ★★★★★★
/*

○ remove: 지움

 버켓(해쉬코드로 찾아감)은 우체국이고 
 키는 수령인 집이고 ==> 키는 (예_ "가영") 중복 x , 벨류 값은 중복 o
 밸류는 편지
 ㄴ 키랑 벨류가 중요!!! 키 하나에 값 1개 
 ㄴ 키든 벨류든 무수한 타입이 들어 갈 수 있음! ==> < > 제네릭(꺽새) 임
 
 ★★★★★ 매우중요 ★★★★★★
 
 키는 (예_ "가영") 중복 x , 벨류 값은 중복 o
 ㄴ> 이걸 쓸 때는 equals 랑 해쉬코드 메소드를 오버라이딩 해야 한다! -> 중복을 할지 말지 내가 정해서 결정하면 됨
 ㄴ> String,Integer 얘들은 이미 오버라이딩이 되어있기때문에 작동함! -> 기본키타입일때만!
 
★ 키랑 셋set 중복X , 벨류랑 리스트는 중복O

----쓰레드 개념 ----
★ 해쉬맵 : 단독,싱글
★  해쉬테이블 : 멀티
★ 해쉬코드 : 각 객체에 부여된 번호(식별 번호)

☆ 해쉬맵, 이퀄스, Array리스트 : 중복은 상관 안해 할때 쓰는 법
 
*/
// 개념 중요!!!!!!!!!



