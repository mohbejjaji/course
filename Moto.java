package poo.semaine4.examen;

public class Moto extends Vehicule {
	
	private boolean sideCar;

	public Moto(String nom, double vitesseMax, int poids, int niveauCarburant, boolean sideCar) {
		super(nom, vitesseMax, poids, niveauCarburant);
		this.sideCar = sideCar;
	}
	
	Moto(String nom, double vitesseMax, int poids, int niveauCarburant) {
		super(nom, vitesseMax, poids, niveauCarburant);
	}

	public Moto() {
	
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		if(!sideCar){
			return "Moto, avec sideCar";
		}else {
			return "Moto";
		}
	}
	

}
