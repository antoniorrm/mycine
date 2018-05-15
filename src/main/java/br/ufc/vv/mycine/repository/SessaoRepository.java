package br.ufc.vv.mycine.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.vv.mycine.model.Sessao;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Integer>{

    List<Sessao> findByDataInicioGreaterThanEqualAndDataFimLessThanEqual(LocalDate dataInicio, LocalDate dataFim);

}
