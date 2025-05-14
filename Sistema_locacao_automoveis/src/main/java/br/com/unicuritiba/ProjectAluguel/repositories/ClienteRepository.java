package br.com.unicuritiba.ProjectAluguel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.ProjectAluguel.models.Cliente;

public interface ClienteRepository 
		extends JpaRepository<Cliente, Long> {

}
