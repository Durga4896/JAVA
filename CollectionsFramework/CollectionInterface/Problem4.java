package CollectionsFramework.CollectionInterface;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        System.out.println(list2);

        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);
    }
}
