/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.Lists;

import java.util.Scanner;

/**
 *
 *
 */
public class Lect2 {

    public void showMenu() {
        System.out.println("1: Add Element");
        System.out.println("2: View Element");
        System.out.println("3: Exit");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lect2 l = new Lect2();
        MyList p = new MyList();
        Scanner scan = new Scanner(System.in);
        int choose = 0;
        int value;
        int number;
        while (choose != 3) {

            l.showMenu();
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter value: ");
                    value = scan.nextInt();
                    p.add(value);
                    break;
                case 2:
                    System.out.println("Enter number: ");
                    number = scan.nextInt();
                    p.getValue(number);
                    break;
                case 3:
                    choose = 3;
                    break;
                default:
                    choose = 3;
            }
        }

    }
}
