import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsandoArrays exemplo = new UsandoArrays();
        // Inicializa um array de inteiros com tamanho 10
        int[] array = exemplo.inicializarArray(10);

        // Imprime os elementos do array
        exemplo.imprimirArray(array);

        // Calcula e imprime a soma dos elementos do array
        int soma = exemplo.somaArray(array);
        System.out.println("Soma dos elementos do array: " + soma);

        ExemploLista lista = new ExemploLista();
        lista.metodosListas();

        LacosRepeticao laco = new LacosRepeticao();

        // Criação de uma lista de clientes
        List<String> clientes = new ArrayList<>();
        clientes.add("João");
        clientes.add("Maria");
        clientes.add("Carlos");
        clientes.add("Ana");

        // Demonstração dos métodos
        laco.usarFor(clientes);
        laco.usarForEach(clientes);
        laco.usarWhile(clientes);
        laco.usarDoWhile(clientes);
    }
}