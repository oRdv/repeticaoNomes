package br.senai.jandira.sp;

import java.util.Scanner;

public class Repetição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		int repetições;
		String nome;
		
		System.out.print("Olá, insira uma palavra: ");
		nome = teclado.next();

		
		System.out.print("Quantas repetições serão? ");
		repetições = teclado.nextInt();
		
		while (repetições > 0) {
			System.out.println(nome);
			repetições--;
		}
		
		
		
		

	}

}
