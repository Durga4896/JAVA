package Strings;

public class stringstest {
    public static void main(String[] args){
        //Strings are immutable in java
        // StringBuffer and StringBuilder are mutable in java
        
        StringBuffer sb1 = new StringBuffer("Durga");
        StringBuffer sb2 = new StringBuffer("Durga");
        System.out.println(sb1 == sb2); // false

        sb1 = sb1.append("Sai");
        System.out.println(sb1 == sb2); // true

         StringBuffer sb3 = new StringBuffer("DurgaSai");
        System.out.println(sb1 == sb3); // false

        System.out.println("********************");
        String s1 = "Durga";
        String s2 = "Durga";
        System.out.println(s1 == s2);

        // s1 = s1 + "Sai"; //DurgaSai
        // System.out.println(s1 == s2); // false   
        
        // String s3 = "DurgaSai";
        // System.out.println(s1 == s3); // false
        
        
    }
}
