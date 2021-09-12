package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	
	public SimpleNumber(int n) {
		num=n;
	}
	
	public String toString() {
//		return num+"";
		
		return String.valueOf(num);    
		// valueOf: 생성자 호출 없이 String 타입 객체로 만듬 
		// ㄴ 위 클래스 int 타입을 valueOf의 ()안에 String 타입으로 바꿔라 라는 말
		
	}
	
	public boolean equals(Object obj) {      // 이런방식도있음1
		SimpleNumber comp=(SimpleNumber)obj;
		if(comp.num == num)
			return true;
		else
			return false;
	}
	
	public int hashCode() {                  // 이런방식도있음2 , 중복값 제거
		return num%3;
		// 해쉬코드 생성하는 알고리즘을 설정해준거이며
		// 확실하게 비교하려고 나머지값을 비교하는거다.
	}
}

public class SetExample_20 {
	
	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}
}


