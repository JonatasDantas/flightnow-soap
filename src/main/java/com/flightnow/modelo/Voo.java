package com.flightnow.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "voo")
public class Voo {

	@Id
	private Integer id;
	private Float precoVoo;
	private String aeroportoSaida;
	private String aeroportoChegada;
	private String codigoAeroportoSaida;
	private String codigoAeroportoChegada;
	private Integer usuarioId;
	private Integer adultos;
	private Integer criancas;
	private String dataSaida;
	private String dataVolta;
	private String created_at;
	private String updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getPrecoVoo() {
		return precoVoo;
	}

	public void setPrecoVoo(Float precoVoo) {
		this.precoVoo = precoVoo;
	}

	public String getAeroportoSaida() {
		return aeroportoSaida;
	}

	public void setAeroportoSaida(String aeroportoSaida) {
		this.aeroportoSaida = aeroportoSaida;
	}

	public String getAeroportoChegada() {
		return aeroportoChegada;
	}

	public void setAeroportoChegada(String aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}

	public String getCodigoAeroportoSaida() {
		return codigoAeroportoSaida;
	}

	public void setCodigoAeroportoSaida(String codigoAeroportoSaida) {
		this.codigoAeroportoSaida = codigoAeroportoSaida;
	}

	public String getCodigoAeroportoChegada() {
		return codigoAeroportoChegada;
	}

	public void setCodigoAeroportoChegada(String codigoAeroportoChegada) {
		this.codigoAeroportoChegada = codigoAeroportoChegada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public Integer getAdultos() {
		return adultos;
	}

	public void setAdultos(Integer adultos) {
		this.adultos = adultos;
	}

	public Integer getCriancas() {
		return criancas;
	}

	public void setCriancas(Integer criancas) {
		this.criancas = criancas;
	}
}
