import java.util.Random;

public class UsarMath {
    double gerarAleatorio(){
        return Math.random();
    }
    int gerarAleatorioMaior(int x){
        Random random = new Random();
        return random.nextInt(x+1);
    }

    double calcularAbsoluto(double x){
        return Math.abs(x);
    }
    double calcularPotencia(double x){
        return Math.pow(x,2);
    }
    double calcularRaizQuadrada(double x){
        return Math.sqrt(x);
    }
}
