package chapter4;

public class LoopEx12 {
	public static void main(String[]args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				//if((i*j)%2!=0)
				if(i%2!=0)
					continue;
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println();
			
		}
	}
}
