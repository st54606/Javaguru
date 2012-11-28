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
public class Field {

	private static int Crust = 1;
	private static int Null = 2;
	private static int Space = 0;

	public int board[][] = new int[3][3];

	public void drawBoard() {
		System.out.println(" " + " " + "1" + " " + "2" + " " + " 3");

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + " ");
			for (int j = 0; j < 3; j++) {
				System.out.println(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void clearBoard() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				board[i][j] = Space;
			}
	}

	public void putSign(int x, int y, int value) {
		board[x][y] = value;

	}

	public int isHumanWins(Field field) {
		for (int i = 0; i <= 2; i++) {
			if (field.board[i][0] == 2 && field.board[i][1] == 2
					&& field.board[i][2] == 2) {
				System.out.println("Human wins!");
				return 0;
			}
			if (field.board[0][i] == 2 && field.board[1][i] == 2
					&& field.board[2][i] == 2) {
				System.out.println("Human wins!");
				return 0;
			}
		}
		if (field.board[0][0] == 2 && field.board[1][1] == 2
				&& field.board[2][2] == 2) {
			System.out.println("Human wins!");
			return 0;
		}
		if (field.board[0][2] == 2 && field.board[1][1] == 2
				&& field.board[2][0] == 2) {
			System.out.println("Human wins!");
			return 0;
		}
		return 1;
	}

	public int isAiWins(Field field) {
		for (int i = 0; i <= 2; i++) {
			if (field.board[i][0] == 1 && field.board[i][1] == 1
					&& field.board[i][2] == 1) {
				System.out.println("Ai wins!");
				return 0;
			}
			if (field.board[0][i] == 1 && field.board[1][i] == 1
					&& field.board[2][i] == 1) {
				System.out.println("Ai wins!");
				return 0;
			}
		}
		if (field.board[0][0] == 1 && field.board[1][1] == 1
				&& field.board[2][2] == 1) {
			System.out.println("Ai wins!");
			return 0;
		}
		if (field.board[0][2] == 1 && field.board[1][1] == 1
				&& field.board[2][0] == 1) {
			System.out.println("Ai wins!");
			return 0;
		}
		return 1;

	}
}
