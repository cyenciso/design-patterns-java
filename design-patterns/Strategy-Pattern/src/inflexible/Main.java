package inflexible;

import inflexible.models.Doctor;

/*
  This class tests the inflexible design. Our doctor object can only do the work hard-coded into it.
  
  If I want to introduce a new Person behavior, I will have to manually add the changes in all my subclasses
  in a way that is tedious.
 */
public class Main {
	public static void main(String[] args) {
		// create a doctor object
		Doctor doctor = new Doctor();
		
		// get doctor to the behavior
		doctor.doWork();
	}
}
