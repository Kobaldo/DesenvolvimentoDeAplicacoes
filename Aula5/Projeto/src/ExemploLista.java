import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploLista {
    public void metodosListas() {
        List<String> lista = new ArrayList<>();

        // Inserção de elementos
        lista.add("um");
        lista.add("dois");
        lista.add("três");

        // Acesso a elementos
        System.out.println("Primeiro elemento: " + lista.get(0));

        // Atualização de elementos
        lista.set(1, "dois atualizado");

        // Remoção de elementos
        lista.remove(0); // Remove "um"
        lista.remove("três"); // Remove "três"

        // Iteração sobre os elementos
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Verificação de existência de um elemento
        System.out.println("Lista contém 'dois atualizado': " + lista.contains("dois atualizado"));

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // Limpeza da lista
        lista.clear();
        System.out.println("Lista está vazia: " + lista.isEmpty());

        // Inserção e ordenação de elementos
        lista.add("banana");
        lista.add("maçã");
        lista.add("laranja");
        Collections.sort(lista);
        System.out.println("Lista ordenada: " + lista);
    }
}
