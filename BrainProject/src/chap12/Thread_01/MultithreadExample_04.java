package chap12.Thread_01;  //인터페이스 안에 구현객체넣기

 class SmallLetters implements Runnable{
	
	public void run() {
		for(char ch='a';ch<='z';ch++)
			System.out.print(ch);
	}
	
} // ①

public class MultithreadExample_04 {

	public static void main(String[] args) {
		Thread thread=new Thread(new SmallLetters());    // ① 전체를 thread에 넣음 
		                      // ㄴ 전체 넣는 방법은 이방법! 
		thread.start();
		char arr[]= {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		
		for(char ch:arr)
			System.out.print(ch);
	}

}


