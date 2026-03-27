package Polymorphism;

public class MethodOverriding extends MethodOverloading {
     public void sum(int a, int b){
        System.out.println(a+b);
     }
     @Override
      public void add(double a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethodOverriding rtp = new MethodOverriding();
        rtp.add(6456.6789, 7);
    }
}
