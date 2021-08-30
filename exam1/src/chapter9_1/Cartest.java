package chapter9_1;

public class Cartest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Autocar autoCar = new Autocar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
	}
}
