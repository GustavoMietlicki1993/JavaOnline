package br.com.abc.javacore.polimorfismo.classes;

//DAO significa: Data Access Object � um padr�o para aplica��es que utilizam persist�ncia de dados, 
//onde tem a separa��o das regras de neg�cio das regras de acesso a banco de dados, implementada 
//com linguagens de programa��o orientadas a objetos.
public interface GenericDAO {
	public abstract void save();
}
