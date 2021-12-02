package pattern.behavior;

/*
  To add in a new behavior to a Person, I can take the implementation out of the Person hierarchy completely.
  
  First, I create an interface for the behavior. For each different implementation, I can have a concrete class (DoWork and DoNotWork).
 */
public interface WorkBehavior {
	public abstract void work();
}
