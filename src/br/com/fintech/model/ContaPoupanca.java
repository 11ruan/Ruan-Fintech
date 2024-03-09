package br.com.fintech.model;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta{
	
	private int tipo;
	private Integer numero;
	private Double saldo;
	private Double limite;
	private List<Transacao> extrato;
	private String banco;
	
	public ContaPoupanca() {
		this.tipo = 2;
		this.numero = this.getNumero();
		this.saldo = 0.0;
		this.limite = 0.0;
		this.extrato = new ArrayList<>();
		this.banco = "P";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public List<Transacao> getExtrato() {
		return extrato;
	}

	public void setExtrato(List<Transacao> extrato) {
		this.extrato = extrato;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
}
