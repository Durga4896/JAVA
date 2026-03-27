import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader {
    private static InputStream fis;

    public BufferedReader(FileReader fileReader) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) throws Throwable {

        File file = new File("./sample.txt");

        if(file.exists())
            file.createNewFile();
        System.out.println(file.exists());

        FileReader fr = new FileReader("file");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = new String();
        while(line = readLine() != null){
            System.out.println(line);
        }
        
    }

    private Object readLine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readLine'");
    }
}
