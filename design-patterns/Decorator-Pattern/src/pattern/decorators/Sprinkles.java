package pattern.decorators;

import pattern.icecream.IceCream;

public class Sprinkles extends Topping {

	public Sprinkles(IceCream icecream) {
		super(icecream);
	}

	@Override
	public double cost() {
		return this.getIcecream().cost() + .50;
	}
	
	

}
