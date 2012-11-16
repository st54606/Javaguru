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

    Element first = new Element();
    Element current = new Element();
    int currentPos = 0;

    public void add(int value) {

        if (first == null) {
            first = new Element();
            first.value = value;
            
        }

        current = first;

        while (current.next != null) {
            current = current.next;
        }
        current.value=value;
    }

    public void getElementValue(int number) {
        int currentPos = 0;
        current=first;
        while (currentPos != number && current.next!=null) {
            current = current.next;
            currentPos++;
        }

        System.out.println(current.value);
    }
}
