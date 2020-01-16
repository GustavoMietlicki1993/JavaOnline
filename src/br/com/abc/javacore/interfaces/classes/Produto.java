package br.com.abc.javacore.interfaces.classes;

//Interface vai dizer oque a classe deve fazer, mas nunca ira dizer como.
public class Produto implements Tributavel, Transportavel {
	private String nome;
	private double preco;
	private double peso;
	private double precoFinal;
	private double valorFrete;

	@Override
	public void calcularImposto() {
		this.precoFinal = this.preco + (this.preco * IMPOSTO);
	}

	@Override
	public void calculaFrete() {
		this.valorFrete = this.preco / peso * 0.1;
	}

	public Produto(String nome, double peso, double preco) {
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", peso=" + peso + ", precoFinal com imposto ="
				+ precoFinal + ", valorFrete=" + valorFrete + "]";
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
