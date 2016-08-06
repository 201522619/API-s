package br.com.bara.application.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bara.application.web_service.domain.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
