package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class InfoClient extends Coordonnee {
	@Id
	@GeneratedValue
	@Column(name = "info_client_id")
	private long infoClientId;
	@Column(name = "marque_telephone")
	private String marqueTelephone;
	@Column(name = "model_telephone")
	private String modelTelephone;
	@Column(name = "quartier")
	private String quartier;
	@OneToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;

	public long getInfoClientId() {
		return infoClientId;
	}

	public void setInfoClientId(long infoClientId) {
		this.infoClientId = infoClientId;
	}

	public String getMarqueTelephone() {
		return marqueTelephone;
	}

	public void setMarqueTelephone(String marqueTelephone) {
		this.marqueTelephone = marqueTelephone;
	}

	public String getModelTelephone() {
		return modelTelephone;
	}

	public void setModelTelephone(String modelTelephone) {
		this.modelTelephone = modelTelephone;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

}
