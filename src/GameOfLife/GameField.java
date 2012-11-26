package GameOfLife;

import java.text.FieldPosition;

public class GameField {
	boolean[][] fa = new boolean[10][10];

	// law: death will live if 3 alive is near
	public boolean isCellAlive(int x, int y) {
		return (fa[x][y]);
	}
	public boolean isCellDeath(int x, int y)
	{
		return(fa[x][y]);
	}

	public void makeCellAliveFromDeath(int x, int y) {
		int neighCounter = 0;
		for (int i = x - 1; i <= x + 1; i++)
			for (int j = y - 1; j <= y + 1; j++) {
				if (fa[i][j]) {
					neighCounter++;
				}
			}
		if (neighCounter == 3) {
			fa[x][y] = true;
		}

	}

	// law: Cell will alive if....

	public void willCellSurvive(int x, int y) {

		int neighCounter = -1;
		if (neighCounter < 2) {
			for (int i = x - 1; i <= x + 1; i++)
				for (int j = y - 1; j <= y + 1; j++) {
					if (fa[i][j]) {
						neighCounter++;
					}
				}
			if (neighCounter == 2 || neighCounter == 3) {
				fa[x][y] = true;
			}
		}
	}
public void gameStart()
{
	// ostanovilsa sdes
}
}
