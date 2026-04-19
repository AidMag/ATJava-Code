package Audio;
import Audio.sound.SoundClip;

public class bounce {
    public static void main(String[] args) {
        SoundClip boing = new SoundClip("media/boing.wav");
        boolean a = true;
    
        boing.open();
        boing.play(a);
        boing.close();
    }
}
