package performances;

import musicians.Musician;

public abstract class Performance {
    
    public void musicianSetup() {
        Musician musician = callMusician();
        musician.tune();
    }

    public abstract Musician callMusician();
}
