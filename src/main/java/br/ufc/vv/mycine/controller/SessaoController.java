package br.ufc.vv.mycine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import br.ufc.vv.mycine.model.Sessao;
import br.ufc.vv.mycine.service.SessaoService;

import java.time.LocalDate;
import java.util.List;


@Controller
@RequestMapping("/sessoes")
public class SessaoController {

    @Autowired
    private SessaoService sService;

    @RequestMapping(path= "/listar", method = RequestMethod.GET)
    public List<Sessao> todas(){
        return sService.todas();
    }

    //TODO: Verificar um OK da galera para a mudança da assinatura dos métodos
    @RequestMapping(path= "/periodo", method = RequestMethod.GET)
    public List<Sessao> todasPorData(String dataInicio, String dataFim){
        LocalDate dateStart = LocalDate.parse(dataInicio);
        LocalDate dateEnd   = LocalDate.parse(dataFim);

        return sService.todasPorData(dateStart, dateEnd);
    }
//
//    public List<Sessao> todosPorCidade(String cidade){
//        return null;
//    }
//
//    public List<Sessao> todosPorFilme(String nomeFilme){
//        return null;
//    }
//
//    public List<Sessao> todosPorGenero(String genero){
//        return null;
//    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Sessao getSessaoPorId(int id){
        return sService.getSessaoPorId(id);
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public Sessao atualizarSessao(Sessao sessao){
        return sService.atualizarSessao(sessao);
    }

    @RequestMapping(path = "/salvar", method = RequestMethod.POST)
    public Sessao addSessao(Sessao sessao){
       return sService.addSessao(sessao);
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public Sessao removerSessao(int id){
        return sService.removerSessao(id);
    }
}
