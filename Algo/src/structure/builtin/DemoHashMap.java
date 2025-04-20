package structure.builtin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        int t;
        boolean b;

        hm.put("chips", 13);
        hm.put("coke", 15);

        System.out.println(hm); //{chips=13, coke=15}

        t = hm.put("chips", 3);
        System.out.println(t); // 13
        System.out.println(hm); // {chips=3, coke=15}
        
        t = hm.size();
        System.out.println(t); // 2

        
        b = hm.containsKey("chocolate"); // false
        System.out.println(b);
        
        if (!b)
        hm.put("chocolate", 4);
        b = hm.containsKey("chocolate");
        System.out.println(b); // true
        
        b = hm.containsValue((Integer) 15); // true
        System.out.println(b);

        // traversal
        Set<Map.Entry<String, Integer>> e = hm.entrySet();
        System.out.println(e); // [chips=13, coke=15]
        for (Entry<String, Integer> entry : hm.entrySet()) 
            System.out.println(entry.getKey() + " " + entry.getValue());

        Set<String> s = hm.keySet();
        System.out.println(s);
        for (String key : hm.keySet()) {
            System.out.println(key + " --> " + hm.get(key));
        }

        hm.remove("chocolate");
        System.out.println(hm);

        hm.clear();
        System.out.println(hm.isEmpty());
    }
}