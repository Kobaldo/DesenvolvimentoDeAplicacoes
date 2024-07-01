import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Investimentos investimentos = new Investimentos();
        Juros juros = new Juros();
        Scanner scanner = new Scanner(System.in);
        double i = investimentos.gerarTaxaDeJuros(0.5);
        double c, j;

        System.out.println("Digite 1 para juros simples");
        System.out.println("Digite 2 para juros compostos");
        System.out.println("Digite 3 para investimentos futuros");
        System.out.println("Digite 4 para nova taxa de juros");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("Digite seu investimento ou dívida");
                c = scanner.nextDouble();
                j = juros.calcularJurosSimples(c, i);
                System.out.println("Total de juros: " + j);
                break;
            case 2:
                System.out.println("Digite seu investimento ou dívida");
                c = scanner.nextDouble();
                j = juros.calcularJurosCompostos(c, i);
                System.out.println("Total de juros: " + j);
                break;
            case 3:
                System.out.println("Digite seu investimento desejado");
                c = scanner.nextDouble();
                j = investimentos.calcularInvestimentos(c, i);
                System.out.println("Você deve investir " + j + " para obter " + c);
                break;
            case 4:
                i = investimentos.gerarTaxaDeJuros(i);
                System.out.println("A nova taxa de juros é " + i);
                break;
        }
    }
}