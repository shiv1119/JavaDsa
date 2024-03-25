import java.util.*;
import java.lang.*;

public class HashingFinal {
    public static void main(String[] args){
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
        hm.put(1, "Geeks");
        hm.put(12, "forGeeks");
        hm.put(15, "A computer");
        hm.put(3, "Portal");

        System.out.println(hm);

        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "Shiv Nandan");
        lhm.put("two", "Kahish Kasaudhan");
        lhm.put("ten", "Shreya Pandey");
        System.out.println(lhm);
        System.out.println(lhm.get("ten"));

    }
}
