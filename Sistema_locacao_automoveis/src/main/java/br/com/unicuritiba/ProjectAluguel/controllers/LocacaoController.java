package br.com.unicuritiba.ProjectAluguel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.ProjectAluguel.models.Locacao;
import br.com.unicuritiba.ProjectAluguel.repositories.LocacaoRepository;

@RestController
public class LocacaoController {

	@Autowired
	LocacaoRepository repository;
	
	@GetMapping("/locacao")
	public ResponseEntity<List<Locacao>> getLocacao(){
		return ResponseEntity.ok(repository.findAll());	
	}

	@GetMapping("/locacao/{id}")
	public ResponseEntity<Locacao> getLocacao(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id).get());}
	
	@PostMapping("/locacao")
	public ResponseEntity<Locacao> saveLocacao(
			@RequestBody Locacao locacao){
		Locacao savedLocacao = repository.save(locacao);
		return ResponseEntity.ok(savedLocacao);
	}
	
	@DeleteMapping("/locacao/{id}")
	public void removeLocacao(@PathVariable long id) {
		 repository.deleteById(id);
	}
	
	@PutMapping("/locacao/{id}")
	public ResponseEntity<Locacao> updateLocacao(@PathVariable long id,
			@RequestBody Locacao locacao) {
		locacao.setId(id);
		Locacao savedLocacao = repository.save(locacao);
		return ResponseEntity.ok(savedLocacao);
	}
}
