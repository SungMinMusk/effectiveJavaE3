package item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{

    int numJunks;
    public Room(int numJunks) {
        this.numJunks = numJunks;
    }

    @Override
    public void close() throws Exception {
        this.numJunks = 0;
        System.out.println("방 청소");
    }
}
