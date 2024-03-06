public class ReferenceThis {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Point q = new Point(1, 2);
        Point r = new Point(10, 20);

        boolean egaux = p.Comparer(q);
        if (egaux)
            System.out.println("p et q sont égaux");
        else
            System.out.println("p et q ne sont pas égaux");

        egaux = p.Comparer(r);
        if (egaux)
            System.out.println("p et r sont égaux");
        else
            System.out.println("p et r ne sont pas égaux ");
    }
}