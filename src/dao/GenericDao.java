package dao;

import java.util.List;

public interface GenericDao<Resultado> {
	
	void inserir(Resultado resultado);
	
	void alterar(Resultado resultado);
	
	void excluir(Integer concurso);
	
	Resultado buscar(Integer concurso);
	
	List<Resultado> listResultado();

}
