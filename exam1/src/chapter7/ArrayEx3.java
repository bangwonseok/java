package chapter7;

public class ArrayEx3 {
	public static void main(String[]args) {
		//System.out.println('A'+1); // 'A' -> char(2����Ʈ ����) + 1(int -4����Ʈ ����)
		char[]alpha= new char[26]; // 2����Ʈ�� �� 52���� ���� ���� -> �ε��� ��ȣ�� ����
		char ch='A'; // ���� 65
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = ch++;
			// ch++ -> ch(char) + 1(int) -> int(������ �� ��ȯ)
		}
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]);
		}
	}	
}
