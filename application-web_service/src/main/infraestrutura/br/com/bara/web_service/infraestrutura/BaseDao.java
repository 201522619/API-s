package br.com.bara.web_service.infraestrutura;

import java.util.List;

public interface BaseDao<E> {

	E salvar(E entidade);
	
	void deletar(Long id);

	List<E> listarTodos();

	E obterPorId(Long id);

}