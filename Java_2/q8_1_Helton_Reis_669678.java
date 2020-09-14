import java.util.Scanner;

// Questao 8
// Helton Cruz Reis
// 669678
// Tarde
// Alexei

public class q8_Helton_Reis_669678{

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
        int[] grades = new int[quantity];

        // Repete para cada aluno e para cada nota
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < 4; j++) {
                // Soma a nota de cada aluno
                grades[i] += scan.nextInt();
            }
        }

        // Mostra a nota final de cada aluno e seu nome
        for (int i = 0; i < quantity; i++) {
            System.out.println(students[i] + " " + grades[i]);
        }
    }

}