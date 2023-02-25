package poo.semaine4.examen;

public class Vehicule {

	private String nom;
    private double vitesseMax;
    private int poids;
    private int niveauCarburant;

    Vehicule(String nom, double vitesseMax, int poids, int niveauCarburant) {
       this.nom = nom;
       this.vitesseMax = vitesseMax;
       this.poids = poids;
       this.niveauCarburant = niveauCarburant;
   }
   Vehicule(){
       this.nom = "Anonyme";
       this.vitesseMax = 130;
       this.poids = 1000;
       this.niveauCarburant = 0;
   }
   @Override
   public String toString(){
       return nom+" -> vitesse max = "+vitesseMax+" km/h, poids = "+poids+" kg";
   }
   public boolean meilleur(Vehicule autreVehicule){
      if(this.vitesseMax > autreVehicule.vitesseMax){
          return true;
      }else {
          return false;
      }
   }
   public String getNom(){
     return nom;
   }
   public double getVitesseMax(){
     return vitesseMax;
   }
   public int getPoids(){
     return poids;
   }
   public int getNiveauCarburant(){
     return niveauCarburant;
   }

   public double performance() {
     return poids/vitesseMax;
   }
   public boolean estDeuxRoues() {
	   return false;
   }
}
