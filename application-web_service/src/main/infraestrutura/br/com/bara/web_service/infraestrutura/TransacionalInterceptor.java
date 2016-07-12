package br.com.bara.web_service.infraestrutura;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@Interceptor
@Transacional
@Priority(Interceptor.Priority.APPLICATION + 1)
public class TransacionalInterceptor implements Serializable {
	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	
	private EntityManagerProducer producer;

	@AroundInvoke
	public Object invoke(InvocationContext context) throws Exception {
		
		producer = new EntityManagerProducer();
		this.manager = producer.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		boolean iniciouTransacao = false;

		try {
			if (!trx.isActive()) {
				trx.begin();
				trx.rollback();

				trx.begin();
				iniciouTransacao = true;
			}
			return context.proceed();
		} catch (Exception e) {
			if (trx != null && iniciouTransacao) {
				trx.rollback();
			}
			throw e;
		} finally {
			if (trx != null && trx.isActive() && iniciouTransacao) {
				trx.commit();
			}
		}
	}
}
