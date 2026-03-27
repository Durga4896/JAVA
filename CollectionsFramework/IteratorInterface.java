package CollectionsFramework;

import java.util.*;

class IteratorInterface{
    public static void main (String[] args) {
        //Iterator --> interface
        //Introduced for Iteratoring all the  collection objects
        //legacy classes -- v1.0 + New Classes - v1.2
        // One direction, read-only with special permission for removing
        
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(5);
        // al.add(90);
        // al.add(80);
        
        // Iterator<Integer> i = al.iterator();
        // //i.hasNext();
        // //i.next();
        // System.out.println(al);
        // while(i.hasNext()){
        //     i.next();
        //     i.remove();
        // }
        // System.out.println(al);
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",500);
        hm.put("Sri Lanka", 600);
        hm.put("London", 1000);
        
        hm.keySet().iterator();
        hm.values().iterator();
        hm.entrySet().iterator();

        System.out.println(hm);
    }
}
