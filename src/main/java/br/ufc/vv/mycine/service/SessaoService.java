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

//package br.ufc.vv.mycine.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import br.ufc.vv.mycine.model.Sessao;
//import br.ufc.vv.mycine.repository.SessaoRepository;
//
//@Service
//public class SessaoService {
//	
//	@Autowired
//	private SessaoRepository repository;
//	
//	public Sessao save(Sessao sessao) {
//        return repository.saveAndFlush(sessao);
//    }
//	
//	public List<Sessao> findAll() {
//        return repository.findAll();
//    }
//	
//    public Sessao findOne(Long id) {
//    	Optional<Sessao> optional =  repository.findById(id);
//    	if (optional.isPresent())
//    		return optional.get();
//    	else
//    		return null;
//    }       
//     
//    public void delete(Long id) {
//        repository.deleteById(id);
//    }
//    
//    public Sessao atualiza(Sessao sessao) {
//        return repository.saveAndFlush(sessao);
//    }
//
//    public Sessao getSessao(Long id) {
//    	return repository.getOne(id);
//    }
//    
//}
//>>>>>>> branch 'master' of git@github.com:antoniorrm/mycine.git
