package br.ufc.vv.mycine.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufc.vv.mycine.model.Sessao;


@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long>{

}