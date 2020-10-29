package fr.noemie;

public class Voiture extends Vehicule {
    public String typeCarburant;
    public int kilometrage;
    public int nbPlaces;

    

    
    
	public String toString() {
        return "voiture: " + this.marque + "-" + this.couleur + "-" + (this.disponible?"oui":"non");}
    
    

    public Voiture(String marque, String couleur, int niveauEnergie, int niveauEnergieMax,
			String typeCarburant, int kilometrage, int nbPlaces) {
		super(marque, couleur, niveauEnergie, niveauEnergieMax);
		this.typeCarburant = typeCarburant;
		this.kilometrage = kilometrage;
		this.nbPlaces = nbPlaces;
    }
}