//�߻�Ŭ������? 
//�߻�޼��带 ������ Ŭ������ �����ڵ���� �޼����� ���� ����
//��) abstract int add(int x, int y); 
//int add(int x, int y){ } ���� {}�κ��� ���������̹Ƿ� �߻�޼��尡 �ƴ�
// �߻� Ŭ������ new(�ν��Ͻ�ȭ) �Ҽ� ����


package abstractex;	// �߻�Ŭ������ ����� �ϱ����� ����ϴ� ����

public abstract class Computer {

		public abstract void display(); // {}�� �����Ƿ� ���� �� �ڵ� = �ٵ� ����
		public abstract void typing();
		
		public void turnOn() {
			System.out.println("������ �մϴ�");
		}

		public void turnOff() {
			System.out.println("������ ���ϴ�");
		}
		
}

