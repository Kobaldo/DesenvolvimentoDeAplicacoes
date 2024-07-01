public class Juros {
   public double calcularJurosSimples(double c, double i){
       int t = 12;
       return Math.abs(c)*i*t;
    }
   public double calcularJurosCompostos(double c, double i){
       int t = 12;
       return Math.abs(c)*Math.pow((1+i),t);
    }
}
