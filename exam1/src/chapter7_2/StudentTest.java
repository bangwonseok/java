package chapter7_2;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student(1001, "Lee");
		lee.addSubject("±¹¾î", 100);
		lee.addSubject("¼öÇÐ", 50);
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("±¹¾î", 70);
		kim.addSubject("¼öÇÐ", 80);
		kim.addSubject("¿µ¾î", 100);
		
		System.out.println("------------- LEE ------------");
		lee.showInfo();
		
		System.out.println("------------- KIM ------------");
		kim.showInfo();
	}
}
