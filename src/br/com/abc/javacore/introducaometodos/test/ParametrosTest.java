package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		int num1 = 5;
		int num2 = 15;
		calc.alterarDoisNumeros(num1, num2);
		
		System.out.println("Dentro do teste: \n");
		System.out.println("\nnum1: "+num1);
		System.out.println("\nnum1: "+num2);
	};

}
