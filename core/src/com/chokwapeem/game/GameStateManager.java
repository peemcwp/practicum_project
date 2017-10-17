package com.chokwapeem.game;

public class GameStateManager {
	private GameState gameState;
	
	public GameStateManager() {
		gameState = new PlayState(this);
	}
	
	public void update(float dt) {
		gameState.update(dt);
	}
	
	public void draw() {
		gameState.draw();
	}
	
}
