package test;

import player.DVDPlayer;

public class PlayerTest03 {
	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();
		
		dvd.play();
		dvd.slow();
		dvd.fast();
		dvd.stop();
	}
}
