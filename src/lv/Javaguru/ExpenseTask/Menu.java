/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.ExpenseTask;

import java.util.Scanner;

/**
 *
 * @author Vitalij
 */
public class Menu {
    
    
    public String filename;
    public int menu, submenu;
    public ExpenseRegister expr;
    public void showMainMenu()
    {
        
        System.out.println("");
		System.out.println("---------------------");
		System.out.println("Main Menu: ");
		System.out.println("Choose Operation: ");
		System.out.println("1) Load File ");
		System.out.println("2) Save As ");
		System.out.println("3) Exit ");
        
    }
    
    public void showSubMenu()
    {
        System.out.println("");
		System.out.println("---------------------");
		System.out.println("Sub-Menu: ");
		System.out.println("Choose Operation: ");
		System.out.println("1) Show Data ");
		System.out.println("2) Add Data ");
		System.out.println("3) Delete Data ");
		System.out.println("4) Go To Main Menu ");
    }
    
    
    public void Run()
    {
        do{
        showMainMenu();
        Scanner scanMenu = new Scanner(System.in);
        menu=scanMenu.nextInt();
        
        
        switch(menu)
        {
            case 1:
                    System.out.println("Open file: ");
                Scanner filenameInput= new Scanner(System.in);
                filename=filenameInput.nextLine();
                expr.readFromFile(filename);
                    
                do{
                    showSubMenu();
                    Scanner submenuInput = new Scanner(System.in);
                    submenu= submenuInput.nextInt();
                    
                    if(submenu==1)
                    {
                        expr.printExpenses();
                    }
                    if(submenu==2)
                    {
                        
                    }
                }while(submenu==3);
        }
        
        
        
        }while(menu==4);
    }
}
