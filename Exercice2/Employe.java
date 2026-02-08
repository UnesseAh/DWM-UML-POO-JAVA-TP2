package Exercice2;

public class Employe {
    private int matricule;
    private String nom;
    private String prenom;
    private double salaire;
    private String departement;

    public Employe() {
    }

    public Employe(int matricule, String nom, String prenom, double salaire, String departement) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.setSalaire(salaire);
        this.departement = departement;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void afficherEmploye() {
        System.out.println("Matricule: " + matricule + " | Nom: " + nom + " " + prenom + " | Salaire: " + salaire
                + " | Dept: " + departement);
    }

    public void augmenterSalaire(double pourcentage) {
        if (pourcentage > 0) {
            this.salaire += this.salaire * (pourcentage / 100);
        } else {
            System.out.println("Le pourcentage doit etre positif.");
        }
    }

    public void changerDepartement(String nouveauDepartement) {
        this.departement = nouveauDepartement;
    }

    public boolean estBienPaye() {
        return this.salaire > 8000;
    }
}
