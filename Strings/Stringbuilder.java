package Strings;

public class Stringbuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Durga");
        StringBuilder sb1 = new StringBuilder("Durga");

        sb.insert(0,"Sai");
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        System.out.println(sb1.compareTo(sb)); // 0 if both are same, +ve if sb1 is greater than sb, -ve if sb1 is less than sb

    }
}
