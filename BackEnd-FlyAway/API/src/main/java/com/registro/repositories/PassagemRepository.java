package com.registro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.model.Passagem;

@Repository
public interface PassagemRepository extends JpaRepository<Passagem, Long>{

}
