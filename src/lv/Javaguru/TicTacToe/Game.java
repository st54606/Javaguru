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
public class Game {

	Field field = new Field();

	public void start() {
		Scanner input = new Scanner(System.in);
		HumanPlayer human = new HumanPlayer();
		HumanPlayer human1 = new HumanPlayer();
		AiPlayer aiPlayer = new AiPlayer();
		System.out.println("Choose who will play: ");
		System.out.println("1: Player vs Player");
		System.out.println("2: Computer vs Player");
		int choosePlayers = input.nextInt();
		if (choosePlayers == 1) {

			System.out.println("Player 1, enter your name: ");
			human.playerName = input.nextLine();
			System.out.println("Player 1 choose sign: 1 or 2 ");
			human.sign = input.nextInt();
			if (human.sign == 1) {
				human1.sign = 2;
			} else {
				human1.sign = 1;
			}
		}
		this.startGame(human, human1);
		if (choosePlayers == 2) {
			aiPlayer.playerName = "NPC";
			System.out.println("Player, enter your name: ");
			human.playerName = input.nextLine();
			System.out.println("Player 1 choose sign: 1 or 2 ");
			human.sign = input.nextInt();
			if (human.sign == 1) {
				aiPlayer.sign = 2;
			} else {
				aiPlayer.sign = 1;
			}
		}
		this.startGame(human, aiPlayer);
input.close();
	}

	public void startGame(Player player1, Player player2) {

		while (field.isAiWins(field) == 1 || field.isHumanWins(field) == 2) {
			System.out.println(player1.playerName + "Y our move");
			player1.makeMove(field);
			System.out.println(player2.playerName + " Your move");
			player2.makeMove(field);
			field.drawBoard();
		}

	}

}
