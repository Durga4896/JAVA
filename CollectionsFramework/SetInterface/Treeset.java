package CollectionsFramework.SetInterface;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        //Hashset -> HashMap -> Array of nodes(key, value)
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(9);
        ts.add(5);
        ts.add(4);
        ts.add(25);
        ts.add(7);
        ts.add(2);
        ts.add(98);
        
        // System.out.println(hs.remove(25));
        // System.out.println(hs.contains(9));
        for(Integer element : ts)
        {
            System.out.println(element);
        }
        System.out.println(ts);
        
        System.out.println(ts.last());
        System.out.println(ts.first());
        System.out.println(ts.pollFirst());
        System.out.println(ts.subSet(5,9).remove(7));
        System.out.println(ts);
	}
}
