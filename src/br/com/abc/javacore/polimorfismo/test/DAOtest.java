package br.com.abc.javacore.polimorfismo.test;

import br.com.abc.javacore.polimorfismo.classes.ArquivoDAOimpl;
import br.com.abc.javacore.polimorfismo.classes.DataBaseDAOimpl;
import br.com.abc.javacore.polimorfismo.classes.GenericDAO;

public class DAOtest {
	public static void main(String[] args) {
		GenericDAO dao = new DataBaseDAOimpl();
		dao.save();
	}
}
