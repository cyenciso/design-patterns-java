package pattern.decorators;

import pattern.icecream.IceCream;

public abstract class Topping extends IceCream {

	private IceCream icecream;
	
	public Topping(IceCream icecream) {
		this.icecream = icecream;
	}
	
	public String getDescription() {
		return this.icecream.getDescription() + ", " + this.getClass().getSimpleName();
	}

	public IceCream getIcecream() {
		return icecream;
	}

	public void setIcecream(IceCream icecream) {
		this.icecream = icecream;
	}
	
	
	
	
}
