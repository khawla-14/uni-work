package tp2.constructeurParParams;

public class Myclass {
    int abscisse;
    int ordoune;

    // constructeur du class
    public Myclass(int x, int y) {
        abscisse = x;
        ordoune = y;
    }

    public void afficher() {
        System.out.println("abscisse" + abscisse + "ordoune" + ordoune);
    }
}
