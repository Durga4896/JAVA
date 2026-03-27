package POJOandBean;

public class Main {
    public static void main(String[] args) {
        Employee  e1 = new Employee();
        e1.SetID(101);
        e1.name = "Durga Sai Prasad Y";
        e1.salary = 1000000.999;

        Employee e2 = new Employee();
        e2.SetID(101);
        e2.name = "Durga Sai Prasad Y";
        e2.salary = 1000000.999;

        Employee e3 = new Employee();
        e3.SetID(101);
        e3.name = "Durga Sai Prasad Y";
        e3.salary = 1000000.999;

        Employee e4 = new Employee();
        e4.SetID(101);
        e4.name = "Durga Sai Prasad Y";
        e4.salary = 1000000.999;

        Employee e5 = new Employee();
        e5.SetID(101);
        e5.name = "Durga Sai Prasad Y";
        e5.salary = 1000000.999;

        Employee[] details = new Employee[] {e1,e2,e3,e4};
        
        for(Employee e : details){
            System.out.println(e1.salary+e2.salary+e3.salary);
        }
        // System.out.println(e1.GetId());
        // System.out.println(e1.name);
        // System.out.println(e1.salary);
    }
}
