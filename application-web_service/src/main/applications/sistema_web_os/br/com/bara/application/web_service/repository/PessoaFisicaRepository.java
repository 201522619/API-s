package br.com.bara.application.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bara.application.web_service.domain.PessoaFisica;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long>{

}
