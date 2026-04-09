public class SwitchExpression {
    public static void main(String[] args){
        int num = 21;
        String result = switch(Integer.compare(num, 0)){
            case 0 ->"Zero";
            case -1 -> "Negative";
            case 1 -> {
                if(num % 2 == 0){
                    yield "Even";
                } else {
                    yield "Odd";
                }
            }
            default -> "Unknown";
        };
        System.out.printf("The Given number %d is %s\n", num, result);


        String day = "Mon";
        switch(day){
            case "Mon", "Tue", "Wed", "Thu", "Fri" -> System.out.println("Weekday");
            case "Sat", "Sun" -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
