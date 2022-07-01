//A dona de um pensionato possui dez quartos para alugar para estudantes,
//sendo esses quartos identificados pelos números 0 a 9.
//Fazer um programa que inicie com todos os dez quartos vazios, e depois
//leia uma quantidade N representando o número de estudantes que vão
//alugar quartos (N pode ser de 1 a 10). Em seguida,informar o nome e email do
//estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
//que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
//um relatório de todas ocupações do pensionato, por ordem de quarto,
//conforme exemplo.

package application;
import java.util.Scanner;
import entities.Pensionato;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		Pensionato[] vetor = new Pensionato[10];
		
		
		System.out.println(" Total que quartos que alugará");
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i ++) {
			sc.nextLine();
			System.out.println("Digite o nome do inquilino");
			String nome = sc.nextLine();
			System.out.println("Digite o e-mail do inquilino");
			String email = sc.nextLine();
			System.out.println("Digite o número do quarto que o inquilino deseja ocupar");
			int numeroDoQuarto = sc.nextInt();
			vetor[numeroDoQuarto] = new Pensionato(  nome,  email);
		}
		for (int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i] != null) {
				System.out.println( "O Quarto " + i + ", está ocupado por " + vetor[i].getNome() + ", cujo o respectivo e-mail é: " + vetor[i].getEmail());
			}
		}
		
		
		
		sc.close();
}
}
 // CLASSE PENSIONATO, RESPONSÁVEL POR ARMAZENAS AS VARIAVÉIS DO VETOR, COMO NOME E EMAIL.
 
 package entities;

public class Pensionato {
		private String nome;
		private String email;
		
		// construtores para obrigar a entrada de dados 
		public Pensionato( String nome, String email) {
			this.nome = nome;
			this.email = email;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String toString() {
			return nome + " " + email; 
		}
		
}
