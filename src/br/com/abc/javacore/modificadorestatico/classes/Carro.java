package br.com.abc.javacore.modificadorestatico.classes;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	public static double velocidadeLimite = 240;

	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Carro() {

	}

	public void print() {
		System.out.println("-----------------------------------");
		System.out.println("nome: " + this.nome);
		System.out.println("velocidade maxima: " + this.velocidadeMaxima);
		System.out.println("vlocidade limite: " + this.velocidadeLimite);
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	private void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	private static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	private static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}

}
