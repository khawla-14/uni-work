package tp2.constructeurParParams;

public class myclass {
    int abscisse;
    int ordoune;

    // constructeur du class
    public myclass(int x, int y) {
        abscisse = x;
        ordoune = y;
    }

    public void afficher() {
        System.out.println("abscisse" + abscisse + "ordoune" + ordoune);
    }
}
