public class Investimentos {
    double calcularInvestimentos(double f, double r){
        return f/Math.sqrt(1+r);
    }
    double gerarTaxaDeJuros(double i){
        double random = Math.random();
        mostrarMaiorTaxaDeJuros(i,random);
        return random;
    }
    void mostrarMaiorTaxaDeJuros(double i, double r){
        System.out.println("A maior taxa de juros comparada foi "+ Math.max(r,i));
    }
}
