package main.java;

import main.java.classes.Galaxy;
import main.java.classes.IPhone;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Galaxy S9 = new Galaxy("S9", 99, "Verizon", "Ring ring ring");
		IPhone iphone10 = new IPhone("X", 100, "AT&T", "Zing");
		
		S9.displayInfo();
		System.out.println(S9.ring());
		System.out.println(S9.unlock());
		
		iphone10.displayInfo();
		System.out.println(iphone10.ring());
		System.out.println(iphone10.unlock());
	}

}
