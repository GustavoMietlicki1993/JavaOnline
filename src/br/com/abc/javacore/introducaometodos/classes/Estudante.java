package br.com.abc.javacore.introducaometodos.classes;

//Crie um metodo para imprimir os dados e tirar a média desse aluno 
//Caso a media for maior que 6 imprimir aprovado,  se não reprovado.
public class Estudante {
	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado;

	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		if (notas != null) {
			for (double nota : notas) {
				System.out.print(nota + ", ");
			}

		}
	}

	public void tirarMedia() {
		if (notas == null) {
			System.out.println("Esse aluno nao possui notas. ");
			return;
		}
		double media = 0;
		for (double nota : notas) {
			media += nota;
		}

		media = media / notas.length;

		if (media > 6) {
			aprovado = true;
			System.out.println("\nA media e: " + media + "\n.Aluno aprovado. ");
		} else {
			aprovado = false;
			System.out.println("\nA media é: " + media + " .Aluno reprovado. ");
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public double[] getNotas() {
		return this.notas;
	}

	public boolean isAprovado() {
		return this.aprovado;
	}
}
