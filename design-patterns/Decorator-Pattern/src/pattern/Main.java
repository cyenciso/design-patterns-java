package pattern;

import pattern.decorators.Fruit;
import pattern.decorators.Fudge;
import pattern.decorators.Sprinkles;
import pattern.icecream.Chocolate;
import pattern.icecream.IceCream;
import pattern.icecream.Strawberry;
import pattern.icecream.Vanilla;

public class Main {
	public static void main(String[] args) {
		// First customer wants a chocolate ice cream with fruit
		IceCream order1 = new Chocolate();
		order1 = new Fruit(order1);
		System.out.println(order1.getDescription());
		System.out.printf("$%.2f%n", order1.cost());
		
		System.out.println();
		
		// Second customer wants a vanilla ice cream with sprinkles and double fudge
		IceCream order2 = new Vanilla();
		order2 = new Sprinkles(order2);
		order2 = new Fudge(order2);
		order2 = new Fudge(order2);
		System.out.println(order2.getDescription());
		System.out.printf("$%.2f%n", order2.cost());
		
		System.out.println();
		
		// Third customer wants a strawberry ice cream with everything
		IceCream order3 = new Strawberry();
		order3 = new Fruit(order3);
		order3 = new Sprinkles(order3);
		order3 = new Fudge(order3);
		System.out.println(order3.getDescription());
		System.out.printf("$%.2f%n", order3.cost());
	}
}
