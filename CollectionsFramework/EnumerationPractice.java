package CollectionsFramework;

import java.util.*;

public class EnumerationPractice
{
	public static void main(String[] args) {
    //Enumuration --> interface
    //Introduced for iterting the legacy collection objects
    //legacy classes -- v1.2
    // HashTable, Stack, Vector, Dictionary and Properties
    
    // Stack<String> s = new Stack<>();
    // s.add("Banana");
    // s.add("Cherry");
    // s.add("Mango");
    
    // Enumeration<String> e = s.elements();
    
    // //e.hasMoreElements()
    // //e.nextElement
    // while(e.hasMoreElements()){
    //     System.out.println(e.nextElement());
    // }
    
    // Vector<String> v = new Vector<>();
    // v.add("Banana");
    // v.add("Cherry");
    // v.add("Mango");
    
    // //Enumeration<String> e = v.elements();
    
    // //e.hasMoreElements()
    // //e.nextElement
    // while(e.hasMoreElements()){
    //     System.out.println(e.nextElement());
    // }
    
    // HashTable
    // Hashtable<String, Integer> ages = new Hashtable<>();
    // ages.put("India",500);
    // ages.put("Sri Lanka", 600);
    // ages.put("London", 1000);
    
    // Enumeration<Integer> e = ages.elements();
    // while(e.hasMoreElements()){
    //     System.out.println(e.nextElement());
    // }
    
    
    Properties prop = new Properties();
    prop.setProperty("url", "localhost");
    prop.setProperty("username", "admin");
    
    Enumeration<Object> e = prop.elements();
    
    while(e.hasMoreElements()){
        System.out.println(e.nextElement());
    }
    
    prop.elements().asIterator();
    
	}
}