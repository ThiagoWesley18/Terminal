import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class MV {


    public static void setMv(File dirAtual, String path1, String path2) {
        try {
            File pathDestino = new File(path2);
            dirAtual = new File(dirAtual.getPath() + "/" + path1);

            Path arquivoOrigem = Paths.get(path1);
            Path arquivoDestino = Paths.get(path2);

            if (dirAtual.exists()) {
                if (dirAtual.isFile()) {
                    Files.copy(arquivoOrigem, arquivoDestino, StandardCopyOption.REPLACE_EXISTING);
                } else {
                    System.out.println("Erro: Nao é um arquivos.");
                }
            } else {
                System.out.println("Erro: Arquivo nao existe.");
            }
        }catch (IOException e){}
    }
}
