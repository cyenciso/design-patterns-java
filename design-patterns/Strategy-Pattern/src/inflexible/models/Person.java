package inflexible.models;

public abstract class Person {
	/*
	  
	 If I want to add some common functionality, it will affect all my subclasses,
	 even those where the functionality doesn't quite fit. 
	 
	 I can instead create an interface for the functionality, but that would still involve heavily editing my subclasses
	 
	 */
	
	public abstract void doWork();
}
