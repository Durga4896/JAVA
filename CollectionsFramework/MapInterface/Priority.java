package CollectionsFramework.MapInterface;

import java.util.PriorityQueue;
import java.util.Comparator;
public class Priority
{
	public static void main(String[] args) {
	    //creation
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(3);
		pq.add(9);
		pq.add(4);
		pq.add(1);
		pq.add(2);
		pq.add(8);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.contains(5));
		
		System.out.println(pq);
		while(!pq.isEmpty()){
		    System.out.println(pq.poll());
		}
		
		System.out.println(pq);
	}
}