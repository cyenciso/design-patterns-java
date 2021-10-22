package inflexible.models;

public class Teacher extends Person {

	@Override
	public void doWork() {
		System.out.println("*does job*");
	}

}
