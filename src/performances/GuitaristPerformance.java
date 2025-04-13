package performances;

import musicians.Guitarist;
import musicians.Musician;

public class GuitaristPerformance extends Performance {

    @Override
    public Musician callMusician() {
        return new Guitarist();
    }

}