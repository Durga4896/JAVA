package CollectionsFramework;

import java.util.*;

class ListIteratorPractice{
    public static void main (String[] args) {
        //ListIterator --> interface
        //Introduced for Iteratoring all the list type of collection objects
        //legacy classes -- v1.0 + New Classes - v1.2
        // Bi Direction, Read and Write
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(60);
        al.add(70);
        
        ListIterator<Integer> li = al.listIterator();
        
        
        while(li.hasNext()){
            System.out.println(li.next());
        }
        li.add(8);
        System.out.println();
        
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        li.remove();
        
        System.out.println(al);
    }
}
