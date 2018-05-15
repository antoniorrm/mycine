package br.ufc.vv.mycine.controller;

import br.ufc.vv.mycine.model.Filme;

public interface FilmeController {

    Filme buscarFilmeId(int id);

    Filme buscarFilmeNome(String nome);

    Filme atualizarFilme(Filme filme);

    Filme addFilme(Filme filme);

    Filme removerFilme(int id);

}
