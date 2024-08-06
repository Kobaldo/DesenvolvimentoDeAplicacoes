public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        boolean executar = true;
        while (executar) {
            cadastro.imprimirMenu();
            String opcao = cadastro.scanner.nextLine();
            switch (opcao) {
                case "1":
                    cadastro.adicionarAlunos();
                    break;

                case "2":
                    cadastro.deletarAluno();
                    break;

                case "3":
                    cadastro.lerAluno();
                    break;

                case "4":
                    cadastro.adicionarProfessor();
                    break;
                case "5":
                    cadastro.lerProfessor();
                    break;
                case "6":
                    cadastro.deletarProfessor();
                    break;
                case "7":
                    cadastro.consultarAula();
                    break;
                case "8":
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

