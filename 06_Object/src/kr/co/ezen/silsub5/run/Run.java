package kr.co.ezen.silsub5.run; // 08-31

import kr.co.ezen.silsub5.model.vo.Lotto.Lotto;

public class Run {
	
//	public static void main(String[] args) {
//		Lotto lo=new Lotto();
//		
//		lo.intformation();
	
	public static void main(String[] args) {            // 런에서 실행 방식
        System.out.println("=== 이번주 당첨 예상 번호 ===");

        for(int i=1;i<=5;i++) {
            System.out.printf("%d번째 예상 : ",i);
            Lotto lt=new Lotto();                       // Lotto 앞 클래스 static final int[] lotto=new int[6]; {   <== 여기꺼 (클래스에서 내용들이 어떻게 구성되어 있는가를 먼저 파악해야함)
            lt.intformation();
            System.out.println();
        }
		
	}

}
