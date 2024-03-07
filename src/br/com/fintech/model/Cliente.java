package br.com.fintech.model;

import java.util.ArrayList;

public class Cliente {
	
	private String nome;
	private String email;
	private String cpf;
	private ArrayList<Conta> contas;
	
	public Cliente(String nome, String email, String cpf, ArrayList<Conta> contas) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.contas = contas;
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
	
	public void criarConta(){
		
	}
	
	public void encerrarConta() {
		
	}
	
}
