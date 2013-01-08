package entity;

import java.util.Random;

import level.Level;

public class Entity {

	public int x, y;
	public boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
}
