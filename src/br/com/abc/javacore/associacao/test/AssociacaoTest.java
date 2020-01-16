package br.com.abc.javacore.associacao.test;

import br.com.abc.javacore.associacao.classes.Aluno;
import br.com.abc.javacore.associacao.classes.Local;
import br.com.abc.javacore.associacao.classes.Professor;
import br.com.abc.javacore.associacao.classes.Seminario;

public class AssociacaoTest {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Gustavo Mietlicki", 26);
		Aluno aluno2 = new Aluno("Francine Silva", 25);

		Seminario seminario = new Seminario("Como ser um baita programador e ficar rico");
		Professor prof = new Professor("Yoda", "Usar a força para programar. ");
		Local local = new Local("Rua das araras", "mato");

		aluno.setSeminario(seminario);
		aluno2.setSeminario(seminario);

		seminario.setProfessor(prof);
		seminario.setLocal(local);
		seminario.setAlunos(new Aluno[] { aluno, aluno2 });

		Seminario[] semArray = new Seminario[1];
		semArray[0] = seminario;
		prof.setSeminarios(semArray);

		seminario.print();
		aluno.print();
		aluno2.print();
		local.print();
	}

}
