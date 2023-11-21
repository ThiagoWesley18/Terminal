import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TerminalMain {
    public static void main(String[] args) {

        File dirAtual = new File("./"); //caminho relativo(abstrato);
        File log = new File("./log.txt");
        try {
            log.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(log.getPath()));
            bw.write("<-----Arquivo de log----->\n\n");


            Scanner scan = new Scanner(System.in);
            String nomeDir;
            String comando;
            String comandoScan;
            String[] str;

            System.out.println("Digite \"help\" para listar os comandos");
            while (true){
                nomeDir = NomeDiretorio.getNome(dirAtual);
                System.out.print("user@Local:" + nomeDir + "$");
                comandoScan = scan.nextLine();
                str = comandoScan.split(" ");
                comando = str[0];
                str[0] = "";


                    switch (comando) {
                        case "ls":
                            bw.write("ls - dir.list().\n");
                            LS.setLs(dirAtual);
                            break;
                        case "cd":
                            bw.write("cd - new File(dirAtual.getPath() + \"/\" + pasta).\n");
                            dirAtual = CD.setCd(dirAtual, String.join("", str));
                            break;
                        case "mkdir":
                            bw.write("mkdir - dir.mkdir().\n");
                            MKDIR.setMkdir(dirAtual, String.join("", str).trim());
                            break;
                        case "rm":
                            bw.write("rm - dir.delete().\n");
                            RM.setRm(dirAtual, String.join("", str));
                            break;
                        case "pwd":
                            bw.write("pwd - NomeDiretorio.getNome(dirAtual).\n");
                            System.out.println(NomeDiretorio.getNome(dirAtual));
                            break;
                        case "echo":
                            bw.write("echo - System.out.println(String.join(\" \",str).trim()).\n");
                            System.out.println(String.join(" ", str).trim());
                            break;
                        case "touch":
                            bw.write("touch - dir.createNewFile().\n");
                            Touch.setTouch(dirAtual, String.join("", str).trim());
                            break;
                        case "exec":
                            bw.write("exec - dir.setExecutable(permissao).\n");
                            Exec.setExec(dirAtual, str[1], str[2]);
                            break;
                        case "rename":
                            bw.write("rename - dirAtual.renameTo(pathDestino).\n");
                            Rename.setRn(dirAtual, str[1], str[2]);
                            break;
                        case "exit":
                            bw.write("exit - System.exit(0).\n");
                            bw.close();
                            Scanner scanner = new Scanner(new FileReader("./log.txt")).useDelimiter("\\n");
                            while (scanner.hasNext()) {
                                System.out.println(scanner.next());
                            }
                            System.exit(0);
                            break;
                        case "help":
                            System.out.println("<-----Comandos----->\n");
                            System.out.println("ls - lista diretório atual.");
                            System.out.println("--------------------------");
                            System.out.println("cd [parametro]- entra no diretório.");
                            System.out.println("     parametro - nome do diretório");
                            System.out.println("     parametro - ../ retorna para o diretório pai");
                            System.out.println("     parametro - vazio retorna para o diretório principal");
                            System.out.println("--------------------------");
                            System.out.println("mkdir - cria uma pasta no diretório atual.");
                            System.out.println("--------------------------");
                            System.out.println("rm - deleta uma pasta, caso esteja vazia, ou um arquivo.");
                            System.out.println("--------------------------");
                            System.out.println("pwd - mostra o caminho do diretório atual.");
                            System.out.println("--------------------------");
                            System.out.println("echo [parametro] - retorna uma mensagem no console.");
                            System.out.println("     parametro - mensagem a ser escrita.");
                            System.out.println("--------------------------");
                            System.out.println("touch - cria um arquivo no diretório atual, caso nao exista.");
                            System.out.println("--------------------------");
                            System.out.println("exec [opção] [parametro]  - modifica a permissão de um arquivo, no diretório atual, para ser ou não executável.");
                            System.out.println("     parametro - nome do arquivo");
                            System.out.println("     opção: ");
                            System.out.println("        true  - torna o arquivo executável.");
                            System.out.println("        false - tira a permissão do arquivo de ser executável.");
                            System.out.println("--------------------------");
                            System.out.println("rename - renomeia uma arquivo no diretório atual, caso exista.");
                            System.out.println("--------------------------");
                            System.out.println("exit - encerra o terminal.");
                            System.out.println("--------------------------");
                            break;
                        default:
                            System.out.println("Comando Inválido.");
                            bw.write("Comando Inválido.\n");
                            break;
                    }

                }

        } catch (IOException e) {
            System.out.println("Erro na criação do arquivo de log.");
        }
    }
}