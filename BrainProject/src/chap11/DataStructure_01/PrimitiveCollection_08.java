package chap11.DataStructure_01;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection_08 {
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();                       // 방법1
//		LinkedList<Integer> list = new LinkedList<Integer>();   // 방법2
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> itr=list.iterator();
		// < > : 제네릭타입
		
		while(itr.hasNext()) {
			int num=itr.next();
			System.out.println(num);
		}
	}
}

// 정수 10,20,30을 LinkedList에 저장해 이터레이터로 출력
// 722쪽 책 2권 꼭 보기

