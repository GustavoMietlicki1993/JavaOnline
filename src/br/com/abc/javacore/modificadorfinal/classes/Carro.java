package br.com.abc.javacore.modificadorfinal.classes;

public class Carro {
	private final Comprador COMPRADOR = new Comprador();
	private String nome;
	private String marca;
	private static final double VELOCIDADE_FINAL = 250;

	@Override
	public String toString() {
		return "Carro: {" + "nome: " + nome + '\'' + ", marca: " + marca + '\'' + '}';
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Comprador getComprador() {
		return COMPRADOR;
	}

}
