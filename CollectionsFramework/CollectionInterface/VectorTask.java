package CollectionsFramework.CollectionInterface;
import java.util.Arrays;
import java.util.Vector;

public class VectorTask {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Sai");
        v.add("Prasad");
        v.add(0,"Durga");
        v.add("Hello");
        v.add("!");
        System.out.println(v);

        Vector<String> v1 = new Vector<>();
        v1.add("How");
        v1.add("are");
        v1.add("you");
        v1.add("Durga");

        System.out.println(v1);

        v.addAll(5,v1);
        System.out.println(v);

        System.out.println(v1.get(2));
        System.out.println(v.get(7));

        System.out.println(v.remove(5));
        System.out.println(v);

        //v.removeAll(v1);
        System.out.println(v);

        System.out.println(v.contains(v1));
        System.out.println(v1.containsAll(v));

        v.set(3, "Yalamkayala");
        System.out.println(v.get(3));
        System.out.println(v.indexOf("Durga"));
        System.out.println(v.lastIndexOf("Durga"));
        System.out.println(v);

        System.out.println(v.size());
        System.out.println(v.capacity());

        v.clear();
        System.out.println(v);

        Object[] arr = new Object[]{1,2,3,4,5};
        Vector ve = new Vector<>(Arrays.asList(arr));
        System.out.println(ve);
    }
}
