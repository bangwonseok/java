package chapter8;

public class Customer2 {
	// 맴버 변수
		protected int customerID;	// 고객 아이디
		protected String customerName;	// 고객 이름
		protected String customerGrade;	// 고객 등급
		int bonusPoint;	// 보너스포인트
		double bonusRatio;	// 적립비율

		// 디폴트 생성자
		public Customer2() {
			customerGrade = "SILVER"; // 기본등급
			bonusRatio = 0.01;	// 보너스 포인트 기본 적립 비율
		}
		
		//메서드
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio; // 보너스 포인트 계산
			return price;
		}
		
		//메서드
		
		public String showCustomerInfo( ) {
			return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
		}
}
