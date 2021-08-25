package chapter6;

public class Student {
	int num1;	//	 맴버 변수 -> 인스턴스 변수
	static int num2;	// static 변수
	
	static void myStaticMethod() {
		//num1=10;
		//method();
	}
	void myMethod() {	// 인스턴스 메서드(동적 영역 - 힙)
		num2 = 20;
		myStaticMethod();
	}
}
