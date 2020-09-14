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

        Aluno[] alunos = new Aluno[quantity];

        for (int i = 0; i < quantity; i++){
            alunos[i] = new Aluno(students[i]);
        }

        // Cria um array para armazenar as notas
        int[] grades = new int[4];

        // Repete para cada aluno e para cada nota
        for (int i = 0; i < quantity; i++) {
            grades = new int[4];
            for (int j = 0; j < 4; j++) {
                // Soma a nota de cada aluno
                grades[j] = scan.nextInt();
            }
            alunos[i].inserir(grades);
        }

        // Calcula a nota de cada aluno
        for (Aluno al : alunos) {
            al.calcular();
        }

        // Mostra a nota final de cada aluno e seu nome
        for (int i = 0; i < quantity; i++) {
            System.out.println(alunos[i].Name + " " + alunos[i].Grade);
        }
    }

    
public static class Aluno {
    public String Name;
    public int[] Grades;
    public int Grade;

    public Aluno(String name){
        this.Name = name;
    }

    public void inserir(int[] grade){
        Grades = grade;
    }

    public void calcular(){
        for(int i : Grades){
            Grade += i;
        }
    }
}

}
