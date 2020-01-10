package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("AUDI", 275);
		Carro c3 = new Carro("MERCEDES", 290);
		Carro.velocidadeLimite = 220;
		c1.print();
		c2.print();
		c3.print();

	}

}
