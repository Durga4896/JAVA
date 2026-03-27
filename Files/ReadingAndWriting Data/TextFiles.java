import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFiles{
    public static void main(String[] args) throws IOException {
       File file = new File("./sample.txt");
        if(file.exists())
            file.createNewFile();
        System.out.println(file.exists());

        //---FileInputStream---:
        FileInputStream fis = new FileInputStream(file);
        int asciicode;
        String str = new String();
        while((asciicode = fis.read()) != -1){
            str += String.valueOf((char)asciicode);
            System.out.print((char)asciicode);
        }
        // System.out.println();
        // System.out.println(str);

        fis.close();
        }      
}