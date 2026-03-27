package ExceptionHandling;
public class Exception{
    public static void main(String[] args){

        int num1 = 6;
        int num2 = 0;

        try{
            System.out.println(num1/num2);
        }
        catch(ArithmeticException ae){
            ae.getMessage();
            // throw ae;
        }
        finally{
            System.out.println("Exception Handled");
        }

        System.out.println("Congrats! you have completed Exception Handling part 1");

    }
}