package chapter4;

public class SwitchEx2 {
	public static void main(String[]args) {
		String medal = "Gold";
		
		switch(medal) {
		case "Gold":
			System.out.print("금메달");
			break;
		case "Silver":
			System.out.print("은메달");
			break;
		case "Bronze":
			System.out.print("동메달");
			break;
		default:
			System.out.print("메달이 없습니다.");
			
		}
	}
}
