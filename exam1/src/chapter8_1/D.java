package chapter8_1;

public class D extends C{
	int numD = 10;
	
	D() {
		//super(); // 상위 클래스의 생성자 호출
		System.out.println("D생성자");
	}
	
	
	D(int numD) {
		super(numD);	// 1.numC -> super() 호출 되어야 상위 인스턴스가 생성 
		// 매개변수가 있다고 해서 상위 매개변수가 있는 생성자 호출X
		// 기본 상위 생성사 호출
		this.numD = numD;
		//System.out.println("매개변수가 있는 생성자 D");
	}
	
	void methodD() {
		System.out.println("메서드 D");
	}
}
