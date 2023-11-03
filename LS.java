import java.io.File;

public class LS {

    public static void setLs(File dir){
        String[] ls = dir.list();
        for (String i: ls) {
            System.out.println(i);
        }
    }
}
