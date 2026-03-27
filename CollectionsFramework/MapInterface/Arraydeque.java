package CollectionsFramework.MapInterface;

import java.util.ArrayDeque;
public class Arraydeque{
    public static void main (String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.add("Apple");
        ad.addFirst("Grapes");
        ad.addLast("Pear");
        ad.offerFirst("Orange");
        ad.offerLast("Mango");
        ad.offer("Guava");
        
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
    }
}
