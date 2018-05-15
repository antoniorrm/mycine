package br.ufc.vv.mycine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.vv.mycine.model.Sessao;
import br.ufc.vv.mycine.repository.SessaoRepository;

@Service
public class SessaoService {
	
	@Autowired
	private SessaoRepository repository;
	
	public Sessao save(Sessao sessao) {
        return repository.saveAndFlush(sessao);
    }
	
	public List<Sessao> findAll() {
        return repository.findAll();
    }
	
    public Sessao findOne(Long id) {
    	Optional<Sessao> optional =  repository.findById(id);
    	if (optional.isPresent())
    		return optional.get();
    	else
    		return null;
    }       
     
    public void delete(Long id) {
        repository.deleteById(id);
    }

}