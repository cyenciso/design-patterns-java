package pattern.models;

import pattern.behavior.DoNotWork;

public class Baby extends Person {
	
	public Baby() {
		this.setWorkBehavior(new DoNotWork());
	}
	
}
