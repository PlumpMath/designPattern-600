package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> list = new ArrayList<>();

	@Override
	public void operation() {
		for (Component component : list) {
			component.operation();
		}
	}

	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public Component getChild(int index) {
		return list.get(index);
	}

}
