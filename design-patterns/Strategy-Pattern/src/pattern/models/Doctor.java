package pattern.models;

import pattern.behavior.DoWork;

public class Doctor extends Person {
	
	public Doctor() {
		this.setWorkBehavior(new DoWork());
	}
}
