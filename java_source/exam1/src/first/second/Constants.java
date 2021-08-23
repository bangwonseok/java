package first.second;

public class Constants {
	public static void main(String[]args) {
		//final int NUM = 10; // 상수
		
		//NUM = 20;
		//System.out.println(NUM);
		
		final double NUM;
		
		NUM=10.123; // 초기 1번 대입 다능
		System.out.println(NUM);
		
		//NUM=11.123;
		
		String text1= "ABCD";
		String text2= "ABCD";
		System.out.println(text1==text2);
		
		String text3= new String("ABCD");
		String text4= new String("ABCD");
		System.out.println(text3==text4);
		
	}
}
