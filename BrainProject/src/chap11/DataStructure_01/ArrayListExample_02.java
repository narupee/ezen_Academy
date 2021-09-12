package chap11.DataStructure_01;

import java.util.ArrayList;

public class ArrayListExample_02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위"); // 삽입
		list.set(0, "오렌지"); // 덮어쓰기
		list.remove(1); // 제거
		list.remove("키위");

		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
