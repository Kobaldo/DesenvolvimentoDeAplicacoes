public class OperacoesBasicas {
        // Método para adicionar dois números
        int adicionar(int a, int b) {
            return a + b;
        }

        // Método para subtrair o segundo número do primeiro
       int subtrair(int a, int b) {
            return a - b;
        }

        // Método para multiplicar dois números
        int multiplicar(int a, int b) {
            return a * b;
        }

        // Método para dividir o primeiro número pelo segundo
        // Retorna um double para lidar com divisões não exatas
        double dividir(int a, int b) {
            // Verifica se o divisor é zero para evitar divisão por zero
            if (b == 0) {
                throw new IllegalArgumentException("Divisor não pode ser zero");
            }
            return (double) a / b;
        }
    }

