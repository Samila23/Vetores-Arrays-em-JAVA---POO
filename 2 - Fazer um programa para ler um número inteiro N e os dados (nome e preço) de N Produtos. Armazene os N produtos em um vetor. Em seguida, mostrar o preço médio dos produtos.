//Fazer um programa para ler um número inteiro N e os dados (nome e
//preço) de N Produtos. Armazene os N produtos em um vetor. Em
//seguida, mostrar o preço médio dos produtos.

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		System.out.println("Digite a quantidade de produtos comprados:");
		n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for ( int i=0 ; i < vetor.length ; i ++) {
			sc.nextLine();
			System.out.println("Ditige o nome do produto");
			String nome = sc.nextLine();
			System.out.println("Ditige o preço deste produto");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome , preco);
 		}
		double totalPreco = 0.0;
		for ( int i = 0 ; i < vetor.length ; i++) {
			totalPreco = totalPreco + vetor[i].getPreco();
		}
		double media = totalPreco / n;
		System.out.printf("Valor média da compra total é de: %.2f%n", media);
		sc.close();
		}
		
}

