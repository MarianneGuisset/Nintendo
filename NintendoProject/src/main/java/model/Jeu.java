package model;

import java.util.List;

public class Jeu {

	private String titre;
	private Console console;
	private String boutique;
	
	



	public Jeu(String titre, Console console, String boutique) {
		super();
		this.titre = titre;
		this.console = console;
		this.boutique = boutique;
	}



	public String getBoutique() {
		return boutique;
	}



	public void setBoutique(String boutique) {
		this.boutique = boutique;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public Console getConsole() {
		return console;
	}



	public void setConsole(Console console) {
		this.console = console;
	}



	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", console=" + console + ", boutique=" + boutique + "]";
	}



	
}
