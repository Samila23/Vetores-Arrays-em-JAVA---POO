//Fazer um programa para ler um número inteiro N e a altura de N
//pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
//altura média dessas pessoas.

package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de idades que irá digitar");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0; i <n ; i++) {
			System.out.println("Digite a idade");
			vetor[i] = sc.nextDouble();
		}
		
		double soma=0;
		for (int i = 0 ; i < n ; i++) {
			soma = soma + vetor[i];
		}
		double resultado = soma / n;
		System.out.printf("Media de todas as idades %2.f%n", resultado);
		sc.close();
		}
		
}

