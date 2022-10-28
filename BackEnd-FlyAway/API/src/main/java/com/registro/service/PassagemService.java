package com.registro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.model.Passagem;
import com.registro.repositories.PassagemRepository;
import com.registro.service.exception.ObjectNotFoundException;

@Service
public class PassagemService {
	
	@Autowired
	private PassagemRepository passagemRepo;
	
	public Passagem findById(Long id) {
		Optional<Passagem> passagem = passagemRepo.findById(id);
		return passagem.orElseThrow(() -> new ObjectNotFoundException("Objeto com id: " + id + " Não foi encontrado. Tipo: " + Passagem.class.getName()));
	}
	
	public List<Passagem> findAll(){
		return passagemRepo.findAll();
	}
	
	public Passagem save(Passagem passagem) {
		return passagemRepo.save(passagem);
	}
	
	public Passagem update(Passagem passagem) {
		findById(passagem.getId_passagem());
		return passagemRepo.save(passagem);
	}
	
	public void deletePassagem(Long id) {
    	passagemRepo.deleteById(id);
    }

}
