package chapter10_5;

public class LestJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 접수");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 전화를 하지 않거나, 가장 짧은 대기열의 연결");
		
	}

}
