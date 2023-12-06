import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // recebe altura com ponto
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantidade;

        System.out.println("Média de produtos");
        System.out.printf("Quantos produtos você quer analisar:  ");
        quantidade = scanner.nextInt();

        double[] vect = new double[quantidade];
        String[] vect_nome = new String[quantidade];

        for (int contador = 0; contador < quantidade; contador++){
            System.out.println("Digite o nome do " + (contador + 1) + "ª produto: ");
            vect_nome[contador] = scanner.next();

            System.out.println("Digite o preço do " + (contador + 1) + "ª produto: ");
            vect[contador] = scanner.nextDouble();

        }

        double soma = 0;
        for (int contador = 0; contador < quantidade; contador++){
            soma += vect[contador];
        }

        double media = soma / quantidade;


        // Resultado
        System.out.println("Lista de produtos");
        for (int contador = 0; contador < quantidade; contador++){
            System.out.println(vect_nome[contador]);
        }

        System.out.printf("Preço médio dos produtos: %.2f%n", media);

        scanner.close();
    }
}