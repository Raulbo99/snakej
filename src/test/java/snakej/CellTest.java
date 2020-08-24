package snakej;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CellTest {

	@Test
	public void testCreation() {
		Cell model = new Cell(2, 3);
		assertEquals(2, model.getX());
		assertEquals(3, model.getY());
	}

	@Test
	public void testEq() {
		Cell model1 = new Cell(2, 3);
		Cell model2 = new Cell(2, 3);
		Cell model3 = new Cell(1, 3);
		Cell model4 = new Cell(2, 4);
		assertEquals(model1, model1);
		assertEquals(model1, model2);
		assertEquals(model1.hashCode(), model2.hashCode());
		assertNotEquals(model1, model3);
		assertNotEquals(model1, model4);
		assertNotEquals(model1, null);
		assertNotEquals(model1, "sdsdsdf");
	}

	@Test
	public void testSet() {
		Cell model = new Cell(1, 4);
		model.setX(2);
		model.setY(3);
		assertEquals(2, model.getX());
		assertEquals(3, model.getY());
		assertNotEquals(1, model.getX());
		assertNotEquals(4, model.getY());

	}

	@Test(expected = IllegalArgumentException.class)
	public void testBadCells() {
		new Cell(1, -2);
	}

	@Test
	public void testToString() {
		Cell model = new Cell(3, 4);
		String exp = "Cell [x=3, y=4]";
		assertEquals(model.toString(), exp);

	}

}
