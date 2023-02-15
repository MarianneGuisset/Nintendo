package test;
import model.*;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("Steam Deck", 350, "2021-08-22");
		Console c2 = new Console("Nintendo Switch", 350, "2021-12-22");
		
		Jeu j1 = new Jeu("Dead Cells", c1);
		Jeu j2 = new Jeu("Slay The Spire", c1);
		Jeu j3 = new Jeu("Stardew Valley", c2);
		Jeu j4 = new Jeu("Dicey Dungeons", c1);
		Jeu j5 = new Jeu("Baba is you", c2);
		
		Client cl1 = new Client("Ney","Davout");
		Client cl2 = new Client("Lannes","Murat");
		
		

	}

}
