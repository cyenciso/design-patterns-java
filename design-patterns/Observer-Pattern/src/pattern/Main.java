package pattern;

import pattern.models.Baker;
import pattern.models.Bard;
import pattern.models.Painter;
import pattern.models.Queen;

public class Main {
	public static void main(String[] args) {
		// create a queen
		Queen queen = new Queen();
		
		// create her subjects
		Baker baker = new Baker(queen);
		Bard bard = new Bard(queen);
		Painter painter = new Painter(queen);
		
		// have the queen change set her favorite things
		queen.setFavoriteAnimal("tortoise");
		queen.setFavoriteColor("blue");
		queen.setFavoriteFlower("lily");
		
		baker.bake();
		bard.sing();
		painter.paint();
		
		System.out.println("======================================\n");
		
		// have the queen change her mind
		queen.setFavoriteAnimal("rabbit");
		queen.setFavoriteColor("yellow");
		queen.setFavoriteFlower("rose");
		
		baker.bake();
		bard.sing();
		painter.paint();
	}
}
