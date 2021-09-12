package chap09.ObjectCalss_01;

class Member{   // 이 클래스에서는 상속이 없음!
	public static String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	// overriding
	public boolean equals(Object obj) {   // 매개변수로받을타입(Object) 매개변수이름(obj)
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(id.equals(Member.id))
				return true;
		}
		return false;
		
		/*
		if(!(obj instanceof Member)) 
			return false;
			Member me=(Member)obj;
		if(id == Member.id) {
			return true;
		}else { 
			return false;	
		}
		*/ //내가 풀이한거 (전꺼 참고 하고)
	}
}

public class MemberExample_03 {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등 합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj3은 동등 합니다.");
		}else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}



