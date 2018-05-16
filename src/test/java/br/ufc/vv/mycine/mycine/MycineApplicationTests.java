package br.ufc.vv.mycine.mycine;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import br.ufc.vv.mycine.controller.SessaoController;
import br.ufc.vv.mycine.model.Sessao;
import br.ufc.vv.mycine.mycine.mock.Mocks;
import br.ufc.vv.mycine.service.FilmeService;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.AssertTrue;
import java.time.LocalDate;
import java.time.LocalTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MycineApplicationTests {

	@Autowired
	private SessaoController controller;
	
//	@Mock
//	FilmeService filmeServicemMock;
//	
//	 FilmeController filmeController = Mockito.mock(FilmeController.class);
//
//     Filme filme = new Filme(1, "DJ");
//
//     Mockito.when(filmeController.buscarFilmeId(1)).thenReturn(filme);
//
//     return filmeController;
//	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void contextLoads() {
	}

	@Test
	public void verificarAdicaoDeSessao(){
		Sessao sessaoEsperada = new Sessao(Mocks.getFilmeControllerMock().buscarFilmeId(1),
				Mocks.getSalaControllerMock().buscarSalaId(1),
				LocalTime.of(18, 30),
				LocalDate.of(2018,05,01),
				LocalDate.of(2018,05,15));
		System.out.println(sessaoEsperada);

		Sessao sessaoRetornada = controller.addSessao(sessaoEsperada);

		Assert.assertEquals(sessaoEsperada, sessaoRetornada);
	}
//
//	@Test
//	public void verificarSeRetornaErroNaAdicaoDeSessao(){
//		Sessao sessaoEsperada = new Sessao(Mocks.getFilmeControllerMock().buscarFilmeId(5),
//				Mocks.getSalaControllerMock().buscarSalaId(1),
//				LocalTime.of(19, 30),
//				LocalDate.of(2018,06,01),
//				LocalDate.of(2018,06,15));
//
//		thrown.expect(ConstraintViolationException.class);
//	}
//
//	@Test
//	public void verificarSeRetornaUmaSessaoCorretamente(){
//		int idSessaoDesejada = 13;
//		Sessao sessaoRecebida = controller.getSessaoPorId(idSessaoDesejada);
//
//		Assert.assertEquals(sessaoRecebida.getId(), idSessaoDesejada);
//	}
//
//	@Test
//	public void verificarSeRetornaUmaSessaoCorretamente(){
//		int idSessaoDesejada = 13;
//		Sessao sessaoRecebida = controller.getSessaoPorId(idSessaoDesejada);
//
//		Assert.assertEquals(sessaoRecebida.getId(), idSessaoDesejada);
//	}

	
	

}
