package pattern.decorators;

import pattern.icecream.IceCream;

public class Fruit extends Topping {

	public Fruit(IceCream icecream) {
		super(icecream);
	}

	@Override
	public double cost() {
		return this.getIcecream().cost() + .50;
	}
	
}
