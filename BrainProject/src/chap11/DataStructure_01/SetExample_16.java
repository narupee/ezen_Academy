package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample_16 {
	
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();         // HashSet 클래스 
		set.add("자바");
		set.add("카푸치노");
		set.add("얼어죽어도 아아");
		set.add("자바");                                    // set : 중복X  
		System.out.println("저장된 데이터의 수="+set.size());   // size : 저장된 데이터의 개수
		// sys.out.println 톰캣 : 저장된 데이터의 수=3
		
		// 향상된 for문 으로 가능!
		for(String st:set)
			System.out.println(st);
		
		// 이터레이터 방법 처리! - 직접품
		Iterator<String> set1=set. iterator();
		while(set1.hasNext()) 
			System.out.println(set1.next());
		
		/*
		for(int cnt=0;cnt<set.size();cnt++) {
			String str=set.get(cnt);  // set 은 원래 get 메소드가 없다!
			System.out.println(str);
		}  // 이런 방식 X 
		*/
	}

}
