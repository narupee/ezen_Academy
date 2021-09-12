package kr.co.ezen.silsub2.run;

import kr.co.ezen.silsub1.model.vo.Member.Member;
import kr.co.ezen.silsub2.model.vo.Product.Product;

public class Run {

	public static void main(String[] args) {
		Product pr=new Product();
		
		 pr.setpName("겟또셋또");
		 pr.setPrice(10000);
		 pr.setBrand("애또");
		 
	System.out.println(pr.getpName());
	System.out.println(pr.getPrice());
	System.out.println(pr.getBrand());
		
	}
}
	
/* 실행 답
 
겟또셋또
10000
애또

 */