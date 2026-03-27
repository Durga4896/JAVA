package CollectionsFramework.CollectionInterface;
import java.util.ArrayList;
import java.util.List;
public class Problem3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(8);
        list.add(5);
        list.add(10);
        System.out.println(list);
        int mid = list.size() / 2;

        List<Integer> firstHalf = list.subList(0, mid);
        List<Integer> secondHalf = list.subList(mid, list.size());
        
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);
    }
}
