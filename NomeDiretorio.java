import java.io.File;
public class NomeDiretorio {
    public static String getNome(File dir){
        char[] strDir = dir.getPath().toCharArray();
        strDir[0] = '~';
        return new String(strDir);
    }
}
