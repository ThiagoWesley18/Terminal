import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Exec {
    public static void setExec(File dirAtual,String perm, String arq) {
        boolean permissao = Boolean.parseBoolean(perm);

        // Cria um caminho para o arquivo.
        File dir = new File(dirAtual.getPath() + "/" + arq);

        // Verifica se o arquivo esta presente no diretório.
        if(dir.exists()){
            if(dir.isFile()){
                // muda a permissão de execução do arquivo.
                dir.setExecutable(permissao);
            }else{
                System.out.println("Erro: É um Diretorio.");
            }
        }else{
            System.out.println("Erro: Arquivo nao Existe.");
        }

    }

}
