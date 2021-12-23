package com.omega.gilmar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Column(name = "codigo_movimentacao")
	private Long id;
	
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date data;
	
	@NotBlank
	private String tipo;
	
	@ManyToOne
    @JoinColumn(name = "caixa_id")
	private Caixa caixa_id;
	
	@NotBlank
	private String descricao;
	
	@NotNull
	@NumberFormat(pattern = "0.00")
	private double valor;
}
