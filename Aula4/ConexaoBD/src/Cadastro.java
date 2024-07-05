import java.util.Scanner;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    Clientes clientes = new Clientes();
    String nome, senha;


    void inserirNome(){
        clientes.connect();
        clientes.createTable();
        System.out.println("Digite seu nome e sobrenome");
        this.nome = scanner.nextLine().replace(" ","");
        clientes.insertClient(nome);
        clientes.close();
        System.out.println("Bem vindo(a), " + nome);
    }

    void criarSenhaManual(){
        clientes.connect();
        System.out.println("Crie uma senha: ");
        String senha1 = scanner.nextLine();
        System.out.println("Digite a senha novamente: ");
        String senha2 = scanner.nextLine();
        if(!senha1.equals(senha2)){
            System.out.println("As senhas não coincidem");
            return;
        }
        if(senha1.length()<8){
            System.out.println("A senha deve ter pelo menos 8 caracteres");
            return;
        }
        if (senha1.charAt(3)!='Z'){
            System.out.println("A senha deve ter Z na quarta posição");
            return;
        }
        this.senha = senha1;
        if(nome == null){
            System.out.println("O nome deve ser preenchido antes de gerar a senha");
            return;
        }
        clientes.updateClient(clientes.searchClients(nome), nome, senha);
        System.out.println("Sua nova senha é "+ senha);
        clientes.close();
    }

    void criarSenhaAutomatica(){
        clientes.connect();
        if(nome == null){
            System.out.println("Preencha seu nome antes de gerar a senha");
            return;
        }
        this.senha= nome.substring(0,4).concat(nome.substring(nome.length()-4));
        clientes.updateClient(clientes.searchClients(nome), nome, senha);
        System.out.println("Sua nova senha é "+ senha);
        clientes.close();
    }

    void editarNome(){
        clientes.connect();
        int id = clientes.searchClients(nome);
        System.out.println("Digite o nome ou sobrenome que será alterado: ");
        String nomeOriginal = scanner.nextLine();
        System.out.println("Digite o novo valor: ");
        String nomeAtualizado = scanner.nextLine();
        this.nome = nome.replace(nomeOriginal, nomeAtualizado);
        clientes.updateClient(id, nome, senha);
        clientes.close();
        System.out.println("O nome "+ nomeOriginal+ " foi atualizado para " + nomeAtualizado);
        System.out.println("Novo nome completo: "+ nome);
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir nome e sobrenome");
        System.out.println("2- Criar senha manualmente");
        System.out.println("3- Criar senha automaticamente");
        System.out.println("4- Editar nome ou sobrenome");
        System.out.println("5- Sair");
    }
}
