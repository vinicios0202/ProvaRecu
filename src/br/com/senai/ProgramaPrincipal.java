package br.com.senai;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		int valor = 0;
		
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		int opcaoDoMenu;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1) Tabuada");
			System.out.println("2) Sequencia de valores");
			System.out.println("9) Sair");
			System.out.println("-------------------------------");
			System.out.println("Informe o opção desejada: ");
			System.out.println("-------------------------------");
			opcaoDoMenu = tec.nextInt();
			
			
			switch (opcaoDoMenu) {
			case 1:
				System.out.println("--- TABUADA ---");
				
				int multiplicador = 0;
				
				System.out.print("Informe um valor inteiro: ");
				valor = tec.nextInt();
				
				do {
					System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				} while(multiplicador <= 10);
				
				break;
				
			case 2:
				System.out.print("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				
				System.out.print("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();
				
				if(primeiroValor < segundoValor) {
					while(primeiroValor <= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor++;
					}
				} else {
					while(primeiroValor >= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor--;
						}
		}
				break;
				
			
				
			default:
				System.out.println("opção invalida.");
				break;
				}
			System.out.println("-------------------------------");
			System.out.println("Deseja continuar?");
			System.out.println("-------------------------------");
			continuar = tec.next();
			} while (continuar.equalsIgnoreCase("s"));
			System.out.println("**************************");
			System.out.println("Sistema Finalizado");
			System.out.println("**************************");
	}

	
	}

