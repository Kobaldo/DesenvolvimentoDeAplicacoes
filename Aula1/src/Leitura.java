import java.util.Scanner;

public class Leitura {
    Scanner scanner = new Scanner(System.in);
    void receberFrase() {
        // Recebe uma entrada do usuário como uma string
        System.out.print("Digite uma frase: ");
        String inputString = scanner.nextLine();
        System.out.println("Você digitou: " + inputString);
    }
    void receberInteiro() {
        // Recebe uma entrada do usuário como um inteiro
        System.out.print("Digite um número inteiro: ");
        int inputInt = scanner.nextInt();
        System.out.println("Você digitou: " + inputInt);
    }
    void receberDouble() {
        // Recebe uma entrada do usuário como um ponto flutuante
        System.out.print("Digite um número decimal: ");
        double inputDouble = scanner.nextDouble();
        System.out.println("Você digitou: " + inputDouble);
    }
    void fecharScanner(){
        scanner.close();
    }
    }


