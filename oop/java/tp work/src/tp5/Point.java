public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean Comparer(Point p) {
        return (p.x == this.x) && (p.y == this.y);
    }
}
