package chapter7;

public class Student {
	String name;
	int classRoom;
	
	public Student(String name, int classRoom) {
		this.name=name;
		this.classRoom = classRoom;
	}
	
	public void showinfo() {
		System.out.println(name + "는" + classRoom + "반 입니다.");
	}
}
