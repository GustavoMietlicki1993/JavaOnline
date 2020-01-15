package br.com.abc.javacore.enumeracao.classes;

public class Cliente {
	public enum TipoPagamento {

		A_VISTA, A_PRAZO;
	}

	private String nome;
	private TipoCliente tipo;
	private TipoPagamento tipoPagamento;

	public Cliente(String nome, TipoCliente tipo) {

		this.nome = nome;
		this.tipo = tipo;

	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo=" + tipo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

}
