/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.ExpenseTask;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Vitalij
 */
public class MainMenuClass {

    public String filename;
    public int menu, submenu;
    public ExpenseRegister expr;

    public void showMainMenu() {

        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Main Menu: ");
        System.out.println("Choose Operation: ");
        System.out.println("1) Create New File ");
        System.out.println("2) Load File ");
        System.out.println("3) Save As ");
        System.out.println("4) Exit ");

    }

    public void showSubMenu() {
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("Sub-Menu: ");
        System.out.println("Choose Operation: ");
        System.out.println("1) Show Data ");
        System.out.println("2) Add Data ");
        System.out.println("3) Delete Data ");
        System.out.println("4) Go To Main Menu ");
    }

    public void Run() {
        do {
            showMainMenu();
            Scanner scanMenu = new Scanner(System.in);
            menu = scanMenu.nextInt();

            switch (menu) {
                case 1: // Create new file....
                    System.out.println("Enter new file name: ");
                    Scanner dataInputFileName = new Scanner(System.in);
                    String newFileName = dataInputFileName.nextLine();
                    File newFile = new File(newFileName);
                    if (newFile.exists()) {
                       
                        System.out.println("Entered file name already exist..\n" +"Enter new file name: ");
                        newFileName = dataInputFileName.nextLine();
                    }
                     try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
                    
                    
                    System.out.println("New file" + newFileName + " are cerated");
                    break;	
				//Load file
                case 2:
                    System.out.println("Open file: ");
                    Scanner filenameInput = new Scanner(System.in);
                    filename = filenameInput.nextLine();
                    expr.readFromFile(filename);

                    do {
                        showSubMenu();
                        Scanner submenuInput = new Scanner(System.in);
                        submenu = submenuInput.nextInt();

                        if (submenu == 1) {
                            expr.printExpenses();
                        }
                        // Add new data
                        if (submenu == 2) {
                            Scanner dataInput = new Scanner(System.in);
                            System.out.println("Enter date(day.month.year): ");
                            String expDate = dataInput.nextLine();

                            System.out.println("Enter sum: ");
                            int expSum = dataInput.nextInt();

                            System.out.println("Enter description");
                            String expDescription = dataInput.nextLine();

                            expr.addExpense(new Expense(expDate, expSum, expDescription));
                            expr.writeToFile(filename);
                        }
                        //Remove data
                        if (submenu == 3) {
                            System.out.println("Enter id of record to remove");
                            Scanner dataInput = new Scanner(System.in);
                            int id = dataInput.nextInt();
                            expr.removeExpenseByIndex(id);
                        }

                        if (submenu == 4) 
                            break;
                        
                    } while (menu != 4);
                    break;
                    // Save as....
			case 3:
				System.out.println("Enter  file name1: ");
				Scanner newFileNameToWrite = new Scanner(System.in);
				filename = newFileNameToWrite.nextLine();
				expr.writeToFile(filename);
				System.out.println("File  " + filename + "  are saved");
				break;
			default:
				
				System.exit(0);
                    break;
            }
        } while (menu != 4);

    }
}