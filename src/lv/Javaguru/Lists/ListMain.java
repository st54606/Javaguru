/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.Lists;

import java.util.Random;
import java.util.Scanner;

public class ListMain {

	public void showMenu() {
		System.out.println("1: Print List");
		System.out.println("2: ");
		System.out.println("3: Exit");
	}
	Element list = new Element();
	Element first= new Element();
	Element last = new Element();
	
	public Element createList(int size) {
		
		Random random = new Random();
		Element list = new Element();
		Element first= new Element();
		Element last = new Element();
		Element currentElement = first;
		first.rightElement=currentElement;
		first.value = random.nextInt(101);
		
		for (int i = 0; i < size-1; i++) {

			currentElement.rightElement = new Element();
			currentElement.rightElement.leftElement=currentElement;
			currentElement.rightElement = currentElement;
			currentElement.value = random.nextInt(101);
			
		}
				last=currentElement;
				last.rightElement=first;
				first.leftElement=last;
			
		return first;
	}

	public void printList(Element list) {
		Element currentElement = list;
		 
		while (currentElement.rightElement!=last) {
			System.out.println(currentElement.value);
			currentElement=currentElement.rightElement;
		}
	}


	public static void main(String[] args) {
		ListMain l = new ListMain();
		Element list = new Element();
		Scanner scan = new Scanner(System.in);
		int choose = 0;
		list =l.createList(10);
		while (choose != 3) {
			l.showMenu();
			choose = scan.nextInt();
			switch (choose) {
			case 1:
				l.printList(list);
				break;
			case 2:
				

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
