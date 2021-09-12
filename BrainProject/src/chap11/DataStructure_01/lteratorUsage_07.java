package chap11.DataStructure_01;

import java.util.Iterator;
import java.util.LinkedList;

public class lteratorUsage_07 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		Iterator<String> itr=list. iterator();
		System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
		while(itr.hasNext()) {
			String curStr=itr.next();
			System.out.println(curStr);
//			if(curStr.equals("Third"))            // 방식1번
//				itr.remove();
			if(curStr.compareTo("Third")==0)
				itr.remove();                     // 방식2번
			
		}
		
		System.out.println("\n \"Third\" 삭제 후 박복자를 이용한 2차 출력");   
		// "\n \" : " "(문자열출력)안에만 출력을 하고 인식을 함 
		// \" 쓰는 이유는 컴팡이가 문자열로 인식 못하게 바로 출력할 수 있게 하는 방법! 
		
		itr=list.iterator();   // 다시 만들어 줘야한다!!!
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}

/*
hasNext() : boolean 타입 
즉, True or False 로 반환
다음에 가져올 값이 있음 true
없으면 False

next : 매개변수 혹은 iterator 되는 타입
즉, 아무 타입으로 반환 가능
iterator에 입력된 값이 String 이면 String 값을 가져옴
iterator의 다음 요소 값 반환
추가) 숫자 값을 가지고옴!
*/

