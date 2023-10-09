package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestLoadable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File f = new File("testtodo.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}
	catch(FileNotFoundException e){
		System.out.println("\ncant find file");
	}

	}

}
