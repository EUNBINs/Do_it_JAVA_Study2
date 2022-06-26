//추상클래스란? 
//추상메서드를 포함한 클래스로 구현코드없이 메서드의 선언만 있음
//예) abstract int add(int x, int y); 
//int add(int x, int y){ } 에서 {}부분이 구현내용이므로 추상메서드가 아님
// 추상 클래스는 new(인스턴스화) 할수 없음


package abstractex;	// 추상클래스는 상속을 하기위해 사용하는 선언

public abstract class Computer {

		public abstract void display(); // {}가 없으므로 선언만 한 코드 = 바디가 없다
		public abstract void typing();
		
		public void turnOn() {
			System.out.println("전원을 켭니다");
		}

		public void turnOff() {
			System.out.println("전원을 끕니다");
		}
		
}

