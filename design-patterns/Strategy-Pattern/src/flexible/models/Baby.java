package flexible.models;

import flexible.behavior.DoNotWork;

public class Baby extends Person {
	
	public Baby() {
		this.setWorkBehavior(new DoNotWork());
	}
	
}
