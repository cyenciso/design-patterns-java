package inflexible.models;

public class Doctor extends Person {
	@Override
	public void doWork() {
		System.out.println("*does job*");
	}

}
