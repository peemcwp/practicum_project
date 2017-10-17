package com.chokwapeem.game;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

public class GameInput extends InputAdapter {
	public boolean keyDown(int k) {
		if(k == Keys.UP) {
			GameKeys.setKey(GameKeys.UP, true);
		}
		if(k == Keys.LEFT) {
			GameKeys.setKey(GameKeys.LEFT, true);
		}
		if(k == Keys.RIGHT) {
			GameKeys.setKey(GameKeys.RIGHT, true);
		}
		if(k == Keys.SPACE) {
			GameKeys.setKey(GameKeys.SPACE, true);
		}
		return true;
	}
	
	public boolean keyUp(int k) {
		if(k == Keys.UP) {
			GameKeys.setKey(GameKeys.UP, false);
		}
		if(k == Keys.LEFT) {
			GameKeys.setKey(GameKeys.LEFT, false);
		}
		if(k == Keys.RIGHT) {
			GameKeys.setKey(GameKeys.RIGHT, false);
		}
		if(k == Keys.SPACE) {
			GameKeys.setKey(GameKeys.SPACE, false);
		}
		return true;
	}

}
