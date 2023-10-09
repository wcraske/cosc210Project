package test;

import java.util.*;

import model.ToDoList;
import model.TooManyException;
import model.UrgentItem;

public class TooManyExceptionTest {
	
	public static void main(String[] args) {
	ToDoList todo = new ToDoList();
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> doinglist = new ArrayList<String>();
	ArrayList<String> crossedlist = new ArrayList<String>();
	/*UrgentItem urg= new UrgentItem();
	doinglist.add("test1");
	doinglist.add("test2");
	doinglist.add("test3");

	//expect error first
	try {
		todo.addItem(doinglist, urg);
	}  catch(TooManyException e){
		System.out.println("error caught");
	}
	
	
	ArrayList<String> doinglis = new ArrayList<String>();
	ArrayList<String> crossedlis = new ArrayList<String>();
	UrgentItem ur= new UrgentItem();
	doinglist.add("test1");
	doinglist.add("test2");
	
	
	
	try {
		todo.addItem(doinglis, ur);
	}  catch(TooManyException e){
		System.out.println("error caught");
	}
	System.out.print("no error caught");
	*/
	}

}
