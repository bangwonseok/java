package chapter4;

public class LoopEx5 {
	public static void main(String[]args) {
		/*
		do {
			System.out.println("�����?");
		}while(false);
		*/
		int num=1;
		int sum=0;
		do {
			sum+=num;
			num++;
			
		}while(num<=100);
		System.out.println("1���� 100������ ��?" + sum);
	}
}
