package chap06.Inheritance_02;

abstract class MessageSender{    // 이클레스를 왜만듬? -> 자식클래스한테 상속 시키기 위해 --> 오버라이딩(기존의 것을 무시 또는 덮어쓰다) // 1-2 ( ' abstract class MessageSender{ ' 이렇게)  
	String title;                // //추상이란 == 추상적인것 == 실체가없는것 ? == 알맹이가 없음
	String senderName;
	
	MessageSender(String title, String senderName) {
		this.title=title;
		this.senderName=senderName;
	}
	
	abstract void sendMessage(String recipient);   // (부모)추상 메서드 1-1
}
class EmailSender extends MessageSender{
	String senderAddr;
	String emailBody;
	
	EmailSender(String title, String senderName, String senderAddr, String emilbody) {
		super(title,senderName); //
		this.senderAddr=senderAddr;
		this.emailBody=emailBody;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println("----------------------------------------");
		System.out.println("제목: "+title);
		System.out.println("보내는 사람: "+senderName+" "+senderAddr);
		System.out.println("받는 사람: "+recipient);
		System.out.println("내용: "+emailBody);
	}
}
class SMSSender extends MessageSender{
	String returnPhoneNo;
	String message;
	SMSSender(String title, String senderName, String returnPhoneNo, String message){
		super(title, senderName);
		this.returnPhoneNo=returnPhoneNo;
		this.message=message;
	}
	
	@Override
	void sendMessage(String recipient) {
		System.out.println("----------------------------------------");
		System.out.println("제목: "+title);
		System.out.println("보내는 사람: "+senderName);
		System.out.println("받는 사람: "+recipient);
		System.out.println("회신 전화번호: "+returnPhoneNo);
		System.out.println("메세지 내용: "+message);
	}
}
// ☆☆☆ 부모 추상메서드를 사용법 --> 자식이 부모 추상메서드를 사용하기 위해 가져다 씀  그걸 어떻게? 오버라이딩해서 ~~~!
//abstract 메서드가 없어도 인스턴스 생성을 원하지 않으면 클래스를 abstract로 선언 할 수 있다. 
//--> 일반적인 클래스도 abstract 얘가 붙으면  인스턴스의 생성(객체생성)이 불가능
//그러나 abstract 메서드가 하나라도 있으면 그 클래스는 반드시 abstract로 선언 해야 한다.  
//--> 1-1로 했을때  1-2도 abstract 얘를 넣어야 오류 안생김( 추상이 붙으면 이 클래스는 자식에게 물려주기를 위한 것~)

public class InheritanceExample_02 {

	public static void main(String[] args) {
		EmailSender obj1=new EmailSender("생일을 축하합니다", "고객센터", "admin@dukeeshop.co.kr", "10%할인 쿠폰이 발행 되었습니다.");
		SMSSender obj2=new SMSSender("생일을 축하합니다", "고객센터", "02-000-0000", "10%할인 쿠폰이 발행 되었습니다.");
		
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-0000-0000");
		obj2.sendMessage("stickman@hahaha.com");
	}

}












