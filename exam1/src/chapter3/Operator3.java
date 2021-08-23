package chapter3;

public class Operator3 {
	public static void main(String[]args) {
		int num=10;
		int num2=num++;// num2=10, num1=11
		System.out.println("num2=" + num2 + "num=" + num);
		
		int num3=++num; // num3=12 num=12
		System.out.println("num3=" + num3 + "num=" + num);
		int num4=num--; // num4= 12 num=11
		System.out.println("num4=" + num4 + "num=" + num);
		int num5=--num; // num5=10 num=10
		System.out.println("num5=" + num5 + "num=" + num);
		}
}
