package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		//Computer c1 = new Computer();		//Computer class 추상화라서 인스턴스화 불가능
		Computer c2 = new DeskTop();		//업캐스팅
		//Computer c3 = new NoteBook();
		
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.display();
	}

}
