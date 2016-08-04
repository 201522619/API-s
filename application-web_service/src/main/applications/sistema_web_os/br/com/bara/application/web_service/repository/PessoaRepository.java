package br.com.bara.application.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bara.application.web_service.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
