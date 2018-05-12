package br.ufc.vv.mycine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="/sessao/")
public class SessaoController {

	@RequestMapping(path="/")
	public String index() {
		return "index";
	}
	
}
