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

import com.omega.gilmar.model.Caixa;
import com.omega.gilmar.repository.CaixaRepository;

@RestController
@RequestMapping(value = "/caixas")
public class CaixaController {

	@Autowired 
	private CaixaRepository caixaRepository;
	
	
	@GetMapping
	public List<Caixa> listar(){
		return caixaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Caixa adicionar(@RequestBody Caixa caixa) {
		return caixaRepository.save(caixa);
	}
}
