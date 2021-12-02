package pattern.models;

import pattern.behavior.DoWork;

public class Teacher extends Person {

	public Teacher() {
		this.setWorkBehavior(new DoWork());
	}
}
