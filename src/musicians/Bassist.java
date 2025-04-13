package musicians;

public class Bassist implements Musician {
  
    public void play() {
        System.err.println("Play bass");
    }

    public void tune() {
        System.err.println("Tune the bass");
        this.play();
    }
}
