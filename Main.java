package ProSit1.src;

public class Main {
    public static void main(String[] args) {

        // Create a store
        Magasin magasin = new Magasin("001", "Avenue de France", 50);

        // Add products to the store
        Produit produit1 = new Produit(101, "Laptop", "Dell", 1500);
        Produit produit2 = new Produit(102, "Smartphone", "Samsung", 800);
        Produit produit3 = new Produit(103, "Tablet", "Apple", 1200);

        magasin.ajouterProduit(produit1);
        magasin.ajouterProduit(produit2);
        magasin.ajouterProduit(produit3);

        // Add employees to the store
        Employe caissier1 = new Caissier("E001", "Ahmed", "Tunis", 190, 12);
        Employe vendeur1 = new Vendeur("E002", "Sara", "Tunis", 160, 0.8);
        Employe responsable1 = new Responsable("E003", "Hana", "Tunis", 170, 200);

        magasin.ajouterEmploye(caissier1);
        magasin.ajouterEmploye(vendeur1);
        magasin.ajouterEmploye(responsable1);
        magasin.afficherNombreEmployesParType();
        // Display store details (including products and employees)
        magasin.afficherMagasin();

        // Display the total number of products
        System.out.println("Nombre total de produits: " + magasin.getNombreTotalProduits());
    }
}
