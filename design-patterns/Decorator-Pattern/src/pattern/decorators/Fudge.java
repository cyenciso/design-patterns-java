package pattern.decorators;

import pattern.icecream.IceCream;

public class Fudge extends Topping {

	public Fudge(IceCream icecream) {
		super(icecream);
	}

	@Override
	public double cost() {
		return this.getIcecream().cost() + .50;
	}
	
}
