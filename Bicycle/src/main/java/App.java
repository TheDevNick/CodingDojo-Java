package main.java;
import main.java.classes.Bicycle;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bicycle b = new Bicycle();
        // print constant
        System.out.println(Bicycle.myConstant);
        b.sayHello();
        Bicycle.staticMethod();
        b.speedUp(3);
        b.applyBrakes(3);
        System.out.println(b.getSpeed());
	}

}
