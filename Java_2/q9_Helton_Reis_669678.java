import java.util.Scanner;

// Questao 8
// Helton Cruz Reis
// 669678
// Tarde
// Alexei

public class q9_Helton_Reis_669678{

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

        int approved = 0;
        int reproved = 0;

        // Mostra se o aluno foi reprovado ou aprovado baseado em sua nota
        for (int i = 0; i < quantity; i++) {
            if(grades[i] >= 60){
                System.out.println(students[i] + " APROVADO");
                approved++;
            }
            else{
                System.out.println(students[i] + " REPROVADO");
                reproved++;
            }  
        }

        // Mostra a quantidade de aprovados e reprovados
        System.out.println(approved + " APROVADOS");
        System.out.println(reproved + " REPROVADOS");

        // Mostra a porcentagem de aprovacoes
        System.out.println((int)(((double)approved / (double)quantity) * 100) + "%");
    }

}