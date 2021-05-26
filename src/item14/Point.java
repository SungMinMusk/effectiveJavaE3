package item14;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public int compareTo(Point point) {
//        int result = Integer.compare(x, point.x);
//        if (result == 0) {
//            return Integer.compare(y, point.y);
//        }
//        return result;
//    }

    @Override
    public int compareTo(Point p) {
        return COMPARATOR.compare(this, p);
    }

    private static final Comparator<Point> COMPARATOR =
            comparingInt((Point p) -> p.x)
            .thenComparingInt((Point p) -> p.y).reversed();

}
