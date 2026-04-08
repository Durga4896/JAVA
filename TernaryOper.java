public class TernaryOper {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        int max;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println(max);

        //String max = (a>b) ? "a is greater" : "b is greater";
        System.out.println((a>b) ? "a is greater" : "b is greater");

        int num = 5;
        System.out.println((num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero");
    }
}
