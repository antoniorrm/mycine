package br.ufc.vv.mycine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.vv.mycine.model.Sessao;
import br.ufc.vv.mycine.repository.SessaoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository repository;

    public List<Sessao> todas(){
       return repository.findAll();
    }

    public List<Sessao> todasPorData(LocalDate dataInicio, LocalDate dataFim){
        return repository.findByDataInicioGreaterThanEqualAndDataFimLessThanEqual(dataInicio, dataFim);
    }

    public List<Sessao> todosPorCidade(String cidade){
        return null;
    }

    public List<Sessao> todosPorFilme(String nomeFilme){
        return null;
    }

    public List<Sessao> todosPorGenero(String genero){
        return null;
    }

    public Sessao getSessaoPorId(int id){
        return repository.getOne(Integer.valueOf(id));
    }

    public Sessao atualizarSessao(Sessao sessao){
        return repository.save(sessao);
    }

    public Sessao addSessao(Sessao sessao){

        return repository.save(sessao);
    }

    public Sessao removerSessao(int id){
        Sessao s = this.getSessaoPorId(id);

        if(s != null){
            repository.deleteById(Integer.valueOf(id));
            return s;
        }

        return null;
    }
}
