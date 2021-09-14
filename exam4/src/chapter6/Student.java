package chapter6;

public class Student {
	static int serialNum;
	int studentID;
	String name;
	
	public void showInfo() {
		System.out.println("인스턴스 메서드");
		serialNum = 100;
		getSerialNum();
	} , 
	
	public static int getSerialNum() {
		return serialNum;
	}
}
