package Audio;

import javax.sound.sampled.LineUnavailableException;
import Audio.sound.ToneGenerator;
import Audio.sound.ToneGenerator.Note;

public class IntroNumb {
   public static void main(String[] args) throws LineUnavailableException {
       ToneGenerator tg = new ToneGenerator();
       tg.init();
       tg.play(Note.C4$, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.E4, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.C4$, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.F4$, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.A4, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.G4$, 1200);
       tg.play(Note.REST, 2);
       tg.play(Note.C4$, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.E4, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.C4$, 200);
       tg.play(Note.REST, 2);
       tg.play(Note.A4, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.G4$, 600);
       tg.play(Note.REST, 2);
       tg.play(Note.E4, 1200);
       tg.close();
   }
}