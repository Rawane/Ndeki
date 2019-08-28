package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	@Column(name = "commande_id")
	private long commandeId;
	@Column(name = "numero_commande")
	private long numeroCommande;
	@Column(name = "total_remise")
	private double totalRemise;
	@Column(name = "total")
	private double total;
	@Column(name = "status_commande")
	private String statusCommande;
	@Column(name = "status_paiement")
	private String statusPaiement;
	@Column(name = "date_commande")
	private Date dateCommande;
	@Column(name = "moyen_paiement")
	private String moyenPaiement;
	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;

	public long getCommandeId() {
		return commandeId;
	}

	public void setCommandeId(long commandeId) {
		this.commandeId = commandeId;
	}

	public long getNumeroCommande() {
		return numeroCommande;
	}

	public void setNumeroCommande(long numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	public double getTotalRemise() {
		return totalRemise;
	}

	public void setTotalRemise(double totalRemise) {
		this.totalRemise = totalRemise;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStatusCommande() {
		return statusCommande;
	}

	public void setStatusCommande(String statusCommande) {
		this.statusCommande = statusCommande;
	}

	public String getStatusPaiement() {
		return statusPaiement;
	}

	public void setStatusPaiement(String statusPaiement) {
		this.statusPaiement = statusPaiement;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public String getMoyenPaiement() {
		return moyenPaiement;
	}

	public void setMoyenPaiement(String moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
