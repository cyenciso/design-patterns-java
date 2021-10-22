package flexible.models;

import flexible.behavior.DoWork;

public class Doctor extends Person {
	
	public Doctor() {
		this.setWorkBehavior(new DoWork());
	}
}
