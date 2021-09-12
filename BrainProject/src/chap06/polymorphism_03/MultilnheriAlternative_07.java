package chap06.polymorphism_03;

 class TV2{
	 public void onTV() {
		 System.out.println("영상 출력 중");
	 }
 }
// interface 클래스는 최소한 메서드를 가짐 
interface Computer2{
	 public void dataReceive();   
	}   // 추상메서드 // abstract 얘를 생략해도 아무 문제가 없다

//	 {
//		 System.out.println("영상 데이터 수신 중");
//	 }
	
 class ComputerImpl{   // 일반 클래스
	 
	 public void dataReceive() {
		 System.out.println("영상 데이터 수신 중");
	 }
 }
 
 
// IPTV 가 TV,Computer 상속 받음 // IPTV는 2개를 받는 입장
// 자바는 다중 상속을 지원하지 않는다. // extends 로 두개 못받음 , implements로 두개 받음
 class IPTV extends TV2 implements Computer2{  
	 ComputerImpl comp=new ComputerImpl(); // 객체생성
	 
	 public void dataReceive() {   // 오버라이딩( overriding )
		 comp.dataReceive();   // ComputerImpl 를 얘기하는거임! 접근함!
	 }
	 
	 public void powerOn() {
		 dataReceive();
		 onTV();
	 }
 }
 
public class MultilnheriAlternative_07 {

	public static void main(String[] args) {
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		TV2 Tv=iptv;
		Computer2 comp=iptv;
		

	}

}
