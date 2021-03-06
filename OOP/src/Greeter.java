
public class Greeter {
    public String greet(String name){
        return CreateGreeting(name);
    }
    public String greet(){
        return CreateGreeting("World");
    }
    
    public String greet(String firstName, String lastName) {
    	return CreateGreeting(firstName + " " + lastName);
    }
    
    private String CreateGreeting(String toBeGreeted) {
		return "Greeting " + toBeGreeted + ", welcome to coding dojo";
	}
	
    
    public static void TestGreeting(String name) {
		System.out.println("Testing greeting " + name);
	}
}
