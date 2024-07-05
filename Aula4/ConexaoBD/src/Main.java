import java.sql.*;

public class Main {
    private Connection connection;

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        boolean executar = true;
        while (executar) {
            cadastro.imprimirMenu();
            String opcao = cadastro.scanner.nextLine();
            switch (opcao) {
                case "1":
                    cadastro.inserirNome();
                    break;
                case "2":
                    cadastro.criarSenhaManual();
                    break;
                case "3":
                    cadastro.criarSenhaAutomatica();
                    break;
                case "4":
                    cadastro.editarNome();
                    break;
                case "5":
                    cadastro.scanner.close();
                    executar = false;
                    break;
                default:
                    System.out.println("Opcao invalida, escolha outra opcao.");
                    break;
            }
        }
    }
}

