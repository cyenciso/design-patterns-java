package pattern.models;

import pattern.behavior.WorkBehavior;

/*
  In my parent class, instead of having an abstract doWork() method, I have a workBehavior property. 
  I can have a default workBehavior and/or have have my classes assign the property the correct object.
  
  The implementation is no longer inside of the inheritance chain and I can dynamically change the behavior
  at runtime. 
 */

public abstract class Person {
	// fields
	WorkBehavior workBehavior;

	// methods
	public WorkBehavior getWorkBehavior() {
		return workBehavior;
	}

	public void setWorkBehavior(WorkBehavior workBehavior) {
		this.workBehavior = workBehavior;
	}
	

}
