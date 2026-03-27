package CollectionsFramework.SetInterface;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        //Hashset -> HashMap -> Array of nodes(key, value)
        HashSet<Integer> hs = new HashSet<>();
        hs.add(9);
        hs.add(5);
        hs.add(4);
        hs.add(25);
        hs.add(7);
        hs.add(2);
        hs.add(98);
        
        // System.out.println(hs.remove(25));
        // System.out.println(hs.contains(9));
        for(Integer element : hs)
        {
            System.out.println(element);
        }
        System.out.println(hs);
        
       
	}
}
