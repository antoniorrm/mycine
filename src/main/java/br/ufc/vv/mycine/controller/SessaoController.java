package br.ufc.vv.mycine.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.ufc.vv.mycine.model.Sessao;
import br.ufc.vv.mycine.service.SessaoService;


@Controller
@RequestMapping(path="/sessao/")
public class SessaoController {

	@Autowired
	private SessaoService service;
	
	@RequestMapping(path="/")
	public String index() {
		return "index";
	}

	@RequestMapping(path="/listar")
	public ModelAndView listarSessao(){
		ModelAndView model = new ModelAndView("sessoes");
		List<Sessao> sessoes= service.findAll();
		model.addObject("jogadores", sessoes);
		return model;
	}
	
	
	@RequestMapping(path="/salvar", method=RequestMethod.POST)
	public String salvarSessao(Sessao sessao){
		service.save(sessao);
		return "redirect:/listar/";
	}
	
}
