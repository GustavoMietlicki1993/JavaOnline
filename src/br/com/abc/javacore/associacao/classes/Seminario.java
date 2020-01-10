package br.com.abc.javacore.associacao.classes;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;

	public Seminario(String titulo) {

		this.titulo = titulo;
	}

	public Seminario() {
	}

	public void print() {
		System.out.println("----------- RELATORIO DE SEMINARIOS -----------");
		System.out.println("titulo: " + this.titulo);
		if (alunos != null && alunos.length != 0) {
			System.out.println("Alunos participantes: ");
			for (Aluno aluno : alunos) {
				System.out.println(aluno.getNome());
			}
			return;
		}
		System.out.println("professor: " + this.professor.getNome());
		System.out.println("local, Rua: " + this.local.getRua() + ", bairro: " + this.local.getBairro());
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
