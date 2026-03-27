package Objects;

public class Anonymous {
    String name = " Durga Sai Prasad !";

    public void greet(){
        System.out.printf("Hello"+name);
    }
    public static void main(String[] dspy){

        //objects stored in heap memory.
        new Anonymous().greet(); //Anonymous object--use when we need only single operation

        //Or we use to call more than one function
        // Anonymous n = new Anonymous();
        // n.greet();
    }
}
