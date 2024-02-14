import java.util.Scanner;

public class point {
    int x, y;

    // declaring the x & y
    point() {

        Scanner s = new Scanner(System.in);

        System.out.println("enter the X value...");
        x = s.nextInt();

        System.out.println("enter the Y value...");
        y = s.nextInt();
    }

    // print x & y
    void afficher() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    // method that takes params
    point(int a, int b) {
        x = a;
        y = b;
    }

    // Main class
    public static void main(String[] args) {
        // new object
        point p = new point();

        // afficher ce new oject
        p.afficher();

        // give off the params
        int a = 12;
        int b = 12;

        point t = new point(a, b);
        t.afficher();
    }
    // scanner.close(); 
}
