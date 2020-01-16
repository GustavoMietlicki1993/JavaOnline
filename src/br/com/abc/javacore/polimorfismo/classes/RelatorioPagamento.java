package br.com.abc.javacore.polimorfismo.classes;

public class RelatorioPagamento {

//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Gerando relatorio de pagamento para gerencia. ");
//		gerente.calcularPagamento();
//		System.out.println("Nome do gerente: " + gerente.getNome());
//		System.out.println("Salario desse mes: " + gerente.getSalario());
//	}
//
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Gerando relatorio de pagamento para Vendedor. ");
//		vendedor.calcularPagamento();
//		System.out.println("Nome do vendedor: " + vendedor.getNome());
//		System.out.println("Salario desse mes: " + vendedor.getSalario());
//	}

	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatorio de pagamento. ");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario desse mes: " + funcionario.getSalario());

	}
}
