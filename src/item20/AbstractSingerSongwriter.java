package item20;

import java.applet.AudioClip;

public abstract class AbstractSingerSongwriter implements SingerSongwriter {
    @Override
    public AudioClip sing(Song s) {
        return null;
    }

    @Override
    public Song compose(int chartPosition) {
        return null;
    }

    abstract public void absMethod();
}
