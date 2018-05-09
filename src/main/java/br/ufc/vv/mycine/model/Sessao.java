package br.ufc.vv.mycine.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

@Entity
public class Sessao {
	
	@Id
	@SequenceGenerator(name = "sessao_seq", sequenceName = "sessao_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sessao_seq")
	private Long id_secao;
	
	@ManyToOne
	@JoinColumn(name = "id_filme")
	private Filme filme;
	
	@ManyToOne
	@JoinColumn(name = "id_sala")
	private Sala sala;
	
	@Column(nullable = false)
	@NotBlank(message = "Horario da sessão é uma informação obrigatória")
	private Time horario;
	
	@Column(nullable = false)
	@NotBlank(message = "Início da sessão é uma informação obrigatória")
	private Date dataInicio;
	
	@Column(nullable = false)
	@NotBlank(message = "Fim da sessão é uma informação obrigatória")
	private Date dataFim;
	
	public Long getId_secao() {
		return id_secao;
	}
	public void setId_secao(Long id_secao) {
		this.id_secao = id_secao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public Time getHorario() {
		return horario;
	}
	public void setHorario(Time horario) {
		this.horario = horario;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}