import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LS {

    public static void setLs(File dir){
        String[] ls = dir.list();
        for (String i: ls) {
            System.out.println(i);
        }
    }

    public static void setLs(File dir, BufferedWriter bwPipe) throws IOException {
        String[] ls = dir.list();
        for (String i: ls) {
            bwPipe.write(i + "\n");
            System.out.println(i);
        }
        bwPipe.close();
    }
}
