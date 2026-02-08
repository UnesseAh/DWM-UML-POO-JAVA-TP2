package Exercice3;

public class Commande {
    private int numeroCommande;
    private String dateCommande;
    private double montantTotal;
    private Client client;

    public Commande() {
    }

    public Commande(int numeroCommande, String dateCommande, double montantTotal, Client client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.montantTotal = montantTotal;
        this.client = client;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void afficherCommande() {
        System.out
                .println("Commande N: " + numeroCommande + " | Date: " + dateCommande + " | Montant: " + montantTotal);
        if (client != null) {
            client.afficherClient();
        }
    }

    public void ajouterMontant(double montant) {
        if (montant > 0) {
            this.montantTotal += montant;
        } else {
            System.out.println("Erreur: Le montant doit etre positif.");
        }
    }
}
