package CollectionsFramework.CollectionInterface;

import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(0);
        list.add(8);
        list.add(10);
        System.out.println(list);
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            int nums = list.get(i);
            if(nums % 2 == 0){
                sum+=nums;
            }
        }
        System.out.println(sum);
    }
}
