package chapter7_2;

import java.util.ArrayList;

public class Student {
	private int studentID; // �й�
	private String name; // �л� �̸�
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
		System.out.println("�й� : " + studentID + ", �̸� : " + name);
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
