import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileOpStream {
    public static void main(String[] args) throws Throwable {
        File file = new File("./sample.txt");
        if(! file.exists()){
            file.createNewFile();
        System.out.println(file.exists());

            FileOutputStream fos  = new FileOutputStream(file);
            System.out.println(fos.write(65));
            System.out.println(fos.flush()); 
            fos.close();
    }
}
}