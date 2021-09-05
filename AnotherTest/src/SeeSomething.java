import java.util.HashMap;
import java.util.Set;
public class SeeSomething {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, String> userMap = new HashMap<String, String>();
//		
//		userMap.put("nninja@codingdojo.com", "Nancy Ninja");
//		userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
//		
//		String name = userMap.get("nninja@codingdojo.com");
		
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }

	}

}
