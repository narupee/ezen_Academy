package chap05.Object_Class_08;

class AccessWay{  //강사님 : 클래스 만들어놓은거 각자 분석해봐 이게 뭔말이야
	// static이 붙은 변수는 객체생성과 상관없다 를 강조하심

static int num=0;  //이거 넘값 공유되는거염 

AccessWay(){           //객체가 만들어질때마다 생성자가 호출되니 
incrCnt();     // <<<<<<객체가 만들어진 만큼 이 메서드가 가장 먼저 출력되어
}

public void incrCnt() {
num++;              //<< 1객체 생성당 num값 1증가 
			//  == static num에 쌓여서 지금의 클래스에서는 
			// 생성된 객체수와 num값은 비례한다!
}
}

public class ClassVarAccess_09 {

public static void main(String[] args) {
//AccessWay way=new AccessWay();
//System.out.println("num="+way.num); //객체 생성후 num값을 확인하는 출력메소드
//AccessWay way2=new AccessWay();
//System.out.println("num="+way.num); //객체 생성후 num값을 확인하는 출력메소드
//AccessWay way3=new AccessWay();
//System.out.println("num="+way.num); //객체 생성후 num값을 확인하는 출력메소드
//							//출력해보면 num3값이 객체수와 동일한 3까지 증가한걸 확인할 수 있다.


//위에 주석처린 부분 이후에 강사님께서 아래처럼 수정하신 후 왜 이렇게 출력되는지 이해해 보라고 하심


//AccessWay way=new AccessWay();			//1
//System.out.println("num="+way.num++);	//2
//AccessWay way2=new AccessWay();			//3
//System.out.println("num="+way.num++);	//4
//AccessWay way3=new AccessWay();			//5
//System.out.println("num="+way.num++);	//출력되고 6으로 벌크업해서 눈마주치면 안됨 
//
// 어렵게 생각하지말고 프로그램은 위에서 아래로 순차적으로 실행되니까 생성자가 메서드호출하고 그럼 num이 1이됨
// 여긴 어렵지않져? 궁금한건 제가 알려드릴게여 치킨드셈 알랔치킨 예~

//여기서 또 주석처리 하심 영상으로 못남기는게 너무 아쉽네 눈아프겠다 받아라 주석 빔


AccessWay way=new AccessWay();			
way.num++;      
AccessWay.num++;                          //static에 저장된 변수는 클래스 이름으로 접근 가능하다
System.out.println("num="+AccessWay.num); //위에 첫 두줄 주석처리 된 상태에서 출력해보기

//객체를 지정하지 않은 상태에서 static이라는 공유되는 변수를 생성해서 생성자로 변수를 지정하기 전에 
//static 에 저장된 num을 클래스이름으로 호출할수 있다고 설명하심 >> static은 메모리 생성과는 상관없다.
}

}
