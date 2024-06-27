public class Funcionario {
    String nome;

    public void receberNomeFuncionario(){
        System.out.println("Digite o nome do funcionario: ");
        this.nome = Main.scanner.nextLine();
        System.out.println("Funcionario "+ nome +" registrado com sucesso!" );
    }

}
