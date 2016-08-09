package br.com.bara.application.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bara.application.web_service.domain.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
