package chapter3;

public class Operator5 {
	public static void main(String[]args) {
		int num1=10;
		int num2=20;
		String result = (num1>num2)?"ũ��":"�۴�";
		System.out.println(result);
		
		String result2;
		if(num1>num2) {
			result2 = "ũ��";
		}else {
			result2 = "�۴�";
		}
		System.out.println(result);
	}
}