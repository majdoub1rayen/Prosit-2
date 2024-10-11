package ProSit1.src;

public class Magasin {
    private String identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nombreProduits;
    private Employe[] employes;
    private int nombreEmployes;

    public Magasin(String identifiant, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.employes = new Employe[20];  // Max 20 employees
        this.nombreProduits = 0;
        this.nombreEmployes = 0;
    }

    public void ajouterProduit(Produit produit) {
        if (nombreProduits < capacite) {
            produits[nombreProduits] = produit;
            nombreProduits++;
            System.out.println("Produit ajouté : " + produit.nom);
        } else {
            System.out.println("Capacité maximale atteinte. Impossible d'ajouter plus de produits.");
        }
    }

    public void ajouterEmploye(Employe employe) {
        if (nombreEmployes < 20) {
            employes[nombreEmployes] = employe;
            nombreEmployes++;
            System.out.println("Employé ajouté : " + employe.nom);
        } else {
            System.out.println("Capacité maximale atteinte. Impossible d'ajouter plus d'employés.");
        }
    }

    public void afficherMagasin() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacité : " + capacite);
        System.out.println("Produits dans le magasin : ");
        for (int i = 0; i < nombreProduits; i++) {
            produits[i].Afficher();
            System.out.println();
        }

        System.out.println("Employés dans le magasin : ");
        for (int i = 0; i < nombreEmployes; i++) {
            employes[i].afficherDetails();
            System.out.println("Salaire: " + employes[i].calculerSalaire());
            System.out.println();
        }
    }
    public int getNombreTotalProduits() {
        return nombreProduits;
    }
    public void afficherNombreEmployesParType() {
        int nombreCaissiers = 0;
        int nombreVendeurs = 0;
        int nombreResponsables = 0;

        // Iterate through the employees array and count each type
        for (int i = 0; i < nombreEmployes; i++) {
            if (employes[i] instanceof Caissier) {
                nombreCaissiers++;
            } else if (employes[i] instanceof Vendeur) {
                nombreVendeurs++;
            } else if (employes[i] instanceof Responsable) {
                nombreResponsables++;
            }
        }

        // Display the counts for each type of employee
        System.out.println("Nombre de caissiers: " + nombreCaissiers);
        System.out.println("Nombre de vendeurs: " + nombreVendeurs);
        System.out.println("Nombre de responsables: " + nombreResponsables);
    }
}
