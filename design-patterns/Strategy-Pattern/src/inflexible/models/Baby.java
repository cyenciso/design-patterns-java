package inflexible.models;

public class Baby extends Person {
	
	/*
	  Although babies don't have a profession, they will need to implement doWork() 
	 */
	@Override
	public void doWork() {
		System.out.println("*doesn't do any work*");
	}

}
