package TP4;

public class person {
    // les attributs privés
    private String Nom;
    private String Prenom;
    private int Age;

    public person(String N, String P, int A) {
        Nom = N;
        Prenom = P;
        Age = A;
    }

    // l es méthodes publle
    public void manger() {
        System.out.println("i eat");

    };

    public void marcher() {
        System.out.println("i walk");

    };

    public void dormir() {
        System.out.println("i sleep");
    };

    public void courir() {
        System.out.println("i run");
    };
}