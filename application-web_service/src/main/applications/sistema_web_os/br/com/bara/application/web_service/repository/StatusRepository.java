package br.com.bara.application.web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bara.application.web_service.domain.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{

}
