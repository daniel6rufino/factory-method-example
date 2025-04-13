package performances;

import musicians.Bassist;
import musicians.Musician;

public class BassistPerformance extends Performance {

    @Override
    public Musician callMusician() {
        return new Bassist();
    }

}
