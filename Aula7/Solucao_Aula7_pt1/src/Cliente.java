import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    String nome;
    String dataDeNascimento;
    String cpf;
    String telefone;
    static ConexaoBD conexaoBD = new ConexaoBD();
    static Scanner scanner = new Scanner(System.in);

    public Cliente(String nome, String dataDeNascimento, String cpf, String telefone){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    static void adicionarCliente(){
        conexaoBD.connect();
        conexaoBD.createTable();
        System.out.println("Digite o nome do cliente");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente");
        String dataDeNascimento = scanner.nextLine();
        System.out.println("Digite CPF do cliente");
        String cpf = scanner.nextLine();
        System.out.println("Digite o telefone do cliente");
        String telefone = scanner.nextLine();
        if(dataDeNascimento.equalsIgnoreCase("") || telefone.equalsIgnoreCase("")){
            conexaoBD.insertClient(new Cliente(nome,cpf));
        } else {
            conexaoBD.insertClient(new Cliente(nome, dataDeNascimento, cpf, telefone));
        }
        conexaoBD.close();
    }
    static void lerCliente(){
        System.out.println("Digite o nome do cliente a pesquisar:");
        String nome = scanner.nextLine();
        conexaoBD.connect();
        conexaoBD.queryClients(nome);
        conexaoBD.close();
    }
}
