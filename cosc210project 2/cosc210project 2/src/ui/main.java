package ui;

import java.io.IOException;
import java.util.*;

import model.Item;
import model.ToDoList;
import model.TooManyException;
import model.UrgentItem;
public class main {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws IOException, TooManyException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//
		ToDoList todo = new ToDoList();			
		
		ArrayList<String> doinglist = new ArrayList<String>(); //create list of items.
		ArrayList<String> crossedlist = new ArrayList<String>();
		UrgentItem urg = new UrgentItem();


		while(true){
		System.out.println("\nWhat would you like to do?\n1. Add an item to the to do list? \n2. Cross off an item \n3. Show all the items \n4. Save your lists \n5. load your lists");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("\nEnter the item to do: ");
			sc.nextLine();
			String x;
			x = sc.next();
			try {
				todo.addItem(x, doinglist);
				
			} catch (TooManyException e) {
				System.out.println("\ntoo many tasks, you must have less than 10 tasks on to do list. Remove one then try again.");
			}
			finally {
				continue;
			}
		}
		
		else if (choice == 2){
			for(int i = 0; i<doinglist.size(); i++) {
				System.out.println((i+1)+ " - " + doinglist.get(i));
			}

			System.out.println("\nEnter the number of the item to cross off: ");
			int input = sc.nextInt();
			todo.removeItem(input, doinglist, crossedlist);
		}
		
		else if(choice == 3) {
			todo.showLists(doinglist, crossedlist, urg);
		}
		
		else if(choice == 4) {
			todo.save(doinglist);
		}
		
		else if(choice == 5) {
			todo.load(doinglist);
		}
		else {
			System.out.println("thats not an option\n");
			}
		}

	}



}
