package br.com.bara.application.web_service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import br.com.bara.application.web_service.business.ContaBusiness;
import br.com.bara.application.web_service.config.SpringDataConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { SpringDataConfig.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
public class CursoSpringDataApplicationTests {

	@Autowired
	private ContaBusiness contaBusiness;

	@Test
	public void listarTodos() {
		contaBusiness.findAll();
	}

}
