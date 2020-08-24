package snakej;

import java.util.ArrayDeque;

public class Snake {

	private final ArrayDeque<Cell> snake = new ArrayDeque<>();

	private Direction crtDir;

	Snake(Cell head, Direction d) {
		snake.addFirst(head);
		this.crtDir = d;
	}

	public void advance(Direction d) {

	}

}
