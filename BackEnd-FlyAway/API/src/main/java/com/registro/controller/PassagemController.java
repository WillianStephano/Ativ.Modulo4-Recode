package com.registro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.model.Passagem;
import com.registro.service.PassagemService;


@RestController
@RequestMapping(value = "/passagem")
@CrossOrigin("*")
public class PassagemController {
	
	@Autowired
	private PassagemService service;
	
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Passagem> findById(@PathVariable Long id) { 
		Passagem passagem = service.findById(id);
		return ResponseEntity.ok().body(passagem);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Passagem>> findAll() { 
		List<Passagem> passagem = service.findAll();
		return ResponseEntity.ok().body(passagem);
	}
	

	@PostMapping
	public ResponseEntity<Passagem> save(@RequestBody Passagem passagem) { 
		Passagem obj = service.save(passagem);
		return ResponseEntity.ok().body(obj);
	}
	
	
	@PutMapping
	public ResponseEntity<Passagem> update(@RequestBody Passagem passagem) { 
		Passagem obj = service.update(passagem);
		return ResponseEntity.ok().body(obj);
	}
	
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) { 
		service.deletePassagem(id);
		return ResponseEntity.noContent().build();
	}
	
}