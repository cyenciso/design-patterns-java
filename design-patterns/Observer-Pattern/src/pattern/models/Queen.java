package pattern.models;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Subject {
	private String favoriteFlower;
	private String favoriteColor;
	private String favoriteAnimal;
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}

	// getters and setters
	public String getFavoriteFlower() {
		return favoriteFlower;
	}

	public void setFavoriteFlower(String favoriteFlower) {
		this.favoriteFlower = favoriteFlower;
		notifyObservers();
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
		notifyObservers();
	}

	public String getFavoriteAnimal() {
		return favoriteAnimal;
	}

	public void setFavoriteAnimal(String favoriteAnimal) {
		this.favoriteAnimal = favoriteAnimal;
		notifyObservers();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
