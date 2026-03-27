package CollectionsFramework.CollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;;

public class ArraylistTask {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        al.addLast(6);
        System.out.println(al);
        System.out.println(al.size());

        al.set(0, 0);
        System.out.println(al);

        // for(int i=0;i<al.size();i++){
        //     System.out.print(al.get(i));
        // }

        for(Integer integer : al){
            System.out.print(integer);
        }
        Collections.synchronizedList(al);
    }
}
