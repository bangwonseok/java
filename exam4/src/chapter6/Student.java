package chapter6;

public class Student {
	static int serialNum;
	int studentID;
	String name;
	
	public void showInfo() {
		System.out.println("�ν��Ͻ� �޼���");
		serialNum = 100;
		getSerialNum();
	} , 
	
	public static int getSerialNum() {
		return serialNum;
	}
}
