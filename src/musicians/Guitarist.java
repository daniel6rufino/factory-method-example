package musicians;

public class Guitarist implements Musician {
   
    public void play() {
        System.err.println("Play guitar");
    }

    public void tune() {
        System.err.println("Tune the guitar");
        this.play();
    }
}
