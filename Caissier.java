package ProSit1.src;

class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(String identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures <= 180 ? nbrHeures * 5 : (180 * 5) + (nbrHeures - 180) * 5 * 1.15;
        return salaire;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Numéro de caisse: " + numeroDeCaisse);
    }
}

class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(String identifiant, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Taux de vente: " + tauxDeVente);
    }
}

class Responsable extends Employe {
    private double prime;

    public Responsable(String identifiant, String nom, String adresse, int nbrHeures, double prime) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = nbrHeures <= 160 ? nbrHeures * 10 : (160 * 10) + (nbrHeures - 160) * 10 * 1.2;
        return salaireBase + prime;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Prime: " + prime);
    }
}
