package br.com.unicuritiba.ProjectAluguel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.ProjectAluguel.models.Locacao;

public interface LocacaoRepository 
		extends JpaRepository<Locacao, Long> {

}
