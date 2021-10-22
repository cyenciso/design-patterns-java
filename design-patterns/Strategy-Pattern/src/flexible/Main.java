package flexible;

import flexible.behavior.DoNotWork;
import flexible.models.Doctor;

/*
  This class tests the strategy pattern. Notice that the behavior is no longer tied to the models.  
  I can now create new kinds of work behavior or create a whole new behavior and it will not break my inheritance chain.
 */
public class Main {
	public static void main(String[] args) {
		// create a doctor object
		Doctor doctor = new Doctor();
		
		// get doctor to the behavior
		doctor.getWorkBehavior().work();
		
		// dynamically change behavior
		doctor.setWorkBehavior(new DoNotWork());
		
		// get doctor to do different implementation behavior
		doctor.getWorkBehavior().work();
	}
}
