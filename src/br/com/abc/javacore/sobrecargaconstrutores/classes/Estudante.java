package br.com.abc.javacore.sobrecargaconstrutores.classes;

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;

	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this(matricula, nome, notas);
		this.dataMatricula = dataMatricula;
	}

	public Estudante() {
		System.out.println("Apenas um teste");
	}

	public void print() {
		System.out.println(this.matricula);
		System.out.println(this.nome);
		for (double nota : notas) {
			System.out.println(nota + ", ");
		}
	}
	public void print2() {
		this.print();
		System.out.println(dataMatricula);
	}

	private String getMatricula() {
		return matricula;
	}

	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private double[] getNotas() {
		return notas;
	}

	private void setNotas(double[] notas) {
		this.notas = notas;
	}

	private void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	private String getDataMatricula() {
		return dataMatricula;
	}

}
