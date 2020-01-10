package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(7, 8);
		double result = calc.divideDoisNumeros(12, 7);
		System.out.println(result);
		
		System.out.println("imprimindo dois numeros divididos: ");
		calc.imprimeDoisNumerosDivididos(20, 0);
		System.out.println("Continuando a execucao .. .. ... ");
		
		int[] numeros = {1,2,3,4,5};
		calc.somaArray(numeros);
		
	};
		

}
