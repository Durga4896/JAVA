package CollectionsFramework.CollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
        "baby","ball","soap","baby","shampoo",
            "chalk","soap","makeup","baby","lotion"
        );

        List<String> checked = new ArrayList<>();

        for(String item : list){
            if(!checked.contains(item)){
                int count = Collections.frequency(list, item);

                if(count > 1){
                    System.out.println(item + "-" + count);
                }
                checked.add(item);
            }

        }
    }
}