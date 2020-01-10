package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.cpf = "423.538.008-74";
		prof.matricula ="2131";
		prof.nome = "Luiz Carlos";
		prof.Rg = "49533783";
		
		Professor prof2 = new Professor();
		prof2.cpf = "432.457.163-84";
		prof2.matricula ="2132";
		prof2.nome = "Joao";
		prof2.Rg = "247373";
		
		prof.imprime();
		prof2.imprime();
	};

}
