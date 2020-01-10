package br.com.abc.javacore.associacao.classes;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno() {
	}

	public void print() {
		System.out.println("----------- RELATORIO DE ALUNOS -----------");
		System.out.println("nome do aluno: " + this.nome);
		System.out.println("idade: " + this.idade);
		if (this.seminario != null && seminario.	)
			System.out.println("seminario inscrito: " + this.seminario.getTitulo());
		else
			System.out.println("Aluno nao esta inscrito em nenhum seminario");
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

}
