package GarbageCollection;

public class GCPractice {
    public void finalize(){
            System.out.println("Finalize method");
        }
    public static void main(String[] args){
        GCPractice gcp1 = new GCPractice();
        GCPractice gcp2 = new GCPractice();
        GCPractice gcp3 = new GCPractice();

        new GCPractice();

        gcp1 = null;
        gcp2 = gcp3;
        
        System.gc();
    }
}
