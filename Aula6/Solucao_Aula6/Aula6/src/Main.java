import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Visualizar Produtos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 4) break;

            System.out.print("Digite a seção (0-Eletrônicos, 1-Roupas, 2-Alimentos): ");
            int secao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                scanner.nextLine(); // Consumir nova linha
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = scanner.nextInt();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                loja.adicionarProduto(secao, codigo, nome, quantidade, preco);
            } else if (opcao == 2) {
                System.out.print("Digite o código do produto a ser removido: ");
                int codigo = scanner.nextInt();
                loja.removerProduto(secao, codigo);
            } else if (opcao == 3) {
                loja.visualizarProdutos(secao);
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
