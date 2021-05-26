package item10;

import java.awt.*;
import java.sql.Timestamp;

public class Main {

    public static void ex1() {
        CaseInsenseString cis = new CaseInsenseString("BADA");
        String s = "bada";


        // 대칭성 위배 CaseInsenseString의 equals를 String과도 연동하겠다는 허황된 꿈을 버려라
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
    public static void ex2() {
        ColorPoint p1 = new ColorPoint(1,2, Color.BLUE);
        Point p2 = new Point(1,2);
        ColorPoint p3 = new ColorPoint(1,2, Color.RED);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
    public static void main(String[] args) throws Exception {
        //ex1();
        ex2();

    }
}
