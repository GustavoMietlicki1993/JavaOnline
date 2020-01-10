package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante aluno = new Estudante();
		aluno.setNome("Gustavo");
		aluno.setIdade(26);
		aluno.setNotas(new double[] { 7.2, 8.1, 6.9 });
		aluno.print();
		aluno.tirarMedia();
		System.out.println("Aprovado? " + aluno.isAprovado());

	}
}
