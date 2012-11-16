/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.ExpenseTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ExpenseRegister {

    ArrayList<Expense> expenseList = new ArrayList<Expense>();

    
    public void removeExpenseByIndex(int id)
    {
        expenseList.remove(id); 
    }
            
    public void addExpense(Expense e)
    {
        expenseList.add(e);
    }
   public void removeExpenseByObject(Expense e)
   {
       expenseList.remove(e);
   }
   
    public void removeExpenseBySum(int sum) {
        expenseList.remove(sum);
    }

    public void getExpenseBySum(int sum) {
        expenseList.get(sum);
    }

    public void removeExpenseByDescription(String description) {
    }

    public void printExpenses() {
        for (int i = 0; i < expenseList.size(); i++) {
            System.out.println("Nr " + i + "." + "Date:" + expenseList.get(i).getDate() + " "
                    + "Sum: " + expenseList.get(i).getSum() + " "
                    + "Description: " + expenseList.get(i).getDescription());
        }
    }

    public void createNewFile(String filename)
    {
        
        System.out.println("Enter file name: ");
        Scanner dataInput = new Scanner(System.in);
        String newFileName = dataInput.nextLine();
        File newFile = new File(newFileName);
        if(newFile.exists())
        {
            System.out.println("Entered file name already exist..");
            newFileName=dataInput.nextLine();
            
        }
        System.out.println("New file"+ newFileName + " are cerated");
    }
    public void writeToFile(String filename) {
        File f = new File(filename);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < expenseList.size(); i++) {
                bw.write(expenseList.get(i).getDate() + "," + expenseList.get(i).getSum() + "," + expenseList.get(i).getDescription() + "\n");


            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
public void readFromFile(String filename)
{
    try{
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        
        
        String buf;
        
        while((buf=br.readLine())!=null)
        {
            String[] temp = buf.split(",");
            addExpense(new Expense(temp[0], Integer.parseInt(temp[1]), temp[2]));
        }
        
        br.close();
        fr.close(); 
        
    } catch(IOException e)
    {
        e.printStackTrace();
    }
    
}
}
