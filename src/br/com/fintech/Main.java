package br.com.fintech;

import java.util.Scanner;

import br.com.fintech.model.Cliente;
import br.com.fintech.model.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int escolha;
		
		Cliente cliente = new Cliente("Ruan", "lanaruanpablo@gmail.com", "139.931.929-90");
		
		
		
		do {
			System.out.println("Escolha uma Opção: \n [1] Criar Conta \n [2] Encerrar Conta \n [3] Sair");
			
			escolha = scan.nextInt();
			switch (escolha) {
			
			case 1: 
				int tipoConta;
				System.out.println("Escolha o tipo da sua conta: \n [1] Corrente \n [2] Poupança \n [3] Investimento");
				tipoConta = scan.nextInt();
				
				cliente.criarConta(tipoConta);
				break;
			
			default:
			}
		}while(escolha != 3);
		
		cliente.ContasToString();

	}

}
