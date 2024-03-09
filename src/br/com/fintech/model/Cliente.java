package br.com.fintech.model;

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String email;
	private String cpf;
	private ArrayList<Conta> contas;

	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.contas = new ArrayList<>();
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

	public void criarConta(int tipoConta) {
		switch (tipoConta) {
		case 1:
			ContaCorrente corrente = new ContaCorrente();
			this.contas.add(corrente);
			break;
		case 2:
			ContaPoupanca poupanca = new ContaPoupanca();
			this.contas.add(poupanca);
			break;
		case 3:
			ContaInvestimento investimento = new ContaInvestimento();
			this.contas.add(investimento);
			break;
		}
	}

	public void encerrarConta() {

	}

	public void ContasToString() {
		
		for (Conta conta : contas) {
			System.out.println(conta.getTipo());
			System.out.println(conta.getNumero());
			System.out.println(conta.getSaldo());
			System.out.println(conta.getLimite());
			System.out.println(conta.getBanco());
			
		}
         
    }


}
