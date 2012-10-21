/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru;

/**
 *
 * @author Jelena
 */
public class MyList {
    Element key = new Element();
     public void add (int number, int value)
    {
        
        int currentPos=0;
       while(currentPos!=number)
       {
          key.setNext(key);
          currentPos++;
       }
          key.setValue(7, 1);
     
    }
       public int getElementValue(int number)
       {
          int point=0;
          while(point!=number)
          {
              key=key.getNext();
              point++;
          }
           return key.getValue(number);
       }
}
