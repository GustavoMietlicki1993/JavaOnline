package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.init("Chica Da Silva. ", "235.363.856-74", 4.500, "48970250-8");
		funcionario.print();

	}

}
