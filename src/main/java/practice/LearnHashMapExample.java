
package practice;


import java.util.HashMap;
import java.util.Map;


public class LearnHashMapExample {
    HashMap<String,String> hmap = new HashMap<>();


    public  void AddHashMapValue() {
        hmap.put("IE", "Internet Explorer");
        hmap.put("CHROME", "Chrome Browser");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("SB", "Macbook Browser");
        hmap.put("Opera", "Linux Browser");

        //System.out.println("Browser name of MM: " + hmap.get("MM"));

        for(Map.Entry me: hmap.entrySet()){
            System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
        }
        System.out.println();
        System.out.println("Size of the map: " + hmap.size());

        System.out.println();
        System.out.println("Content of the map: " + hmap);


        System.out.println();
        if(hmap.containsKey("MM")){
            String val = hmap.get("SB");
            System.out.println("Value of SB: " + val);
        }


    }

    public static void main(String[] args) {
        LearnHashMapExample hme = new LearnHashMapExample();
        hme.AddHashMapValue();
    }
}

