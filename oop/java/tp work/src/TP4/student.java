package TP4;

public class student extends person {
    // les attributs privés
    private String Ninsc;
    private String Niveau;
    private String Filiere;

    // Premier constructeur
    public student(String N, String P, int A, String Ns) {
        super(N, P, A); // Appel du constructeur de la classe mère Personne
        Ninsc = Ns;

    }

    // Deuxième constructeur
    public student(String N, String P, int A, String Ns, String Niv, String F) {
        this(N, P, A, Ns);
        Niveau = Niv;
        Filiere = F;
    }

    // Appel du premier constructeur
    // les méthodes publiques public
    public void Etudier() {
        System.out.println("i study" + Niveau);
    };

    public void Reviser() {
        System.out.println("i revise");
    };

    public void Passer_Examen() {
        System.out.println("i pass");

    };
}