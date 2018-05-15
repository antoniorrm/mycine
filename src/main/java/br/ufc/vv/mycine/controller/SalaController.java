package br.ufc.vv.mycine.controller;

import br.ufc.vv.mycine.model.Sala;

public interface SalaController {

    Sala addSala(Sala sala);

    Sala removerSala(int id);

    Sala atualizarSala(Sala sala);

    Sala buscarSalaId(int id);

    Sala buscarSalaNome(String nome);

}
