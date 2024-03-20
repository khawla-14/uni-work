package TP4;

public class HeritageSimple {
    // le code java de la classe principale
    public static void main(String[] args) {
        // Création d'un objet Etudiant identifié seulement par son nom, prénom, âge et
        // Num d'inscr
        student El = new student("Hadjaj", "Selma", 21, "5658910");
        // Création d'un objet Etudiant identifié par tous ses attributs
        student E2 = new student("Ghorab", "Anouar", 24, "1233456 ", "1 Doctorat", "Informatique");
    }
}