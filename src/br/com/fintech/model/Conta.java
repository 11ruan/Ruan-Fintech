package br.com.fintech.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private int tipo;
	private Integer numero;
	private Double saldo;
	private Double limite;
	private List<Transacao> extrato;
	private String banco;
	
	public Conta() {
		
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
