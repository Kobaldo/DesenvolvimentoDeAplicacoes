import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    Clientes clientes = new Clientes();

    void adicionarVarios(){
        List<String[]> lista = new ArrayList<>();
        clientes.connect();
        clientes.createTable();
        while(true) {
            String[] nome ={"", ""};
            System.out.println("Digite o nome do cliente");
            nome[0] = scanner.nextLine();
            //saída do loop
            if (nome[0].equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Digite a idade do cliente");
            nome[1] = scanner.nextLine();
            lista.add(nome);
        }
        clientes.insertClient(lista);
        clientes.close();
    }

    void retornarMaiores(){
        clientes.connect();
        clientes.queryClients();
        clientes.close();
    }

    void sinalizarMenores(){
        clientes.connect();
        clientes.atualizarMenores();
        clientes.close();
    }

    void limparBancoDeDados(){
        clientes.connect();
        clientes.deleteClient();
        clientes.close();
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir nome e sobrenome");
        System.out.println("2- Mostrar clientes maiores de idade");
        System.out.println("3- Sinalizar menores de idade");
        System.out.println("4- Remover menores de idade");
        System.out.println("5- Sair");
    }
}
