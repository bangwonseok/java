package chapter6;

public class Student {
	int num1;	//	 �ɹ� ���� -> �ν��Ͻ� ����
	static int num2;	// static ����
	
	static void myStaticMethod() {
		//num1=10;
		//method();
	}
	void myMethod() {	// �ν��Ͻ� �޼���(���� ���� - ��)
		num2 = 20;
		myStaticMethod();
	}
}
