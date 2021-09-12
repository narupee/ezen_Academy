package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	 public String toString() {                    //19번처럼 equals를 오버라이딩 하지 않음
	        return name+":"+age;
	    }
	}
	public class SetExample_18 {

	    public static void main(String[] args) {
	        Set<Object> set=new HashSet<Object>();  // set==collection(컬렉션) == 벌꿀오소리 == 존나 지멋대로 사는새끼
	        set.add("abc"); //add메서드 호출시 equals메서드를 실행시킨 다음에 중복확인.; equals는 hashcode값을 대조함
	        set.add("abc");
	        set.add(new Person("David", 10));            //여기서 Person타입의 매개변수를 add();(메서드)에 넣음
	        set.add(new Person("David", 10));            //괄호안에 들어가는 값은 객체임 == 객체호출하면 해쉬코드 나옴 == 해쉬코드 대조==false
	        System.out.println(set);

//	        Iterator<Object> set1=set. iterator();
//	        while(set1.hasNext()) 
//	            System.out.println(set1.next());

	    }

	}
	