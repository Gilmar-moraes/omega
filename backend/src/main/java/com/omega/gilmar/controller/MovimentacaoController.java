package com.omega.gilmar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.omega.gilmar.model.Movimentacao;
import com.omega.gilmar.repository.MovimentacaoRepository;

@RestController
@RequestMapping(value = "/movimentacao")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	@GetMapping
	public List<Movimentacao> listar(){
		return movimentacaoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Movimentacao adicionar(@RequestBody Movimentacao movimentacao) {
		return movimentacaoRepository.save(movimentacao);
	}
}
