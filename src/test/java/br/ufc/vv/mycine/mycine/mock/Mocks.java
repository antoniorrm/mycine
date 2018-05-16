package br.ufc.vv.mycine.mycine.mock;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.ufc.vv.mycine.MycineApplication;
import br.ufc.vv.mycine.controller.CinemaController;
import br.ufc.vv.mycine.controller.FilmeController;
import br.ufc.vv.mycine.controller.SalaController;
import br.ufc.vv.mycine.model.Cinema;
import br.ufc.vv.mycine.model.Filme;
import br.ufc.vv.mycine.model.Sala;

public class Mocks {

    static{
        MockitoAnnotations.initMocks(MycineApplication.class);
    }

    public static FilmeController getFilmeControllerMock(){
        FilmeController filmeController = Mockito.mock(FilmeController.class);

        Filme filme = new Filme(1, "DJ");

        Mockito.when(filmeController.buscarFilmeId(1)).thenReturn(filme);

        return filmeController;
    }

    public static SalaController getSalaControllerMock(){
        SalaController salaController = Mockito.mock(SalaController.class);

        Mockito.when(salaController.buscarSalaId(1)).thenReturn(new Sala(1));

        return salaController;
    }

    public static CinemaController getCinemaControllerMock(){
        CinemaController cinemaController = Mockito.mock(CinemaController.class);

        Mockito.when(cinemaController.buscarCinema(1)).thenReturn(new Cinema());

        return cinemaController;
    }
}