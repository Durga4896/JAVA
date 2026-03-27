package CollectionsFramework.MapInterface;

import java.util.Map;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collection;


public class MapPractice {
    public static void main(String[] args){
        //Creation of a map
        Map<Integer,String> map = new Hashtable<>();

        //Adding elements to the map
        map.put(101,"Hi");
        map.put(102,"Hello");
        map.put(103,"Bye");

        //Retrieving keys from the map
        Set<Integer> keys = map.keySet();
        //Iterating through the keys
        for(Integer key : keys){
            System.out.println("Key: " + key);
        }
        System.out.println();

        //Retrieving values from the map
        Collection<String> values = map.values();
        //Iterating through the values
        for(String value : values){
            System.out.println("Value: " + value);
        }
        System.out.println();

        //retrirving values from map using keys
        System.out.println(map.get(101));

        //retriving both keys and values from map
        for(Integer key : keys){
            System.out.println( key + " >>>>> " + map.get(key));
        }
        System.out.println();

        System.out.println(map);

        //deleting element from the map
        map.remove(101);
        System.out.println(map);

        //verification of keys and values
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("Hello"));

        //updating elements
        map.put(103, "Hey");
        System.out.println(map);


        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
    }
}
}
