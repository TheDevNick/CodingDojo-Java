import java.util.ArrayList;

public class ListOfExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowExceptions();
		names("Nick");

	}
	
	public static void ShowExceptions() {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		
		for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch(ClassCastException e ) {
                System.out.println(e);
            }
		}
		

	}
	
	public static void names(String name) {
		if (name.equals("Nick")) {
			System.out.println("Hello Nick");
		} else {
			System.out.println("Wrong Name");
		}
	}
	

}
