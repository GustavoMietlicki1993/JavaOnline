package br.com.abc.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
	public static void main(String[] agrs) {
		criarArquivo();

	}

	public static void criarArquivo() {
		File file = new File("Teste.txt");
		try {
			System.out.println("O arquivo foi criado? " + file.createNewFile());
			System.out.println("Arquivo criado. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
