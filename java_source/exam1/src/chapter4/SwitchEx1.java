package chapter4;

public class SwitchEx1 {
	public static void main(String[]args) {
		int rank=3;
		char medalColor;
		/*
		if(rank ==1) {
			medalColor = 'G';
		}else if (rank==2) {
			medalColor = 's';
		} else if (rank==3) {
			medalColor = 'B';
		} else {
			medalColor='A';
		}
		*/
		switch(rank) {
		case 1:
			medalColor='G';
		case 2:
			medalColor='S';
		case 3:
			medalColor='B';
		default :
			medalColor='A';
		}
		
		System.out.println("메달 색상은?" + medalColor);
	}
}
