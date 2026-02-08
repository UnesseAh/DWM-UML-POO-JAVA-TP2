package Exercice2;

public class GestionEmployesApp {
    public static void main(String[] args) {
        Employe e1 = new Employe(101, "Alaoui", "Karim", 7000, "Informatique");
        Employe e2 = new Employe(102, "Idrissi", "Sara", 9500, "Finance");

        e1.afficherEmploye();
        e2.afficherEmploye();

        e1.augmenterSalaire(10);
        e1.changerDepartement("Ressources Humaines");

        System.out.println("e1 est bien paye ? " + e1.estBienPaye());
        System.out.println("e2 est bien paye ? " + e2.estBienPaye());

        e2.setSalaire(-500);

        e1.afficherEmploye();
        e2.afficherEmploye();
    }
}