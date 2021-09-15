package chapter9_3;

public abstract class Car {
	public abstract void drive(); // 일반 승용차 (ManualCar -> 운전자 운전, 자율 주행차 -> AI가 안준)
	public abstract void stop();
	public void startCart()	{// 시동 걸기
		System.out.println("시동 켜기");
	}
	public void turnOff() { // 시동 끄기
		System.out.println("시동 끄기");
	}
	
	public void run() {
		drive();
		stop();
		startCart();
		turnOff();
		
	}
}
