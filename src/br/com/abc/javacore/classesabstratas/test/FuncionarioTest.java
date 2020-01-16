package br.com.abc.javacore.classesabstratas.test;

import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {

		Gerente g = new Gerente("Anna", "11122-2", 2000);
		Vendedor v = new Vendedor("Camila", "22211-4", 1500, 5000);

		g.calculaSalario();
		v.calculaSalario();
		System.out.println(v);
		System.out.println("\n-------------------------\n");
		System.out.println(g);
	}

}
