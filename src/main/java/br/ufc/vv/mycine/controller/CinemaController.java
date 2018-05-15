package br.ufc.vv.mycine.controller;


import java.util.List;

import br.ufc.vv.mycine.model.Cinema;
import br.ufc.vv.mycine.model.Sala;



public interface CinemaController {
    //TODO Confirmar API

    Cinema addCinema(Cinema cinema);

    Cinema removerCinema(int id);

    Cinema atualizarCinema(Cinema cinema);

    Cinema buscarCinema(int id);

    List<Cinema> buscarTodosCinemas();

    boolean vincularSala(Sala sala);

    boolean desvincularSala(int id);

}
