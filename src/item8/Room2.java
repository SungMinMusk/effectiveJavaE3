package item8;

import java.lang.ref.Cleaner;

public class Room2 implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    // 청소가 필요한 자원. 절대 Room을 참조해서는 안 된다!
    private static class State implements Runnable {
        int numJunks;

        State(int numJunks) {
            this.numJunks = numJunks;
        }

        // close 메서드나 cleaner가 호출한다.
        @Override public void run() {
            System.out.println("방 청소");
            numJunks = 0;
        }
    }

    // 방의 상태 Cleanable과 공유한다.
    private final State state;

    // Cleanable 객체. 수거 대상이 되면 방을 청소한다.
    private final Cleaner.Cleanable cleanable;

    public Room2(int numJunks) {
        state = new State(numJunks);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
