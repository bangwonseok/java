package chapter7_2;

import java.util.ArrayList;

public class Student {
	private int studentID; // 학번
	private String name; // 학생 이름
	private ArrayList<Subject> subject;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		subject = new ArrayList<Subject>();
	}
	
	public void addSubject(String title, int score) {
		subject.add(new Subject(title, score));
	}
	
	public void showInfo() {
		System.out.println("학번 : " + studentID + ", 이름 : " + name);
		/*
		for(int i=0; i<subjects.size(); i++) {
			Subjec
		}
		*/
		for(Subject subject : subjects) {
			subject.showSubjects();
		}
		System.out.println("==========");
	}
}
