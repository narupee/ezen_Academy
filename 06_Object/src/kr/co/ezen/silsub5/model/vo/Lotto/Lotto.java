package kr.co.ezen.silsub5.model.vo.Lotto; // 08-31

public class Lotto {
	static final int[] lotto=new int[6]; {
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;  // 0~44
		}
	}
	public void intformation() {
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
				
			}
		}
	
	
	/*
	public int lotto;

	public int getLotto() {
		return lotto;
	}

	public void setLotto(int lotto) {
		this.lotto = lotto;
	}
	
	public static void main(String[] args) { //배열 방식...
		int Lotto[]=new int[6];
		
		// 번호생성
		for(int i=0; i<6; i++) {
			Lotto[i] = (int)(Math.random()*45)+1;
			
			// 중복 번호 제거
			for(int j=0; j<i; j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또 번호: ");
		
		// 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(Lotto[i]+" ");
		}
		*/
	
	
}
