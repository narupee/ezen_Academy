package chap11.DataStructure_01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample_06 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}

		for (String str : list) {
			System.out.println(str);
		}
	}
}

/*
 이터레이터는 저 메소드들을 사용하기 위한 인터페이스예요
ArrayList클래스와 LinkedList클래스는 Collection 인터페이스를 상속하고 있는데 
그 Collection 인터페이스는 또 Iterable이라는 인터페이스를 구현하고 있고 
안에 iterator메소드가 들어 있어서 iterator 메소드를 사용 할 수 있다네요
 */

