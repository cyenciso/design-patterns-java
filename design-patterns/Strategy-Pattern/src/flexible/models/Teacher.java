package flexible.models;

import flexible.behavior.DoWork;

public class Teacher extends Person {

	public Teacher() {
		this.setWorkBehavior(new DoWork());
	}
}
