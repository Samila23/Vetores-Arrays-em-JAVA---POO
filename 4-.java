//Fazer um programa para ler dois números inteiros M e N, e depois ler
//uma matriz de M linhas por N colunas contendo números inteiros,
//podendo haver repetições. Em seguida, ler um número inteiro X que
///pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//esquerda, acima, à direita e abaixo de X, quando houver, conforme
//exemplo.


package application;
import java.util.Scanner;
import entities.Pensionato;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o tamanho da Matriz"); 
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];
		
		for (int i = 0 ; i < matriz.length ; i ++) {
			for (int j = 0 ; j < matriz[i].length ; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite um numero da matrix");
		int x = sc.nextInt();
		for (int i = 0 ; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == x) {
					if(i<0) {
						System.out.println("Posicao " + i +" " + j);
						System.out.println("Posicao Acima" + (i-1) +" " + j);
						System.out.println("Posicao abaixo" + (i+1) +" " + j);
						System.out.println("Posicao Posterior " + i +" " + (j+1));
						System.out.println("Posicao Anterior " + i +" " + (j-1));
					}
					if (i==0) {
						System.out.println("Posicao " + i +" " + j);
						System.out.println("Posicao Acima: Não há posição acima");
						System.out.println("Posicao abaixo" + (i+1) +" " + j);
						System.out.println("Posicao Posterior " + i +" " + (j+1));
						System.out.println("Posicao Anterior : essa já é a menor posição do veotor");
					}
					if (i== matriz.length) {
						System.out.println("Posicao " + i +" " + j);
						System.out.println("Posicao Acima: Não há posição acima");
						System.out.println("Posicao abaixo" + (i+1) +" " + j);
						System.out.println("Posicao Posterior " + i +" " + (j+1));
						System.out.println("Posicao Anterior : essa já é a menor posição do veotor");
					}

				}
				
			}
			
		}
		sc.close();
}
}
