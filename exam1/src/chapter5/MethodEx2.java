package chapter5;

public class MethodEx2 {
	public static void main(String[]args) {
		divide(10,0);
	}
	
	static void divide(int num1, int num2) {
		
		if(num2==0) {
			System.out.println("응0이야");
			return; // 반환하고, 함수의 수행이 정료
		}
		int result=num1/num2;
		System.out.println(result);
	}
	
}
