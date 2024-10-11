package ProSit1.src;

public class Produit {
    private int code;
    public String nom;  // Changed from private to public
    private String marque;
    private double prix;

    public Produit() {}

    public Produit(int code, String nom, String marque, double prix) {
        this.code = code;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
    }

    public void Afficher() {
        System.out.print("Code : " + code);
        System.out.print(" / Nom : " + nom);
        System.out.print(" / Marque : " + marque);
        System.out.print(" / Prix : " + prix);
    }
}
