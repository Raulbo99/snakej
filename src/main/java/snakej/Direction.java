package snakej;

public enum Direction {
	UP, DOWN, LEFT, RIGHT;

	public boolean isOppposite(Direction other) {
		if (other == null) {
			throw new NullPointerException();
		}
		switch (this) {
		case UP:
			return other == DOWN;
		case DOWN:
			return other == UP;
		case LEFT:
			return other == RIGHT;
		case RIGHT:
			return other == LEFT;
		default:
			throw new IllegalArgumentException();
		}
	}
}
