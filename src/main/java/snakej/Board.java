package snakej;

public class Board {
	private final int rows;
	private final int cols;
	private final int[][] field;

	public Board(int rows, int cols) {
		if (rows <= 0) {
			throw new IllegalArgumentException("Invalid rows number");
		}
		if (cols <= 0) {
			throw new IllegalArgumentException("Invalid cols number");
		}
		this.rows = rows;
		this.cols = cols;
		this.field = new int[rows][cols];
		reset();
	}

	private void reset() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
					field[i][j] = Fields.BORDER.ordinal();
				} else {
					field[i][j] = Fields.EMPTY.ordinal();
				}

			}
		}
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	public Fields getCell(int x, int y) {
		return Fields.values()[field[x][y]];

	}
}
