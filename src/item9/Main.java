package item9;

import java.io.*;

public class Main {
    static String firstLineOfFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KSM\\Desktop\\effectiveJavaE3\\src\\item9\\t.txt"));

        try {
            return br.readLine();
        }
        finally {
            br.close();
        }
    }

    static String firstLineOfFile2() throws IOException {
        String Path = "C:\\Users\\KSM\\Desktop\\effectiveJavaE3\\src\\item9\\t.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(Path))) {
            return br.readLine();
        }
    }

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[100];
                int n;
                while((n = in.read(buf)) >= 0) out.write(buf,0,n);
            }
            finally {
                out.close();
            }
        }
        finally {
            in.close();
        }
    }

    static void copy2(String src, String dst) throws IOException {

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[100];
            int n;
            while ((n = in.read(buf)) >= 0) out.write(buf, 0, n);
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(firstLineOfFile());
        System.out.println(firstLineOfFile2());
    }

}
