public class Main {
    public static void main(String[] args) {
        // Cria uma matriz 3x3 para armazenar notas de 3 alunos em 3 disciplinas
        double[][] notas = new double[3][3];

        // Atribui valores à matriz
        notas[0][0] = 8.5; // Nota do aluno 1 na disciplina 1
        notas[0][1] = 7.0; // Nota do aluno 1 na disciplina 2
        notas[0][2] = 9.0; // Nota do aluno 1 na disciplina 3

        notas[1][0] = 6.0; // Nota do aluno 2 na disciplina 1
        notas[1][1] = 8.5; // Nota do aluno 2 na disciplina 2
        notas[1][2] = 7.5; // Nota do aluno 2 na disciplina 3

        notas[2][0] = 9.5; // Nota do aluno 3 na disciplina 1
        notas[2][1] = 7.5; // Nota do aluno 3 na disciplina 2
        notas[2][2] = 8.0; // Nota do aluno 3 na disciplina 3

        // Imprime a matriz
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada aluno
        }

        // Calcula e imprime a média de cada aluno
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.println("Média do aluno " + (i + 1) + ": " + media);
        }
    }
}
