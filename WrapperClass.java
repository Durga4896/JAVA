import java.util.ArrayList;
public class WrapperClass {
    public static void main(String[] args){
        int i = 10;

        /*
         * Wrapper classes provide a way to use primitive data types as objects.
         * Each primitive data type has a corresponding wrapper class.
         * For example, int has a wrapper class Integer, double has a wrapper class Double, etc.
            * Wrapper classes are useful when you need to use primitive data types in contexts that require objects, such as collections (e.g., ArrayList).
            * Wrapper classes also provide utility methods for converting between types, parsing strings, and more.
            * Autoboxing is the automatic conversion of a primitive type to its corresponding wrapper class. For example, when you assign an int to an Integer, Java automatically converts it.
            * Unboxing is the automatic conversion of a wrapper class to its corresponding primitive type. 
         */   
        
        /*
            byte = Byte
            short = Short
            int = Integer
            long = Long
            float = Float
            double = Double
            char = Character
            boolean = Boolean
        */

            WrapperClass wrapper = new WrapperClass();
            //Integer i0 = i; //autoboxing (automatically converting int to Integer)

            //Integer i1 = new Integer(i); //boxing (explicitly converting int to Integer)
            Integer i2 = Integer.valueOf(i);
            System.out.println(i2);

            Integer i3 = Integer.valueOf(55);
            int i4 = i3.intValue(); //unboxing (automatically converting Integer to int)
            System.out.println(i4);
            int i5 = i3; // Auto-unboxing (automatically converting Integer to int)
            System.out.println(i5);


            ArrayList<Integer> list = new ArrayList<>();
            list.add(10); // Auto-boxing (automatically converting int to Integer)
            list.add(20);
            list.add(30);
            list.add(Integer.valueOf(55)); // Explicitly adding an Integer object to the list
            System.out.println(list);

            String s = "123";
            Integer age = Integer.valueOf(s); //converting String to int using Integer wrapper class -- Integer object is returned
            int age2 = Integer.parseInt(s); //converting String to int using parseInt method -- primitive int is returned
            System.out.println(age);
            System.out.println(age2);

            Long age1 = Long.valueOf(s);
            System.out.println(age1);

    }
}
