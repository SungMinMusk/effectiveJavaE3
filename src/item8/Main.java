package item8;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(1)) {
            System.out.println("안녕~");
        }

//        Room2 tmp = new Room2(1);
//        System.out.println("아무렴~");
//        tmp.close();


////        try (Room2 myRoom = new Room2(7)) {
////            System.out.println("안녕~");
////        }
////

    }

}
