/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru;

/**
 *
 * @author Vitalij
 */
public class Player {

    private int hor_c;
    private int vert_c;

    public void setVert_c(int vert_c) {
        this.vert_c = vert_c;
    }

    public void setHor_c(int hor_c) {
        this.hor_c = hor_c;
    }

    public int getVert_c() {
        return vert_c;
    }

    public int getHor_c() {
        return hor_c;
    }

    public void AskForMoveHuman(Player Human) {
        System.out.println("Now your move" + "Player");

    }

    public void makeMove() {
    }
}
