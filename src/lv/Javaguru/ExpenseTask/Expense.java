/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.ExpenseTask;




public class Expense {
   

    
    private String date;
    private int sum;
    private String description;
    
    
    
    public Expense() {
        sum = 0;
        
        description = "";
        date="";
    }

    public Expense(String date, int sum, String description) {
        this.date = date;
        this.sum = sum;
        
        this.description = description;
                
    }
    
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    
    
    
    
    
    
}
