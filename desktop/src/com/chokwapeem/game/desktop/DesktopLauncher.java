package com.chokwapeem.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.chokwapeem.game.SpaceShooter;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		new LwjglApplication(new SpaceShooter(), cfg);
		cfg.title = "SpaceShooter";
		cfg.width = 600;
		cfg.height = 500;
		cfg.useGL30 = false;
		cfg.resizable = false;
		
		new LwjglApplication(new SpaceShooter(), cfg);
	}
}
