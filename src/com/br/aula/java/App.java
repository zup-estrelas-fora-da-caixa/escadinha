package com.br.aula.java;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int continuar = 0;
		while (continuar == 0) {

			System.out.println("Qual vai ser o tamanho da escada?");
			int tamanhoDaEscada = scan.nextInt();

			StringBuilder escadinha = new StringBuilder();

			System.out.println("Qual vai ser o caracter?");
			String caracter = scan.next();

			for (int controle = 0; controle < tamanhoDaEscada; controle++) {
				escadinha.insert(controle, caracter);
				System.out.println(escadinha);
			}

			System.out.println("0 para continuar. 1 para sair");
			continuar = scan.nextInt();
		}
	}

}
