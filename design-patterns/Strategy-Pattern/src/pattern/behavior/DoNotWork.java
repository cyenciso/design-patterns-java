package pattern.behavior;

public class DoNotWork implements WorkBehavior {
	public void work() {
		System.out.println("*doesn't do any work*");
	}
}
