package br.com.abc.javacore.blocodeinicializacao.test;

import br.com.abc.javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println("Exibindo a quantidade de parcelas possiveis. ");
		for (int parcela : c.getParcelas()) {
			System.out.println(parcela + " ");
		}

	}
}
