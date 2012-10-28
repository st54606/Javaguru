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
    
  HumanPlayer Human1 = new HumanPlayer();
  HumanPlayer Human2 = new HumanPlayer();
  
    /**
     *
     */
    @Override
    public void  AskForMoveHuman(Player Human) {
        this.Human1=(HumanPlayer) Human;
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Make move on horizontal");
       int hor_c= scan.nextInt();
       Human.setHor_c(hor_c);
       System.out.println("Make move on vertical");
       int vert_c = scan.nextInt();
       Human.setVert_c(vert_c);
       
       
    }
  
}
