/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.Lists;

/**
 *
 * @author Jelena
 */
public class MyList {
    public Element first;
    public Element current;
    
    
     public void add ( int value)
     {           
         if(first==null){
    first = new Element();
    first.value=value;
    current = first;
        
         }
         else
         {
         current=first;
         
         while(current!=null)
         {
             current.value=value;
             current=current.next;
         }
     }    } 
         public void getValue (int number)
         {
             int counter=1;
             while(current!=null && counter!=number)
             {
                 current=current.next;
                 counter++;
             }
             
             System.out.println("Value is "+ current.value);
         }
}
      
       
           
          
       
         
     
         
