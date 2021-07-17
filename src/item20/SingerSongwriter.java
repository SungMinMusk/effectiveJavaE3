package item20;

public interface SingerSongwriter extends Singer, Songwriter {
    default void eat() {
        System.out.println("꺼억");
    }
}
