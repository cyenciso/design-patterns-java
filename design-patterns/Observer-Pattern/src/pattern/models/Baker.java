package pattern.models;

public class Baker implements Observer {
	private String royalFlower;
	private String royalColor;
	private String royalAnimal;
	private Queen herMajesty;
	
	// when a baker is created, give them a queen and register them so they can listen for her decrees
	public Baker(Queen q) {
		this.herMajesty = q;
		herMajesty.addObserver(this);
	}
	
	@Override
	public void update() {
		this.royalFlower = herMajesty.getFavoriteFlower();
		this.royalColor = herMajesty.getFavoriteColor();
		this.royalAnimal = herMajesty.getFavoriteAnimal();
	}
	
	public void bake() {
		System.out.println("The baker creates a " + royalColor + " cake in the shape of a(n) " + royalAnimal + 
				".\n It is decorated tastefully with " + royalFlower + " petals.\n");
	}

	// getters and setters
	public String getRoyalFlower() {
		return royalFlower;
	}

	public void setRoyalFlower(String royalFlower) {
		this.royalFlower = royalFlower;
	}

	public String getRoyalColor() {
		return royalColor;
	}

	public void setRoyalColor(String royalColor) {
		this.royalColor = royalColor;
	}

	public String getRoyalAnimal() {
		return royalAnimal;
	}

	public void setRoyalAnimal(String royalAnimal) {
		this.royalAnimal = royalAnimal;
	}
	
}
