package chapter11_2;

public class StringEx2 {
	public static void main(String[]args) {
		String text1="ABC";	// 문자열 상수
		String text2="ABC";	
		System.out.println(text1==text2);
		
		String text3= new String("ABC");
		String text4= new String("ABC");
		System.out.println(text3==text4);
	}
}
