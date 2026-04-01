package LamdaExpressions;

public class ClassLE1 {
    public static void main(String[] args){
        Car c = new Audi();
        c.getspeed();

        Car c1 = new Car() {
            public int getspeed(){
                System.out.println("BMW is driving ");
                return 100;
            }
        };
        System.out.println(c1.getspeed());


        //Lambda expression with anonymous function
        //3 components: arguments list, arrow token, function body
        Car c3 = () -> 130;
        System.out.println(c3.getspeed());

        Car c2 =  () ->{
                int speed = 150;
                System.out.println("Mercedes is driving ");
                if(speed > 100){
                    System.out.println("Speed is too high");
                } else{
                    System.out.println("Speed is normal ");
                }
                return speed;
        };
        System.out.println(c2.getspeed());
    }
}

    class Audi implements Car {
        @Override
        public int getspeed() {
            System.out.println("Audi speed is 120");
            return 120;
        }
    }

@FunctionalInterface
interface Car{
     public int getspeed();
}