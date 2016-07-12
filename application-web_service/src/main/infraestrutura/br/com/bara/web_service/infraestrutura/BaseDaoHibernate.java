package br.com.bara.web_service.infraestrutura;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

public class BaseDaoHibernate<E> implements BaseDao<E> {
	
	protected Class<E> entidadeClasse;
	
	@PersistenceContext
	private EntityManager manager;
	
	private EntityManagerProducer producer;
	
	@SuppressWarnings("unchecked")
	public BaseDaoHibernate() {
		Class<?> clazz = getClass();
		while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
			clazz = clazz.getSuperclass();
		}
		
		ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericSuperclass();
		entidadeClasse = (Class<E>) parameterizedType.getActualTypeArguments()[0];
		
		producer = new EntityManagerProducer();
		this.manager = producer.createEntityManager();
		
	}
	
	@Override
	public E salvar(E entidade) {
		try {
			manager.getTransaction().begin();
			E obj = manager.merge(entidade);
			manager.getTransaction().commit();
			System.out.println("Objeto: "+entidade.toString()+ " salvo com sucesso!");
			return obj;
		}catch(RuntimeException e){
			if(manager.getTransaction().isActive() || manager.isOpen()){
				manager.getTransaction().rollback();
			}
			throw e;
		}finally{
			manager.close();
			manager.clear();
		}
	}
	
	@Override
	public void deletar(Long id) {
		try {
			manager.getTransaction().begin();
			E objeto = obterPorId(id);
			manager.remove(objeto);
			manager.getTransaction().commit();
		} catch (RuntimeException e) {
			if(manager.getTransaction().isActive() || manager.isOpen()){
				manager.getTransaction().rollback();
			}
			throw e;
		}finally{
			manager.close();
			manager.clear();
		}
	}

	@Override
	public List<E> listarTodos() {
		CriteriaQuery<E> query = manager.getCriteriaBuilder().createQuery(entidadeClasse);
		query.from(entidadeClasse);
		return manager.createQuery(query).getResultList();
	}

	@Override
	public E obterPorId(Long id) {
		return manager.find(entidadeClasse, id);
	}

	

}
