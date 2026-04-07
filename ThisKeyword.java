import java.util.Arrays;
public class ThisKeyword {
    int age;
    String name;
    String jobRole;


    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword();
        t.setAge(25)
         .setname("Dhruva")
         .setjobRole("Developer");
        System.out.println(Arrays.toString(t.getClass().getDeclaredMethods()));
    }

    public int setAge(){
        return age;
    }
    public ThisKeyword setAge(int age){
        this.age = age;
        return this;
    }
    public String getname(){
        return name;
    }
    public ThisKeyword setname(String name){
        this.name = name;
        return this;
    }
    public String getjobRole(){
        return jobRole;
    }
    public ThisKeyword setjobRole(String jobRole){
        this.jobRole = jobRole;
        return this;
    }

}