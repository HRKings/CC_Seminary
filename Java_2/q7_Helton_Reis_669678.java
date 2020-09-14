import java.util.Scanner;

// Questao 7
// Helton Cruz Reis
// 669678
// Tarde
// Alexei

public class q7_Helton_Reis_669678 {

	public static void main(String[] args) {
        //Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Guarda a ordem da matriz
        int matrixSize = Integer.parseInt(scan.nextLine());

        // Cria um array com o mesmo tamanho da ordem da matriz
        int[][] matrix = new int[matrixSize][matrixSize];
        int[] matrixLineSum = new int[matrixSize];
        int[] matrixColumnSum = new int[matrixSize];

        int diagonal = 0;

        // Repita o teste para cada posicao da matriz
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                // Le o valor naquela posicao da matriz
                matrix[i][j] = scan.nextInt();
            }
        }

        // Repita o teste para cada posicao da matriz
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                // Calcula a soma das linhas
                matrixLineSum[i] += matrix[i][j];
            }
        }

        // Repita o teste para cada posicao da matriz
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                // Calcula a soma da diagonal principal
                if(i == j)
                    diagonal += matrix[i][j];
            }
        }

        // Repita o teste para cada posicao da matriz
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                // Calcula a soma das colunas
                matrixColumnSum[i] += matrix[j][i];
            }
        }


        boolean isMagic = true;

        // Testa para cada posicao na ordem da matriz
        for (int i = 1; i < matrixSize; i++) {
            // Se o valor da linha anterior e diferente da atual, entao a matriz nao e magica
            if(matrixLineSum[i - 1] != matrixLineSum[i])
                isMagic = false;
        }

        // Testa para cada posicao na ordem da matriz
        if(isMagic)
        	for (int i = 1; i < matrixSize; i++) {
           		 // Se o valor da linha anterior e diferente da atual, entao a matriz nao e magica
           		 if(matrixColumnSum[i - 1] != matrixColumnSum[i])
           		     isMagic = false;
        }


        // Se a soma da diagonal nao for igual a soma das linhas, entao a matriz nao e magica
        if(matrixLineSum[0] != diagonal)
            isMagic = false;

        // Se a matriz e magica retorna sua soma, se nao retorna 0
        if(isMagic)
            System.out.println(matrixLineSum[0]);
        else
            System.out.println(0);
    }

}