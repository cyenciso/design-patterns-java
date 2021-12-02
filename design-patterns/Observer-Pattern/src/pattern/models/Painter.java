package pattern.models;

public class Painter implements Observer {
	private String royalFlower;
	private String royalColor;
	private String royalAnimal;
	private Queen herMajesty;
	
	// when a painter is created, give them a queen and register them so they can listen for her decrees
	public Painter(Queen q) {
		this.herMajesty = q;
		herMajesty.addObserver(this);
	}
	
	@Override
	public void update() {
		this.royalFlower = herMajesty.getFavoriteFlower();
		this.royalColor = herMajesty.getFavoriteColor();
		this.royalAnimal = herMajesty.getFavoriteAnimal();
	}
	
	public void paint() {
		System.out.println("The painter creates a primarily " + royalColor + " artwork. Its subject is the " 
				+ royalAnimal + ".\n It lays majestically in a lushous meadow and in its mouth is a single " +
				royalColor + " " + royalFlower + ".\n");
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
