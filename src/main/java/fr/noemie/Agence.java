package fr.noemie;

import java.util.ArrayList;


public class Agence {
    
    static Agence agenceNantes;
    static Agence agenceRennes;
    static Agence agenceBrest;
    
  public String nom;  
  public String nomCommercial;
  public Adresse adresse;
  ArrayList<Vehicule>stockDeVehicules;

  public Agence(String nom, String nomCommercial) {
      this.nom = nom;
      this.nomCommercial = nomCommercial;
      this.stockDeVehicules = new ArrayList<Vehicule>();
  }

 void ajouterAdresse(Adresse adresse){
this.adresse =adresse;
 } 
void ajouterClient(Client client){
    this.ajouterClient(client);
}
void ajouterVehicule(Vehicule vehicule){
this.stockDeVehicules.add(vehicule);
}

void afficherStock(){
    System.out.println("Stock");
    for (Vehicule vehicule : stockDeVehicules)
    {System.out.println(vehicule);
    vehicule.disponible = true;
    }
}

public String toString() {
    return "agence:" + this.nom + "-" + this.nomCommercial + " - " + this.adresse.ville;
}

static void creerAgenceNantes(){
    Adresse adresseNantes = new Adresse("rue de la pomme", "nantes", 44000);
     Agence agenceNantes = new Agence("Agence de Nantes", "Gino");
     agenceNantes.ajouterAdresse(adresseNantes);
     
     

     Voiture voitPetitPrix = new Voiture("renault", "rouge", 4, 100, "ess", 100, 5);
     Voiture voitureChere = new Voiture("JO", "vert", 4, 100, "ess", 100, 5);
     agenceNantes.ajouterVehicule(voitPetitPrix);
     agenceNantes.ajouterVehicule(voitureChere);
     // System.out.println(voitPetitPrix);


     agenceNantes.afficherStock(); 
    


}

static void creerAgenceRennes(){
    
     Adresse adresseRennes = new Adresse("rue du soleil", "rennes", 35000);
     Agence agenceRennes = new Agence("Agence de Rennes", "Barbie");
     agenceRennes.ajouterAdresse(adresseRennes);
     
    Client client = new Client("Pierre", 10);
     Voiture voitPetitPrix = new Voiture("renault", "rouge", 4, 100, "ess", 100, 5);
     Voiture voitureChere = new Voiture("JO", "vert", 4, 100, "ess", 100, 5);
     Velo veloElectric =new Velo("romeo", "jaune", 3, 10, "vtt", "enfant");
     agenceRennes.ajouterVehicule(voitPetitPrix);
     agenceRennes.ajouterVehicule(voitureChere);
     agenceRennes.ajouterVehicule(veloElectric);
     agenceRennes.ajouterClient(client);
     // System.out.println(voitPetitPrix);


     agenceRennes.afficherStock(); 
    




}


static void creerAgenceBrest(){
    
    Adresse adresseBrest = new Adresse("rue du sel", "brest", 29000);
    Agence agenceBrest = new Agence("Agence de Brest", "Bill");
    agenceBrest.ajouterAdresse(adresseBrest);
    

    Voiture voitPetitPrix = new Voiture("ford", "rouge", 4, 100, "ess", 100, 5);
    Voiture voitureChere = new Voiture("austin", "vert", 4, 100, "ess", 100, 5);
    Velo veloElectric =new Velo("fard", "gris", 3, 10, "vtt", "adult");
    agenceBrest.ajouterVehicule(voitPetitPrix);
    agenceBrest.ajouterVehicule(voitureChere);
    agenceBrest.ajouterVehicule(veloElectric);
    // System.out.println(voitPetitPrix);


    agenceBrest.afficherStock(); 

}
     static void reserverPremierVehicule(Client client) {
        Vehicule voiture = agenceNantes.stockDeVehicules.get(0);
        client.reservation = voiture;
        voiture.disponible = false;
        agenceNantes.afficherStock();  
}

}      



