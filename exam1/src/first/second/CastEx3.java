package first.second;

public class CastEx3 {
	public static void main(String[]agrs) {
		int num1=10;
		double num2=2.0; // == float num2=2.0F;
		
		System.out.println(num1+num2);
		System.out.print((num1-num2) + " ");
		System.out.print(num1/num2);
		System.out.print(num1*num2);	
		
		System.out.println((int)(num1+num2));
		System.out.println((int)(num1-num2));
		System.out.println((int)(num1/num2));
		System.out.println((int)(num1*num2));
	}
}
