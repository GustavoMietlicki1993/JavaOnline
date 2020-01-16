package br.com.abc.javacore.classesabstratas.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;

	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}

	public Vendedor() {

	}
	

	

	@Override
	public void calculaSalario() {
		this.salario = salario + (totalVendas * 0.05);

	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

}