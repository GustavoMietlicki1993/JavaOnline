package br.com.abc.javacore.interfaces.classes;

//Todos os metodos de uma interface sao considerados publics and abstracts.

//Todos os atributos dentro de uma interface sao public, statics and final(constantes).

//Enquanto as classes sao extends, as interfaces sao implements.

public interface Tributavel {
	public static final double IMPOSTO = 0.2;

	void calcularImposto();
}
