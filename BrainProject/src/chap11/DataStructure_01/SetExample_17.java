package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Set;

public class SetExample_17 {

	public static void main(String[] args) {
		Object[] objArr= {"1",new Integer(1),"2","2","3","3","4","4"};
		// ① 타입 "1" : String타입 , new Integer(1), ... : Wrapper랩퍼타입
		Set<Object> set=new HashSet<Object>();   // Set: 부모, HashSet: 자식 -> 
		
//		for(int n=1;n<=10;n++) {   // ②번 방식 참고
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);   
			// objArr = {} 값들을 인덱스 해서 set에 저장 (.add: 저장하는 메서드)
		}
		
		System.out.println(set);
		// 톰캣 -> [1, 1, 2, 3, 4]
		// ① 타입이 달라서 1, 1, 나옴 
		
		/*
		// 톰캣 ②번 방식 참고
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		[1, 1, 2, 3, 4]
		*/

	}
}


