package com.omega.gilmar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@EqualsAndHashCode.Include
	private Long id;
	
	@NotBlank
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date data;
	
	@NotBlank
	private Tipo tipo;
	
	@OneToMany
    @JoinColumn(name = "caixa_id")
	private Caixa caixa;
	
	@NotBlank
	private String descricao;
	
	@NotBlank
	@NumberFormat(pattern = "0.00")
	private double valor;
}
