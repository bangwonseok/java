package chapter7_1;

public class Ex4 {
	public static void main(String[]args) {
		String[] texts = new String[3];
		texts[0] = "ABC";
		texts[1] = "DEF";
		texts[2] = "GHI";
		//texts[3] = "JKL"; // �迭 3���� ����
		
		String[]texts2 = new String[6]; // ���� ������ Ȯ�� x -> ū ������ ���ο� �迭�� ����
		for(int i=0; i< texts.length; i++) {
			texts2[i] = texts[i];	// ���� ���� ����
		}
		
		texts2[3] = "JKL";	// �����͸� �߰�
	}
}
