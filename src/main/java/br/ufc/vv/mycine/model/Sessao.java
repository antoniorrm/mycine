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
	
	
	
	@Override
	public String toString() {
		return "Sessao [id_secao=" + id_secao + ", filme=" + filme + ", sala=" + sala + ", horario=" + horario
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFim == null) ? 0 : dataFim.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((filme == null) ? 0 : filme.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result + ((id_secao == null) ? 0 : id_secao.hashCode());
		result = prime * result + ((sala == null) ? 0 : sala.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sessao other = (Sessao) obj;
		if (dataFim == null) {
			if (other.dataFim != null)
				return false;
		} else if (!dataFim.equals(other.dataFim))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (filme == null) {
			if (other.filme != null)
				return false;
		} else if (!filme.equals(other.filme))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		if (id_secao == null) {
			if (other.id_secao != null)
				return false;
		} else if (!id_secao.equals(other.id_secao))
			return false;
		if (sala == null) {
			if (other.sala != null)
				return false;
		} else if (!sala.equals(other.sala))
			return false;
		return true;
	}

	
}