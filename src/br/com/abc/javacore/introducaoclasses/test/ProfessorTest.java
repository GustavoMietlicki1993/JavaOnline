package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.cpf = "42353800874";
		professor.Rg = "489702508";
		professor.nome = "Gustavo Mietlicki";
		professor.matricula = "2524";
		
		Professor professor2 = new Professor();
		professor2.cpf = "3623747748";
		professor2.Rg = "38593579";
		professor2.nome = "Guilherme Mietlicki";
		professor2.matricula = "2522";
		
		System.out.println(professor.cpf);
		System.out.println(professor.Rg);
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		
		System.out.println("\n---------------------------------------------\n");
		
		System.out.println(professor2.cpf);
		System.out.println(professor2.Rg);
		System.out.println(professor2.nome);
		System.out.println(professor2.matricula);
		
	};

}
