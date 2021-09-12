package chap11.DataStructure_01;

import java.util.HashMap;

public class lntroHashMap_11 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();
		
		hMap.put(new Integer(3),"나삼번");
		hMap.put(5,"나오번");
		hMap.put(8,"나팔번");
		
		System.out.println("6학년 3반 8번 학생: "+hMap.get(new Integer(8)));  // 키 값을 가져옴
		System.out.println("6학년 3반 5번 학생: "+hMap.get(5));
		System.out.println("6학년 3반 3번 학생: "+hMap.get(3));
		
		hMap.remove(5);   // remove: 지움
		System.out.println("6학년 3반 5번 학생: "+hMap.get(5));  // 6학년 3반 5번 학생: null <-- 이렇게 뜸
		
		
		
	}

}
