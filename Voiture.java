package poo.semaine4.examen;

public class Voiture extends Vehicule {
	
	private String categorie;

	public Voiture(String nom, double vitesseMax, int poids, int niveauCarburant, String categorie) {
		super(nom, vitesseMax, poids, niveauCarburant);
		this.categorie = categorie;
	}

	public Voiture() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "voiture de = "+categorie;
	}
	
	public String getCategorie(){
		return categorie;
	}

}
