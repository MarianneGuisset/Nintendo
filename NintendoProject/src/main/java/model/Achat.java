package model;

import java.time.LocalDate;

public class Achat {
	private Jeu jeu;
	private LocalDate dateAchat;
	private double prix;
	
	public Achat(Jeu jeu, LocalDate dateAchat, double prix) {
		this.jeu = jeu;
		this.dateAchat = dateAchat;
		this.prix = prix;
	}
	
	public Jeu getJeu() {
		return jeu;
	}


	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}


	public LocalDate getDateAchat() {
		return dateAchat;
	}


	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", dateAchat=" + dateAchat + ", prix=" + prix + "]";
	}

}
