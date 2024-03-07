package br.com.fintech.model;

import java.util.ArrayList;

public class Conta {
	
	private Integer numero;
	private Double saldo;
	private Double limite;
	private ArrayList<Transacao> extrato;
	private String banco;
	
	public Conta(Integer numero, Double saldo, Double limite, ArrayList<Transacao> extrato, String banco) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.extrato = extrato;
		this.banco = banco;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public ArrayList<Transacao> getExtrato() {
		return extrato;
	}
	public void setExtrato(ArrayList<Transacao> extrato) {
		this.extrato = extrato;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}

}
