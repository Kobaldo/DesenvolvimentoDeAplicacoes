public class Escrita {
    void escrever() {
        System.out.print("Esta é uma mensagem.");
        System.out.print(" Esta é outra mensagem na mesma linha.");
        System.out.println("Esta é uma mensagem de novo.");
        System.out.println("Esta é outra mensagem em uma nova linha.");
        int idade = 25;
        String nome = "João";
        double salario = 12345.67;
        System.out.printf("Nome: %s, Idade: %d, Salário: %.2f\n", nome, idade, salario);

        System.out.printf("%-10s%-10d%10.2f\n", "Nome", 25, 12345.67);  //Ajusta o alinhamento e o número de casas decimais
        System.out.printf("%-10s%-10d%10.2f\n", "Alice", 30, 6789.00);

        System.out.printf("%+d %+d\n", 25, -25); //Saída de Números com Sinal

        /*
        Especificadores de Formato no printf
        %s : String
        %d : Inteiro decimal
        %f : Número de ponto flutuante (pode ser formatado para um número específico de casas decimais, como %.2f)
        %c : Caractere
        %b : Booleano
         */
    }
}
