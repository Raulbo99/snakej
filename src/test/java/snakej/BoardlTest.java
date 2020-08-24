package snakej;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardlTest {

	@Test
	public void testCreation() {
		Board model = new Board(10, 20);
		assertEquals(10, model.getRows());
		assertEquals(20, model.getCols());
		assertEquals(Fields.BORDER, model.getCell(0, 0));
		assertEquals(Fields.BORDER, model.getCell(0, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testBadRows() {
		new Board(-10, 20);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testBadCols() {
		new Board(10, -20);
	}
}
