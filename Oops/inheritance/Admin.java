package inheritance;

public class Admin extends Developer {
    public void modify(){
        super.read();
        super.write();
        System.out.println("Manage everything......");
    }
    public static void main(String[] args){
        // Guest guest = new Guest();
        // guest.read();

        // Developer developer = new Developer();
        // developer.read();
        // developer.write();

        Admin admin = new Admin();
        // admin.read();
        // admin.write();
        admin.modify();
        // Admin man = new Admin();
        // man.modify();
    }
}
