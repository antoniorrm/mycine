package br.ufc.vv.mycine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.ufc.vv.mycine.repository.SessaoRepository;

@Controller 
public class SessaoController {

	@Autowired
	private SessaoRepository repository;
}
