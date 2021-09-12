package chap11.DataStructure_01;

import java.util.LinkedList;

public class LinkedListExample_04 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num = list.size();
		System.out.println("size:" + num);

		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
	}

}

