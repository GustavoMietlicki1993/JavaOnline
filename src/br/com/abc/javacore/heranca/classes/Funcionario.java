package br.com.abc.javacore.heranca.classes;

//(HERANÇA) A classe funcionario é uma pessoa. É uma sub classe da classe pessoa.
public class Funcionario extends Pessoa {

	private double salario;
	static {
		System.out.println("Bloco de inicilizacao estatio de Funcionario.");
	}
	{
		System.out.println("Bloco de inicilizacao de Funcionario 1. ");
	}
	{
		System.out.println("Bloco de inicilizacao de Funcionario 2.");
	}

	public Funcionario(String nome) {
		super(nome);
	}

	public void print() { 
		super.print();
		System.out.println("salario: " + this.salario);
		imprimeReciboDePagamento();
	}

	public void imprimeReciboDePagamento() {
		System.out.println("Eu " + super.nome + ", recebi o pagamento de " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
