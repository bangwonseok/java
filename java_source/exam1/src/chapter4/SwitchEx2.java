package chapter4;

public class SwitchEx2 {
	public static void main(String[]args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.print("�ݸ޴�");
			break;
		case "Silver":
			System.out.print("���޴�");
			break;
		case "Bronze":
			System.out.print("���޴�");
			break;
		default:
			System.out.print("�޴��� �����ϴ�.");
			
		}
	}
}
