package tp6.Point;

public class MembersStatique {
    public class MembresStatiques {
        public static void main(String[] args) {
            Point p = new Point(1, 2);
            Point q = new Point(10, 2);
            Point r = new Point(15, 30);

            p.afficher();
            q.afficher();
            r.afficher();
        }
    }
}
