public class Compte {
    private long num;
    private String nomClient;
    private double solde;

    public Compte() {
    }

    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Compte Info : " + num + " | Client: " + nomClient + " | Solde: " + solde + " DH");
    }

    public void retirer(double montant) {
        if (montant > solde) {
            System.out.println("Solde insuffisant pour le retrait de " + montant);
        } else {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectue.");
        }
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println("Depot de " + montant + " effectue.");
    }
}
