package kr.co.ezen.silsub3.run;

import kr.co.ezen.silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle ci=new Circle();
		
		Circle.setRadius(3);
		
		System.out.println("원의 넓이:"+Circle.getRadius()*Circle.getRadius()*Circle.PI);
		System.out.println("원의 둘레:"+Circle.getRadius()*2*Circle.PI);
		
		Circle.incrementRadius();
		
		System.out.println("원의 넓이:"+Circle.getRadius()*Circle.getRadius()*Circle.PI);
		System.out.println("원의 넓이:"+Circle.getRadius()*2*Circle.PI);
		
		
	}
}
