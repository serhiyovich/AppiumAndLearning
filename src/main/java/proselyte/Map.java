package proselyte;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map {
    public static void main(String[] args) {


        java.util.Map<String,String> map=new LinkedHashMap<>();
        String []strings = {"sdcdc","d"};
        String a =strings[0];
        a.intern();
        System.out.println(a.intern());
        map.put(strings[0].valueOf(strings[0].charAt(0)),strings[0].valueOf(strings[0].charAt(strings[0].length()-1)));
        a.intern();
        map.put("d","sddsd");
        map.get("d").length();

    }
}
