import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class RM {
    public static void setRm(File dirAtual, String pasta) {

        // Cria um caminho para o objeto.
        File dir = new File(dirAtual.getPath() + "/" + pasta);

        // Verifica se o arquivo ou a pasta vazia está presente no diretório.
        if(dir.exists()){
            // Deleta o objeto.
            dir.delete();
        }else{
            System.out.println("Erro: Pasta ou Arquivo nao Existe.");
        }
    }
}
