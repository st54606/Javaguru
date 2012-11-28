package lv.Javaguru.TicTacToe;

import java.util.Random;

public class AiPlayer extends Player {
	public int sign;

	@Override
	public void makeMove(Field field) {
		int x = -1, y = -1;
		Random generatorX = new Random();
		Random generatorY = new Random();

		while (field.board[x][y] != 0) {
			x = generatorX.nextInt(2);
			y = generatorY.nextInt(2);
		}
		field.putSign(x, y, sign);

	}

}
