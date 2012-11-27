package GameOfLife;

import junit.framework.Assert;
import lv.Javaguru.Game;

import org.junit.Test;

public class TestGameField {

	@Test
	public void testMakeCellAliveFromDeath() {
		GameField field = new GameField();

		field.fa[3][2] = true;
		field.fa[2][2] = true;
		field.fa[4][2] = true;
		field.makeCellAliveFromDeath(3, 3);
		Assert.assertEquals(true, field.fa[3][3]);
	}

	@Test
	public void testIsCellAlive() {
		GameField field = new GameField();
		
		field.fa[0][0] = true;
		Assert.assertEquals(true, field.isCellAlive(0, 0));
	}

	@Test
	public void testIsCellNotAlive() {
		GameField field = new GameField();
		Assert.assertEquals(false, field.isCellAlive(3, 3));
	}

	@Test
	public void testWillCellSurvive1() {
		GameField field = new GameField();

		field.fa[3][2] = true;
		field.fa[2][2] = true;
		field.fa[4][2] = true;
		field.willCellSurvive(3, 3);
		Assert.assertEquals(true, field.fa[3][3]);

	}
}
// LIVE <2 neigh = DIES
// LIVE >3 neigh = DIES
// LIVE 2,3 - LIVES
// DEAD 3l == LIVE OK