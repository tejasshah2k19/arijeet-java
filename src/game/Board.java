package game;

import game.characters.Human;
import game.assets.BgImage;

public class Board {
	public static void main(String[] args) {
		Human h = new Human();
		h.run();

		BgImage bg = new BgImage();
		bg.splashImg();
//		bg.blur();
	}
}
