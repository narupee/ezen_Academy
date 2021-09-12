package chap06.polymorphism_03;

class Father {
	public void play() {
		System.out.println("father:swimming");
	}

	public void study() {
		System.out.println("father:java programming");
	}
}

class Johnharu extends Father {
	public void study() {
		System.out.println("johnharu:C# Programming");
	}
}

class Gracedew extends Father {
	public void play() {
		System.out.println("gracedew:BaseBall");
	}
}

class Moon extends Father {
	public void play() {
		System.out.println("moon:BasketBall");
	}

	public void study() {
		System.out.println("moon:Visual Basic, Visual C++");
	}
}

public class Polymorphism_01 {

	public static void main(String[] args) {
		Father daddy = new Father();
		daddy.play();
		daddy.study();

		daddy = new Johnharu();
		daddy.play();
		daddy.study();

		daddy = new Gracedew();
		daddy.play();
		daddy.study();

		daddy = new Moon();
		daddy.play();
		daddy.study();

		// 상속관계에서 자식으로 객체생성을 하고 부모 타입에 대입하는 것을 다형성이라고 한다.
		// 그러면 부모 위주로 처리한다.
		// 단, 메서드에서 자식 메서드가 부모 메서드를 오버라이딩했다면 자식 메서드가 우선이다.
	}

}







