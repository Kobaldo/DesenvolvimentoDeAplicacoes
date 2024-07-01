//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsarMath matematica = new UsarMath();
        double num = matematica.gerarAleatorio();
        System.out.println("O numero aletorio gerado foi " + num);
        System.out.println("O valor absoluto " + matematica.calcularAbsoluto(num));
        System.out.println("O valor absoluto x -1 " + matematica.calcularAbsoluto(-1*num));
        System.out.println("A potência de 2 de "+num +" é "+ matematica.calcularPotencia(num));
        System.out.println("A raiz quadrada de "+num +" é "+ matematica.calcularRaizQuadrada(num));
    }
}