package fr.noemie;

import java.util.ArrayList;

public class Vehicule {
        public String marque;
        public String couleur;
        public int niveauEnergie;
        public boolean disponible;
        public int niveauEnergieMax;
        
        
        ArrayList<Option> options;

        

public void remplir() {
    if (this.niveauEnergie == this.niveauEnergieMax){
        System.out.println("Ne pas refacturer le plein");
    }
    else {
        this.niveauEnergie = this.niveauEnergieMax;
        System.out.println("le plein + this.marque + est fait");
    }
}

public Vehicule(String marque, String couleur, int niveauEnergie, int niveauEnergieMax) {

    this.marque = marque;
    this.couleur = couleur;
    this.niveauEnergie = 0;
    this.disponible = false;
    this.niveauEnergieMax = niveauEnergieMax;
}

     
}
