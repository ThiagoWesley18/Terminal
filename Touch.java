import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Touch {

    public static void setTouch(File dirAtual, String arq) {

        // Cria um caminho para o arquivo.
        File dir = new File(dirAtual.getPath() + "/" + arq);

        // Verifica se o arquivo ja existe no diretório.
        if(!dir.exists()){
            try {
                // Cria o arquivo neste no diretório criado.
                dir.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Erro: Arquivo ja Existe.");
        }

    }

}
