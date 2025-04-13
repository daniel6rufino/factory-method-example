import performances.BassistPerformance;
import performances.GuitaristPerformance;
import performances.Performance;

public class App {
    private static Performance performance;
    public static void main(String[] args) throws Exception {
        String in_demand_musician = "Bassist";
        selectMusician(in_demand_musician);
        playPerformance();
    }

    static void selectMusician(String in_demand_musician){
        if (in_demand_musician.equals("Bassist")){
            performance = new BassistPerformance();
        } else {
            performance = new GuitaristPerformance();
        }
    }

    static void playPerformance(){
        performance.musicianSetup();
    }
}
