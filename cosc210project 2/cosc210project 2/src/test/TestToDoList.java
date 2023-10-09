package test;

import model.ToDoList;
import model.TooManyException;
import model.UrgentItem;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class TestToDoList {  //junit testing yt

	@Test
	public void testAdditem() throws TooManyException {
		ToDoList todo = new ToDoList();
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> test2 = new ArrayList<String>();
		test.add("wash");
		test.add("dishes");
		test.add("clean");
		todo.addItem("washes", test2);
		todo.addItem("dishes", test2);
		todo.addItem("clean", test2);
		assertEquals(test2.size(), test.size());

	}

	@Test
	public void testRemoveItem() {
		ToDoList todo = new ToDoList();
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> test2 = new ArrayList<String>();
		test.add("wash");
		todo.removeItem(1, test, test2);
		assertEquals(test2.size(), 1);
	}
	private final PrintStream standOut = System.out;
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	@BeforeEach
	public void setUp(){
		System.setOut(new PrintStream(out));
	}
	@Test
	public void testShowLists(){
		ToDoList todo = new ToDoList();
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> test2 = new ArrayList<String>();
		UrgentItem urg = new UrgentItem();
		todo.showLists(test,test2, urg);
		assertEquals("\rto do list:\r\rcrossed off list:\r", out.toString());
	}
}
