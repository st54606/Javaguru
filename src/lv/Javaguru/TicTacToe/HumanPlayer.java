/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.TicTacToe;

import java.util.Scanner;

/**
 * 
 * @author Vitalij
 */
public class HumanPlayer extends Player {
	public int x, y, sign;

	@Override
	public void makeMove(Field field) {
		Scanner input = new Scanner(System.in);
		while (field.board[x][y] != 0) {
			System.out.println("Enter x: ");
			x = input.nextInt();
			System.out.println("Enter y: ");
			y = input.nextInt();
			if (field.board[x][y] != 0) {
				System.out
						.println("The cell is not empty or coordinates is out of range \n Please make your move again");
			}
		}
		field.putSign(x, y, sign);

	}
}
