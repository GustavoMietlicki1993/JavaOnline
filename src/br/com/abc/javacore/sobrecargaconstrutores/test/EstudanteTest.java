package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estudante = new Estudante("25235", "Gustavo", new double[] { 1.2, 3.0, 5.0 }, "06/01/2020. ");
		estudante.print2();
	}

}
