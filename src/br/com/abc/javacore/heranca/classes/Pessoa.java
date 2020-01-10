package br.com.abc.javacore.heranca.classes;

public class Pessoa extends Object {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;

	public Pessoa(String nome) {
		System.out.println("Dentro do constructor de pessoa.");
		this.nome = nome;
	}

	public Pessoa(String nome, String cpf) {
		this(nome);
		this.cpf = cpf;
	}

	static {
		System.out.println("Bloco de inicializacao estatico de pessoa.");
	}
	{
		System.out.println("Bloco de inicializacao de pessoa 1. ");
	}
	{
		System.out.println("Bloco de inicializacao de pessoa 2. ");
	}

	public void print() {
		System.out.println("Nome: " + nome);
		System.out.println("Cpf: " + cpf);
		System.out.println("Endereco: " + endereco.getRua() + ", " + endereco.getBairro());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
