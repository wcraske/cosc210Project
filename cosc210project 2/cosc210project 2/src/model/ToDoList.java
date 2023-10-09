package model;

import java.util.*;
import java.io.*;


public class ToDoList extends Item implements Saveable, Loadable {	
	
	
	
	public String addItem(String input, ArrayList<String> doinglist) throws TooManyException{
		if(doinglist.size() == 10) {
			throw new TooManyException("\ntoo many tasks, you must have less than 3 tasks on to do list.");
		}
		doinglist.add(input);
		setName(input);
		return (input);
		
				
		
		
	}
	
	public void removeItem(int input, ArrayList<String> doinglist, ArrayList<String> crossedlist){
		crossedlist.add(doinglist.get(input-1));
		doinglist.remove(input-1);
		
			
	}
	
	public void showLists(ArrayList<String> doinglist, ArrayList<String> crossedlist, UrgentItem urg) {
		System.out.println("\nto do list:");
		for(int i = 0; i<doinglist.size(); i++) {
			System.out.println((i+1)+ " - " + doinglist.get(i));
			if(urg.getUrgent()) {
				System.out.print("^!!!!!^");
			}
			
		}
		System.out.println("\ncrossed off list:");
		for(int i = 0; i<crossedlist.size(); i++) {
			System.out.println((i+1)+ " - " + crossedlist.get(i));
		}
	}
	
	public void save(ArrayList<String> doinglist) throws IOException {
		
		File f = new File("todolist.txt");
		f.delete();
		try {
			FileWriter fw = new FileWriter("todolist.txt");
			for(int i = 0; i<doinglist.size(); i++) {
				fw.write(doinglist.get(i).toString() + "\n");
			}
			fw.close();
			}
			catch (IOException e) {
				System.out.println("an error has occured");
			}
		}
	
	public void load(ArrayList<String> doinglist) throws FileNotFoundException {
		try {
			File f = new File("todolist.txt");
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				setName(data);
				doinglist.add(data);
			}
			System.out.println("\nYour list has been loaded:)");
			sc.close();
		}
		catch(FileNotFoundException e){
			System.out.println("\ncant find file");
		}
		
	}
	
	public void urgency() {
		System.out.println("\nIs the item urgent? 1 if urgent, 2 if not: ");

		
	}



}
