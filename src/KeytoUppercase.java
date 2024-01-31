import java.util.HashMap;
import java.util.Map;

public class KeytoUppercase {
    public static void main(String[] args) {
        System.out.println("Hello World");
// 		String[] arr = {jack:"Three", jill: "Two",And:"one"};
        Map<String,String> input = new HashMap<>();
        input.put("jack","Three");
        input.put("jill","Two");
        input.put("And", "one");
        System.out.println(input);

        // Convert keys to uppercase
        Map<String, String> uppercasedata = new HashMap<>();
        for(Map.Entry<String, String> entryinput : input.entrySet()){
                uppercasedata.put(entryinput.getKey().toUpperCase(), entryinput.getValue());
        }
        System.out.println(uppercasedata);
        //
    }
}
