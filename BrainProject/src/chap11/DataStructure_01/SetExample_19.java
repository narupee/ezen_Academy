package chap11.DataStructure_01;

import java.util.HashSet;
import java.util.Set;

class Person2{           //extends 셋,해시셋 생략이됨
    String name;
    int age;
    Person2(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString() {
        return name+":"+age;
    }

    // 오버라이딩
    public boolean equals(Object obj) {
        if(obj instanceof Person2) {              //인스탄스오브는 쟤가 조상임? 하고 물어보는것
            Person2 tmp=(Person2)obj;
            return name.contentEquals(tmp.name) && age == tmp.age;              //2-1에서 네임이 같은게 나타남 //==true
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode()+age;                    //해쉬코드는 우리가 오버라이딩했을때 우리가원하는걸 판별하게 해줌
    }
}

public class SetExample_19 {                           //Obeject클래스는 상위클래스라스 이퀄스,투스트링 모두 오버라이딩 가능 

    public static void main(String[] args) {           //Set도 클래스 HashSet도 클래스임 >> add라는 메서드가 있음
        Set<Object> set=new HashSet<Object>();        //hashcode를 지정안해줌 (객체생성을 안함)  //길이가 2개가 되는거임 (중복이 2번나와서)
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David", 10));            //1번   >> 객체생성함
        set.add(new Person2("David", 10));                // 2번 >> 객채생성 시도함
        System.out.println(set);
        //Set.add(Object a){                    //add라는 원시적인 메서드
        //    for(int i=0;i<set.length;i++){
        //        if(a.equals(set[i])){
        //            저장하지않음;
        //        }
        //    }
        //}
    }
}

