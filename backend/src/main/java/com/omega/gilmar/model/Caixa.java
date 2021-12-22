package com.omega.gilmar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;

@Entity
@Table(name = "caixa")
public class Caixa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@EqualsAndHashCode.Include
	private Long id;
	
	@NotBlank
	private String descricao;
}
