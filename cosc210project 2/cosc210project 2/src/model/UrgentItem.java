package model;

public class UrgentItem extends Item{
	private String name;
	private boolean done;
	private boolean urgent;
	
	//put requires, modifies and effects
	//getters
	public String getName() {
		return (name);
	}
	
	public boolean getDone() {
		return (done);
	}
	
	public boolean getUrgent() {
		return (urgent);
	}
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}

	
	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}


}