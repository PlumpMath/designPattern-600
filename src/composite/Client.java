package composite;

public class Client {
	public static void main(String[] args) {
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();
		Leaf leaf3 = new Leaf();
		Composite composite = new Composite();
		Composite composite1 = new Composite();
		composite.add(composite1);
		composite.add(leaf1);
		composite1.add(leaf2);
		composite1.add(leaf3);
		composite.operation();
	}
}
