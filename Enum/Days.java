package Enum;

public class Days {
    public static void main(String[] args) {
        enum days { 
            SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
            int index;

            days(){
               
            }
            days(int index){
                this.index = index;
            }


        }
        days day = days.MONDAY; //input

        //using if-else statement to check if it's a weekday or weekend
        // if(day == days.MONDAY ||
        //       day == days.TUESDAY ||
        //       day == days.WEDNESDAY ||
        //       day == days.THURSDAY ||
        //       day == days.FRIDAY) {
        //     System.out.println("It's a weekday.");
        // } else {
        //     System.out.println("It's a weekend.");
        // }

        // //using switch statement to check if it's a weekday or weekend
        // switch(day) {
        //     case SUNDAY, SATURDAY:
        //         System.out.println("It's a weekend.");
        //         break;
        //     case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
        //         System.out.println("It's a weekday.");
        //         break;
        // }
    }
}
