package POJOandBean;
//POJO class doesn't contain main method
public class Employee {
    private int id;
    public String name;
    protected double salary;


    public Employee(){
        System.out.println("No arguments constructor is optional in POJO class");
    }

    public Employee(int id){
        this.id =id;
    }

    //Setter 
    public int SetID(int id){
        this.id = id;
        return id;
    }

    //Getter -- get method shouldn't be private
    public int GetId(){
        return id;
    }
}
