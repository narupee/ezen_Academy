package chap05.Object_Class_08;

 class InstCnt {
	static int instNum=0;   // 공용 공간에 instNum=0; 이 만들어 지면 static: 별도의 공간에 공유가 된다 (instNum++ 이 작동이됨)
	
	public InstCnt() {
		instNum++;
//		System.out.println("인스턴스 생성:"+instNum);
		System.out.println("인스턴스(객체) 생성:"+instNum);
	}

 }
 
public class ClassVar_07 {
	
	public static void main(String[] args) {
		InstCnt cnt1=new InstCnt();
		InstCnt cnt2=new InstCnt();
		InstCnt cnt3=new InstCnt();
		
	
		
	}

}
