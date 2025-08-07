package Mustahkamlash;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        HashMap<Integer ,String> map = new HashMap<>();
        map.put(1,"salom");
        map.put(2,"salom");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }
}
