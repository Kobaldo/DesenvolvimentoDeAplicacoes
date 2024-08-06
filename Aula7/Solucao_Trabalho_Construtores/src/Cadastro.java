import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    BancoDeDados bancoDeDados = new BancoDeDados();
    Alunos alunos;
    Professor professor;
    Aula aula = new Aula();


    void adicionarAlunos(){
        List<Alunos> lista = new ArrayList<>();
        bancoDeDados.connect();
        while(true) {
            String[] aluno ={"", "", ""};
            System.out.println("Digite o nome do aluno (ou fim para sair): ");
            aluno[0] = scanner.nextLine();
            //saída do loop
            if (aluno[0].equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Digite a idade do aluno");
            aluno[1] = scanner.nextLine();
            System.out.println("Digite a aula frequentada");
            aluno[2] = scanner.nextLine();
            this.alunos = new Alunos(aluno[0], Integer.parseInt(aluno[1]), aluno[2]);
            lista.add(alunos);
        }
        alunos.createTable();
        alunos.inserirAlunos(lista);
        bancoDeDados.close();
    }

    void lerAluno(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do aluno a ser consultado: ");
        alunos.lerAluno(scanner.nextLine());
        bancoDeDados.close();
    }
    void deletarAluno(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do aluno a ser deletado: ");
        alunos.deleteAlunos(scanner.nextLine());
        bancoDeDados.close();
    }

    void adicionarProfessor(){
        List<Professor> lista = new ArrayList<>();
        bancoDeDados.connect();
        while(true) {
            String[] professor ={"", "", ""};
            System.out.println("Digite o nome do professor (ou fim para sair): ");
            professor[0] = scanner.nextLine();
            //saída do loop
            if (professor[0].equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Digite a formação do professor");
            professor[1] = scanner.nextLine();
            System.out.println("Digite a aula ministrada");
            professor[2] = scanner.nextLine();
            this.professor = new Professor(professor[0], professor[1], professor[2]);
            lista.add(this.professor);
        }
        professor.createTable();
        professor.inserirProfessor(lista);
        bancoDeDados.close();
    }

    void lerProfessor(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do professor a ser consultado: ");
        professor.lerProfessor(scanner.nextLine());
        bancoDeDados.close();
    }
    void deletarProfessor(){
        bancoDeDados.connect();
        System.out.println("Digite o nome do professor a ser deletado: ");
        professor.deleteProfessor(scanner.nextLine());
        bancoDeDados.close();
    }

    void consultarAula(){
        bancoDeDados.connect();
        System.out.println("Digite o nome da aula a ser consultada: ");
        aula.lerAula(scanner.nextLine());
        bancoDeDados.close();
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir alunos");
        System.out.println("2- Deletar aluno");
        System.out.println("3- Consultar aluno");
        System.out.println("4- Inserir professor");
        System.out.println("5- Consultar professor");
        System.out.println("6- Deletar professor");
        System.out.println("7- Consultar aula");
        System.out.println("8- Sair");
    }
}
