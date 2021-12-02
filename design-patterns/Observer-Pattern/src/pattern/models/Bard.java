package pattern.models;

public class Bard implements Observer {
	private String royalFlower;
	private String royalColor;
	private String royalAnimal;
	private Queen herMajesty;
	
	// when a bard is created, give them a queen and register them so they can listen for her decrees
	public Bard(Queen q) {
		this.herMajesty = q;
		herMajesty.addObserver(this);
	}
	
	@Override
	public void update() {
		this.royalFlower = herMajesty.getFavoriteFlower();
		this.royalColor = herMajesty.getFavoriteColor();
		this.royalAnimal = herMajesty.getFavoriteAnimal();
	}
	
	public void sing() {
		System.out.println("The bard sings a cheerful ballad about a magical " + royalAnimal + 
				" that lives in a magical wood.\n In the wood's center is a " + royalColor + " " +
				royalFlower + " that has grown so large it is the size of an oak.\n");
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
