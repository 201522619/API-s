package br.com.bara.application.web_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class RestConfiguration {

	// http://howtodoinjava.com/spring/spring-restful/spring-rest-hello-world-json-example/
	//https://thinkster.io/http

	@Bean
	public View jsonTemplate() {
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		view.setPrettyPrint(true);
		return view;
	}
	
	@Bean
    public ViewResolver viewResolver() {
        return new BeanNameViewResolver();
    }

}
