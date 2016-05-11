package composite;

public class Leaf extends Component {

	@Override
	public void operation() {
		System.out.println("this is Leaf");
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getChild(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
