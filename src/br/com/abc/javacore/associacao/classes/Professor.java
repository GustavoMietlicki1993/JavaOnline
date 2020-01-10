package br.com.abc.javacore.associacao.classes;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public Professor() {
	}

	public void print() {
		System.out.println("----------- RELATORIO DE PROFESSORES -----------");
		System.out.println("nome do professor: " + this.nome);
		System.out.println("especialidade: " + this.especialidade);
		if (seminarios != null && seminarios.length != 0) {
			for (Seminario seminario : seminarios) {
				System.out.println("seminario: " + seminario.getTitulo() + ", ");
			}
		}
		return;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
