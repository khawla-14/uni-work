package tp7;

public class Principale {
    public static void main(String[] args) {
        Voiture voit = new Voiture();
        Avion av = new Avion();
        Moto m = new Moto();
        StationService ss = new StationService();
        ss.faireLePlein(voit);
        ss.faireLePlein(av);
        ss.faireLePlein(m);
    }
}