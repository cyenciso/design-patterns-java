package pattern.icecream;

public abstract class IceCream {
	// fields
	private String description;
	
	public IceCream() {
		this.description = this.getClass().getSimpleName();
	}
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
