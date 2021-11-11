package it.unibo.pensilina14.bullet.ballet.model.environment.events;

import it.unibo.pensilina14.bullet.ballet.model.characters.Enemy;
import it.unibo.pensilina14.bullet.ballet.model.characters.Player;

public class PlayerHitsEnemyEvent implements GameEvent {
	
	private final Player player;
	private final Enemy enemy;
	
	public PlayerHitsEnemyEvent(final Player player, final Enemy enemy) {
		this.player = player;
		this.enemy = enemy;
		// this.player.decreaseHealth(this.enemy.getConflictDamage);
		// this.enemy.decreaseHealth(this.player.getConflictDamage);
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public Enemy getEnemy() {
		return this.enemy;
	}
}
