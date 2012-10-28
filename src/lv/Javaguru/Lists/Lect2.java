/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.Lists;

import java.util.Scanner;

/**
 *
 * @author Jelena
 */
public class Lect2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MyList p = new MyList();
        /*p.add(1, 7);
        int key=p.getElementValue(1);*/
        int value;
       //System.out.println(key);
        
        System.out.println("Enter count of elements");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        
         int flag=0;
        while(flag!=n)
        {
            System.out.println("Enter value of element"+ flag);
            value = scan.nextInt();
            p.add(flag, value);
            flag++;
        }
        flag=0;
        
        
        int key1;
                while(flag!=n)
                {
                    key1=p.getElementValue(flag);
                    System.out.println(key1);
                    flag++;
                            
                }
                
    }
}
