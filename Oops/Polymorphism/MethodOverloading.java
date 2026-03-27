package Polymorphism;

public class MethodOverloading {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public void add(double a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethodOverloading ctp = new MethodOverloading();
        ctp.add(1, 2);
        ctp.add(1, 2, 3);
        ctp.add(63.4893, 8);
    }
}
