package CollectionsFramework.CollectionInterface;
import java.util.ArrayList;
// import java.util.Deque;
import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
public class LinkedlistTask {
    public static void main(String[] args) {
        
        // List<String> lst = new LinkedList<>();
        // Deque<String> deque = new LinkedList<>();
        // Queue<String> queue = new LinkedList<>();
        ArrayList<String> al = new ArrayList<>();
        al.add("S1");
        al.add("S2");
        al.add("S3");

        LinkedList<String> list = new LinkedList<>();
        list.add("H");
        list.add("E");
        list.add("Y");
        list.add(0,"Hello");
        list.addAll(al);
        System.out.println(list);
        }
}
