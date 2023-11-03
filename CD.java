import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class CD {
    public static File setCd(File dirAtual, String pasta){
        // Se nao cair em nenhum caso retorna o diretorio atual e nao faz nada.
        File dir = dirAtual;

        //lista os arquivos e as pastas do diretorio e coloca no Array.
        ArrayList<String> pastas = new ArrayList<String>(Arrays.asList(dirAtual.list()));

        // Verifica se o arquivo esta presente no diretório.
        if(pastas.contains(pasta)){
            // Verifica o caminho da pasta.
            dir = new File(dirAtual.getPath() + "/" + pasta);
            // Verifica se o caminho passado é um diretório.
            if(!dir.isDirectory()) {
                dir = dirAtual;
                System.out.println("Erro: Caminho passado nao é um diretório.");
            }
        // Caso de retorno para a pasta pai.
        }else if(pasta.trim().equals("../")) {
            dir = dirAtual.getParentFile();
        // caso nao tenha argumentos retorna para o diretório principal.
        }else if(pasta.trim().equals("")) {
            dir = new File("./");
        }else{
            System.out.println("Erro: Diretorio nao Existe.");
        }
        return dir;
    }
}
