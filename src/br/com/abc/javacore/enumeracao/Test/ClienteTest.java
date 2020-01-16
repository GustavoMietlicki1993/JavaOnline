package br.com.abc.javacore.enumeracao.Test;

import br.com.abc.javacore.enumeracao.classes.Cliente;
import br.com.abc.javacore.enumeracao.classes.TipoCliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.A_VISTA);
		System.out.println(TipoCliente.PESSOA_FISICA.getId());
		System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
	}
}
