package br.com.abc.javacore.enumeracao.classes;

public enum TipoCliente {
	// Constant specific class body

	PESSOA_FISICA(1, "PESSOA_FISICA"), PESSOA_JURIDICA(2, "PESSOA_JURIDICA") {
		public String getId() {
			return "B";
		}
	};

	private int tipo;
	private String nome;

	TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public String getId() {
		return "A";
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}
}
