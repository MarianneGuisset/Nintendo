package model;

 public abstract class Console {

	private String nom;
	private double prix;
	private String dateSortie;

	public Console(String nom, double prix, String dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}
	
	
//gregrez
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public String getDateSortie() {
		return dateSortie;
	}



	public void setDateSortie(String dateSortie) {
		this.dateSortie = dateSortie;
	}



	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}


	
}
