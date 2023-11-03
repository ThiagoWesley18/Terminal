import java.io.File;

public class Rename {
    public static void setRn(File dirAtual, String path1, String path2) {
        File pathDestino = new File(dirAtual.getPath() + "/" +path2);
        dirAtual = new File(dirAtual.getPath() + "/" +path1);

        if(dirAtual.exists()){
            if(dirAtual.isFile()){
                    dirAtual.renameTo(pathDestino);
            }else{
                System.out.println("Erro: Nao é um arquivos.");
            }
        }else{
            System.out.println("Erro: Arquivo nao existe.");
        }
    }
}
