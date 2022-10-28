package com.registro.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "passagem")
public class Passagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_passagem;
	
	@Column
    private String nome_passageiro;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_ida;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_volta;

	public Passagem() {
		super();
	}

	public Passagem(long id_passagem, String nome_passageiro, LocalDate data_ida, LocalDate data_volta) {
		super();
		this.id_passagem = id_passagem;
		this.nome_passageiro = nome_passageiro;
		this.data_ida = data_ida;
		this.data_volta = data_volta;
	}

	public long getId_passagem() {
		return id_passagem;
	}

	public void setId_passagem(long id_passagem) {
		this.id_passagem = id_passagem;
	}

	public String getNome_passageiro() {
		return nome_passageiro;
	}

	public void setNome_passageiro(String nome_passageiro) {
		this.nome_passageiro = nome_passageiro;
	}

	public LocalDate getData_ida() {
		return data_ida;
	}

	public void setData_ida(LocalDate data_ida) {
		this.data_ida = data_ida;
	}

	public LocalDate getData_volta() {
		return data_volta;
	}

	public void setData_volta(LocalDate data_volta) {
		this.data_volta = data_volta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_passagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passagem other = (Passagem) obj;
		return id_passagem == other.id_passagem;
	}

	@Override
	public String toString() {
		return "Passagem [id_passagem=" + id_passagem + ", nome_passageiro=" + nome_passageiro + ", data_ida="
				+ data_ida + ", data_volta=" + data_volta + "]";
	}
	
	
}
