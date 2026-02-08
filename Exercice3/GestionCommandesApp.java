package Exercice3;

public class GestionCommandesApp {
    public static void main(String[] args) {
        Client cl = new Client(1, "El Fassi", "Nadia", "nadia@gmail.com");
        Commande cmd1 = new Commande(1001, "15/03/2025", 1200, cl);

        cmd1.afficherCommande();

        cmd1.ajouterMontant(300);

        cmd1.afficherCommande();

        cmd1.getClient().setEmail("new.nadia@email.com");

        cmd1.afficherCommande();
    }
}