package chapter7_1;

public class Ex4 {
	public static void main(String[]args) {
		String[] texts = new String[3];
		texts[0] = "ABC";
		texts[1] = "DEF";
		texts[2] = "GHI";
		//texts[3] = "JKL"; // 배열 3개라 에러
		
		String[]texts2 = new String[6]; // 기존 공간을 확장 x -> 큰 공간의 새로운 배열을 생성
		for(int i=0; i< texts.length; i++) {
			texts2[i] = texts[i];	// 기존 값을 복사
		}
		
		texts2[3] = "JKL";	// 데이터를 추가
	}
}
