import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
public class MKDIR {
    public static void setMkdir(File dirAtual, String pasta) {

        // Cria um caminho para a pasta.
        File dir = new File(dirAtual.getPath() + "/" + pasta);

        // Verifica se a pasta esta presente no diretório.
        if(dir.exists()){
            System.out.println("Erro: Pasta ja Existe.");
        }else{
            // Cria a pasta.
            dir.mkdir();
        }

    }
}
