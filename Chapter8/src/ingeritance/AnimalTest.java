package ingeritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
	
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�ϴ��� ���ư��ϴ�.");
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
	

	public void moveAnimal(Animal animal) {		//�Ű������� �ڷ����� ���� Ŭ����
			
		animal.move();		//�ڵ�� 1���ε� ������� ���������� �����Ǵ°� = ������    //�����ǵ� �޼��尡 ȣ���
	
		if (animal instanceof Human) {		// if�� �ٿ�ĳ������ ������ ������ ��
			Human human = (Human)animal;
			human.readBook();
		}
		else if (animal instanceof Tiger) {		// ����Ŭ������ ����Ŭ������ ����ȯ �Ǵ°��� ���������� ����. 
			Tiger tiger = (Tiger)animal;		// �ٽ� ���� �ڷ��� ����Ŭ������ ����ȯ�ϱ����� (�ٿ�ĳ����) ���� instanceof
			tiger.hunting();
		}
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
}