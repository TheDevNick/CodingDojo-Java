import java.util.HashMap;
import java.util.Set;
public class Hashmatique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("title1", "song lyrics to title 1");
		trackList.put("title2", "song lyrics to title 2");
		trackList.put("title3", "song lyrics to title 3");
		trackList.put("title4", "song lyrics to title 4");
		
		System.out.println(trackList.get("title1"));
		
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key +": " + trackList.get(key) );
        }
	}

}
