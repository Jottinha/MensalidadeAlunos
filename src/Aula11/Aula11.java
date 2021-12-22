package Aula11;

import java.util.Scanner;

public class Aula11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Aluno[] aluno = new Aluno[5];
		Bolsista[] alunoBolsista = new Bolsista[5];
		
		System.out.println("PROVA FACULDADE");
		
		System.out.print("\nDigite o nome do participante: ");
		String nomeUser = input.nextLine();
		
		System.out.print("Digite a nota da prova: ");
		int notaUser = input.nextInt();
		
		if(notaUser >= 80) {
			alunoBolsista[0] = new Bolsista(notaUser, nomeUser);
			System.out.println(alunoBolsista[0].toString());
		}
		else if(notaUser < 80) {
			aluno[0] = new Aluno();
			aluno[0].setNome(nomeUser);
			System.out.println(aluno[0].toString());
		}
		
		input.close();
	}
}
