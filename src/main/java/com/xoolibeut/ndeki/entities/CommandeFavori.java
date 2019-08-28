package com.xoolibeut.ndeki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CommandeFavori extends AuditInfo {
	@Id
	@GeneratedValue
	@Column(name = "commande_favori_id")
	private long commandeFavoriId;
	@ManyToOne
	@JoinColumn(name = "commande_id", nullable = false)
	private Commande commande;
	@Column(name = "repetition")
	private int repetition;

	public long getCommandeFavoriId() {
		return commandeFavoriId;
	}

	public void setCommandeFavoriId(long commandeFavoriId) {
		this.commandeFavoriId = commandeFavoriId;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getRepetition() {
		return repetition;
	}

	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}
}
