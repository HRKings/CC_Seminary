import java.util.Locale;
import java.util.Scanner;

// Questao 8
// Helton Cruz Reis
// 669678
// Tarde
// Alexei

public class q10_Helton_Reis_669678{

    public static void main(String[] args) {
        //Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Entra com a quantidade de alunos
        int quantity = Integer.parseInt(scan.nextLine());

        // Cria uma variavel temporaria para armazenar os alunos
        String buffer = scan.nextLine();

        // Divide os alunos em posicoes num array
        String[] students = buffer.split(" ");

        // Cria um array para armazenar as notas
        int[][] gradesMatrix = new int[quantity][4];
        int[] grades = new int[quantity];
        int[] testsGrades = new int[quantity];

        // Repete para cada aluno e para cada nota
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < 4; j++) {
                // Le o valor naquela posicao da matriz
                gradesMatrix[i][j] = scan.nextInt();
            }
        }

        // Repete para cada aluno e para cada nota
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < quantity; j++) {
                // Calcula a soma das notas de cada prova
                testsGrades[i] += gradesMatrix[j][i];
            }
        }

        // Repete para cada aluno e para cada nota
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < 4; j++) {
                // Calcula a soma das notas de cada aluno
                grades[i] += gradesMatrix[i][j];
            }
        }

        // Mostra a media de cada prova
        for (int i = 0; i < 4; i++) {
            System.out.println("PROVA " + (i+1) + " " +  String.format(Locale.US, "%.2f", ((double)testsGrades[i] / (double)quantity)));
        }

        int bestPos = 0;

        // Procura a posicao do array de notas que contem a maior nota
        for (int i = 0; i < quantity; i++) {
            if(grades[i] > grades[bestPos])
                bestPos = i; 
        }

        // Mostra o aluno com a maior nota e sua nota final
        System.out.println(students[bestPos] + " " + grades[bestPos]);

    }

}