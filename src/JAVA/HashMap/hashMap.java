package JAVA.HashMap;

import java.util.HashMap;

public class hashMap {
    static void main() {
        HashMap<Integer,String>days =new HashMap<>();
        days.put(1,"Sunday");
        days.put(2,"Monday");
        days.put(3,"Tuesday");
        days.put(4,"Wednesday");
        days.put(5,"Thursday");
        days.put(6,"Friday");
        days.put(7,"Saturday");
        System.out.println(days);
        System.out.println("Size of HashMap: "+days.size());

        System.out.print("Keys: ");
        for(int key:days.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        System.out.print("Values: ");
        for(String value:days.values()){
            System.out.print(value+" ");
        }
    }
}
