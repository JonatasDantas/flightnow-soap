package com.flightnow.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "vooPassageiro")
public class VooPassageiro {

	@Id
	private Integer id;
	private Integer vooId;
	private Integer usuarioId;
	private Integer poltrona;
	private String created_at;
	private String updated_at;
	private Integer adultos;
	private Integer criancas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVooId() {
		return vooId;
	}

	public void setVooId(Integer vooId) {
		this.vooId = vooId;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Integer getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(Integer poltrona) {
		this.poltrona = poltrona;
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
