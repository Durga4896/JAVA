package CollectionsFramework.CollectionInterface;

import java.util.ArrayList;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(9);
        list.add(8);
        list.add(10);
        System.out.println(list);

        int sum = 0;
        int n = list.size();
        for(Integer arr : list){
            sum += arr;
        }
        System.out.println("Sum of all elements in the list: " + sum);
        System.out.println("Average of all elements in the list: " + (sum/n));
    }
}
