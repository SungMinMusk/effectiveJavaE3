package test;

import item14.Point;

import java.util.*;
import java.io.*;

import static java.util.Comparator.comparingInt;

class Main {

    public static ArrayList<Point> v = new ArrayList<>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            v.add(new Point(x,y));
        }

        Collections.sort(v);

        v.forEach((x)-> {
            try {
                bw.write(x.x+" "+x.y+"\n");
            } catch (IOException e) { }
        });


        bw.flush();
    }

    public static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int a, int b) {
            this.x = a;
            this.y = b;
        }

        private static final Comparator<Point> COMPARATOR =
                comparingInt((Point p) -> p.x)
                        .thenComparingInt((Point p) -> p.y);

        @Override
        public int compareTo(Point p) {
            return COMPARATOR.compare(this, p);
        }
    }
}
