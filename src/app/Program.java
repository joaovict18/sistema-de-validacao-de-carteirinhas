package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Carteirinha;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos vão ser inseridos? ");
		int N = sc.nextInt();
		sc.nextLine();
		
		List<Aluno> alunos = new ArrayList<>();
		
		System.out.println();
		
		System.out.println("Insira os dados do aluno: ");
		
		for (int i=0; i<N; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Instituição: ");
			String instituicao = sc.nextLine();
			System.out.print("Data de vencimento da carteirinha: ");
			String dataDeVencimento = sc.next();
			sc.nextLine();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			Carteirinha carteirinha = new Carteirinha(instituicao, LocalDate.parse(dataDeVencimento, fmt));
			
			Aluno aluno = new Aluno(nome, carteirinha);
			
			alunos.add(aluno);
			
			System.out.println();
		}
		
		System.out.println();
		
		for (Aluno al : alunos) {
			System.out.println(al);
		}
		
		sc.close();
	}

}
