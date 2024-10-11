package ProSit1.src;

public class Employe {
    protected String identifiant;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(String identifiant, String nom, String adresse, int nbrHeures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public void afficherDetails() {
        System.out.println("ID: " + identifiant);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Nombre d'heures: " + nbrHeures);
    }

    public double calculerSalaire() {
        return 0.0;
    }
}
