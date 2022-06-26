package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();	//추상메서드를 선언하면 구현해야할 의무가 있음 
	
	public void washCar() {}
	
	public void startCar() {
			System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
			System.out.println("시동을 끕니다.");
	}

	final public void run() {		//final 을 썼을때 장점: 신
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}

