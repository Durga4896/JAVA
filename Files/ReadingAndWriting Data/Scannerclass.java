import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Scannerclass {
    public static void main(String[] args) throws IOException {
        
        File file = new File("./sample.txt");
        if(! file.exists())
            file.createNewFile();
        System.out.println(file.exists());

        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        fis.close();
        scanner.close();
    }
}    
