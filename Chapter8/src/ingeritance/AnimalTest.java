package ingeritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	
		//Animal a = new Human();		
	
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	}
	

	public void moveAnimal(Animal animal) {		//매개변수의 자료형이 상위 클래스
			
		animal.move();		//코드는 1줄인데 결과물이 여러가지로 구현되는것 = 다형성    //재정의된 메서드가 호출됨
	
		if (animal instanceof Human) {		// if문 다운캐스팅이 빠지면 오류가 남
			Human human = (Human)animal;
			human.readBook();
		}
		else if (animal instanceof Tiger) {		// 하위클래스가 상위클래스로 형변환 되는것은 묵시적으로 형성. 
			Tiger tiger = (Tiger)animal;		// 다시 원래 자료형 하위클래스로 형변환하기위한 (다운캐스팅) 예약어가 instanceof
			tiger.hunting();
		}
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}
}
