package interfaceex;

public class Myclass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
		
	}

	@Override
	public void y() {
		System.out.println("y()");
		
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
		
	}

	public static void main(String[] args) {
		
		Myclass myclass = new Myclass();
		
		X xClass = myclass;
		xClass.x();
	}
}
