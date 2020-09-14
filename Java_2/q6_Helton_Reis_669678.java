// Questao 6
// Helton Cruz Reis
// 669678
// Tarde
// Alexei

import java.util.Scanner;

public class q6_Helton_Reis_669678 {

    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scan = new Scanner(System.in);

        // Pega a quantidade de dados a serem testados
        int testQt = scan.nextInt();
        scan.nextLine();
        String[] boots = new String[testQt];

        // Le os dados que serao usados
        for (int i = 0; i < testQt; i++) {
            boots[i] = scan.nextLine();
        }

        int pairs = 0;

        // Repete o teste para cada um dos dados inseridos
        for (int i = 0; i < testQt; i++) {

            // Prossegue se a bota for do lado direito
            if (boots[i].split(" ")[1].contentEquals("D")) {

                // Testa para cada um dos dados inseridos
                for (int j = 0; j < testQt; j++) {

                    // Se a bota for do mesmo numero mas do lado oposto, adicionar um ao par e parar o teste
                    if (boots[j].contentEquals(boots[i].split(" ")[0] + " E")){
                        pairs++;
                        break;
                    }
                }

            // Prossegue se a bota for do lado esquerdo
            } else if (boots[i].split(" ")[1].contentEquals("E")) {

                // Testa para cada um dos dados inseridos
                for (int j = 0; j < testQt; j++) {

                    // Se a bota for do mesmo numero mas do lado oposto, adicionar um ao par e parar o teste
                    if (boots[i].contentEquals(boots[j].split(" ")[0] + " D")){
                        pairs++;
                        break;
                    }
                }

            }
        }

        // Mostra quantos pares existem
        System.out.println(pairs);

    }

}