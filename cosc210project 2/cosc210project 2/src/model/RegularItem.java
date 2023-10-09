package model;

public class RegularItem extends Item{
	private String name;
	private boolean done;
	private String dueDate;
	
	//put requires, modifies and effects
	//getters
	public String getName() {
		return (name);
	}
	
	public boolean getDone() {
		return (done);
	}
	
	public String getDueDate() {
		return (dueDate);
	}
	
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}


}