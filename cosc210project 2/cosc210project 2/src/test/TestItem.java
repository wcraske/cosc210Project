package test;

import model.Item;
import model.ToDoList;

public class TestItem extends Item {

	public static void main(String[] args) {
		ToDoList test = new ToDoList();
		
		test.setName("wash clothes");
		System.out.println(test.getName());
		
		test.setDone(true);
		System.out.println(test.getDone());
		
		//test.setDueDate("sept 11");
		//System.out.println(test.getDueDate());
	}
}
