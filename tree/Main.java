package tree;

public class Main {
	public static void main(String[] args) {
		DLL l = new DLL();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insertPosition(4, 2);
		l.print();
	}
}