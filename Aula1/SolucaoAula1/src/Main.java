import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Produto produto = new Produto();
        boolean executar = true;
        while (executar) {
            System.out.println("Escolha o que você deseja fazer:");
            System.out.println("1- Cadastrar funcionario ");
            System.out.println("2- Cadastrar produto ");
            System.out.println("3- Deletar produto ");
            System.out.println("4- Sair");
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    funcionario.receberNomeFuncionario();
                    break;
                case "2":
                    produto.adicionarProduto();
                    break;
                case "3":
                    produto.removerProduto();
                    break;
                case "4":
                    executar=false;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
        scanner.close();
    }
}