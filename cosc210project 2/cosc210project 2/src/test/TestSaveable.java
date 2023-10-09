package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Saveable;
import model.ToDoList;

public class TestSaveable implements Saveable{

	public static void main(String[] args) {
		ToDoList todo = new ToDoList();
		ArrayList<String> testlist = new ArrayList<String>();
		testlist.add("hi");
		testlist.add("hello");
		
		try {
			FileWriter fw = new FileWriter("testtodo.txt");
			for(int i = 0; i<testlist.size(); i++) {
				fw.write(testlist.get(i).toString() + "\n");
			}
			fw.close();
			}
			catch (IOException e) {
				System.out.println("an error has occured");
			}
		

		// TODO Auto-generated method stub
		
		
	}
	
}
