package tp6.Point;

public class Point {
    private int x;
    private int y;
    private static int nbr_objets = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        nbr_objets++;
    }

    public void afficher() {
        System.out.println("le nombre d'objets créé = " + nbr_objets);
    }
}