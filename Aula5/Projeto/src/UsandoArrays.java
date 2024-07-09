public class UsandoArrays {
    // Método para inicializar e preencher um array de inteiros
    public int[] inicializarArray(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Método para imprimir os elementos de um array de inteiros
    public void imprimirArray(int[] array) {
        System.out.println("Elementos do array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Método para calcular a soma dos elementos de um array de inteiros
    public int somaArray(int[] array) {
        int soma = 0;
        for (int i : array) {
            soma += i;
        }
        return soma;
    }
}
