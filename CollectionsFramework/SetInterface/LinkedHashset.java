package CollectionsFramework.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashset {
    //Hashset -> HashMap -> Array of nodes(key, value)
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(9);
        lhs.add(5);
        lhs.add(4);
        lhs.add(25);
        lhs.add(7);
        lhs.add(2);
        lhs.add(98);
        
        System.out.println(lhs.remove(25));
        System.out.println(lhs.contains(9));
        for(Integer element : lhs)
        {
            System.out.println(element);
        }
        System.out.println(lhs);
	}
}