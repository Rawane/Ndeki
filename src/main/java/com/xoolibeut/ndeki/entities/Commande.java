package com.xoolibeut.ndeki.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Commande {
	@Id
	@GeneratedValue
	private long commandeId;
	private long numeroCommande;
	private double totalRemise;
	private double total;
	private String statusCommande;
	private String statusPaiement;
	private Date dateCommande;
	private String moyenPaiement;
	@ManyToOne
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
