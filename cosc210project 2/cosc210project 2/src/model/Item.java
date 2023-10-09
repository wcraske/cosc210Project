package model;

public abstract class Item {
	private String name;
	private boolean done;

	
	//put requires, modifies and effects
	//getters
	public String getName() {
		return (name);
	}
	
	public boolean getDone() {
		return (done);
	}

	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}


}
