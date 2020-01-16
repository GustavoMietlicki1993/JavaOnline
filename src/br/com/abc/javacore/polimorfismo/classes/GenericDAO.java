package br.com.abc.javacore.polimorfismo.classes;

//DAO significa: Data Access Object é um padrão para aplicações que utilizam persistência de dados, 
//onde tem a separação das regras de negócio das regras de acesso a banco de dados, implementada 
//com linguagens de programação orientadas a objetos.
public interface GenericDAO {
	public abstract void save();
}
