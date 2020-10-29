package fr.noemie;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Agence.creerAgenceNantes();
        creerClientEtReserver();
    }
     
     private static void creerClientEtReserver() {
    }

    static void creerReserverClient() {
         Client clientRiche = new Client ("Noemie",0000);
         Agence.reserverPremierVehicule(clientRiche);
     } 
     
}
