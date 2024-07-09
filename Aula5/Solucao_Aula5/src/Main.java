import java.sql.Connection;

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
                    cadastro.adicionarVarios();
                    break;

                case "2":
                    cadastro.retornarMaiores();
                    break;

                case "3":
                    cadastro.sinalizarMenores();
                    break;

                case "4":
                    cadastro.limparBancoDeDados();
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

