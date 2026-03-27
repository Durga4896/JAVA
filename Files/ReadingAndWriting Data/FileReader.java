import java.io.File;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException{
        File file = new File("./Java.txt");
        if(! file.exists()){
            file.createNewFile();
        System.out.println(file.exists());

        FileReader fr = new FileReader();
        int asciicode;
        String s = new String();
        try{
            while((asciicode = fr.read()) != -1){
            s += String.valueOf((char)asciicode);
            System.out.print((char)asciicode);
           }
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
        finally{
            System.out.println("Finally");
        }
        // System.out.println();
        System.out.println(s);
        }
    }

    private int read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
    
}
