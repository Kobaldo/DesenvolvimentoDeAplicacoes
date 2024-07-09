import java.util.ArrayList;
import java.util.List;

public class LacosRepeticao {

    // Método para demonstrar o uso do laço for
    public void usarFor(List<String> clientes) {
        System.out.println("Usando o laço for:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente " + (i + 1) + ": " + clientes.get(i));
        }
    }

    // Método para demonstrar o uso do laço foreach
    public void usarForEach(List<String> clientes) {
        System.out.println("Usando o laço foreach:");
        for (String cliente : clientes) {
            System.out.println("Cliente: " + cliente);
        }
    }

    // Método para demonstrar o uso do laço while
    public void usarWhile(List<String> clientes) {
        System.out.println("Usando o laço while:");
        int i = 0;
        while (i < clientes.size()) {
            System.out.println("Cliente " + (i + 1) + ": " + clientes.get(i));
            i++;
        }
    }

    // Método para demonstrar o uso do laço do-while
    public void usarDoWhile(List<String> clientes) {
        System.out.println("Usando o laço do-while:");
        int i = 0;
        do {
            System.out.println("Cliente " + (i + 1) + ": " + clientes.get(i));
            i++;
        } while (i < clientes.size());
    }

}
