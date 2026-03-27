package Files;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] dspy) throws IOException {
        File f = new File("/Users/durgasaiprasadyalamkayala/Desktop/VS Code");

        // System.out.println(f.mkdir());
        //if (f.exists())
            // System.out.println(f.delete());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());

        // System.out.println(f.delete());
        // System.out.println(f.createNewFile());
        // System.out.println(f.exists());

        // System.out.println(f.isHidden());
        // System.out.println(f.canRead());
        // System.out.println(f.canWrite());
        // System.out.println(f.setReadOnly());

        //System.out.println(f.exists());

    }
}