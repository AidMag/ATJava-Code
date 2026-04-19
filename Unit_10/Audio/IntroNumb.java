package Audio;

import javax.sound.sampled.LineUnavailableException;
import Audio.sound.ToneGenerator;
import Audio.sound.ToneGenerator.Note;

public class IntroNumb {
   public static void main(String[] args) throws LineUnavailableException {
       ToneGenerator tg = new ToneGenerator();
       tg.init();
       tg.play(Note.C5, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.E5, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.C5, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.F5, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.A5, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.G5, 1200);
       tg.play(Note.C5, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.E5, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.C5, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.A5, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.G5, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.E5, 1200);
       tg.close();
   }
}