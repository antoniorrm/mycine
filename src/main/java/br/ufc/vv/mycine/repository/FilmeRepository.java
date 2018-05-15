package br.ufc.vv.mycine.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.vv.mycine.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
