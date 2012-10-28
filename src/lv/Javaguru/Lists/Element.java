/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.Lists;

/**
 *
 * @author Jelena
 */
public class Element {
    private int value;
   private Element next;

    public void setValue(int value, int number) {
        this.value = value;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public int getValue(int number) {
        return value;
    }

    public Element getNext() {
        return next;
    }
    
   
}
