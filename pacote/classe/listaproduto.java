package pacote;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class listaproduto {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        produto[] produtos = new produto[10];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite o valor do produto " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            scanner.nextLine();  

            produtos[i] = new produto(i + 1, nome, valor);
        }

        Arrays.sort(produtos, Comparator.comparingInt(p -> p.codigo));
        System.out.println("\nProdutos ordenados por código:");
        for (produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\n---------------------------\n");

        Arrays.sort(produtos, Comparator.comparingDouble(p -> p.valor));
        System.out.println("Produtos ordenados por VALOR:");
        for (produto p : produtos) {
            System.out.println(p);
        }

        scanner.close();
    }
}
