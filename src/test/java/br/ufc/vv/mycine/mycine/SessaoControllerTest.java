package br.ufc.vv.mycine.mycine;

import static org.mockito.Mockito.when;

import java.sql.Time;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import br.ufc.vv.mycine.controller.SessaoController;
import br.ufc.vv.mycine.model.Sala;
import br.ufc.vv.mycine.model.Sessao;
import br.ufc.vv.mycine.service.SessaoService;

@RunWith(SpringRunner.class)
@WebMvcTest(SessaoController.class) // ISSO É SÓ PARA CONTROLLER
public class SessaoControllerTest {

	@TestConfiguration
	static class SessaoControllerTestContextConfiguration {
		@Bean
		public SessaoController sessaoService() {
			return new SessaoController();
		}
	}

	@MockBean
	SessaoService sService;

	@Autowired
	SessaoController sController;

	@Before
	public void before() {
	}

	@Test
	public void givenA_whenCadastrar_thenReturnA() throws Exception {

		Sessao a = new Sessao();
		a.setHorario(new Time(12, 22, 00));

		when(sService.save(a)).thenReturn(a);

		String uri = sController.salvarSessao(a);
		// Tem que verificar todos os dados possíveis no ModelAndView
		// Redirecionamentos, dados injetados na página
		Assert.assertEquals("/listar/", uri);
	}

}
