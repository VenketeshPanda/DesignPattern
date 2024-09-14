package Strategy;

import static Strategy.TravelMode.*;

public class PathCalcStrategyFactory {
    static PathCalcStrategy findPathCalcStrategyByMode(TravelMode mode){
        PathCalcStrategy p = null;
        if(mode.equals(CAR)){
            p = new CarPathCalcStrategy();
        } else if(mode.equals(BIKE)){
            p = new BikePathCalcStrategy();
        } else if(mode.equals(AUTO)){
            p = new AutoPathCalcStrategy();
        }
        return p;
    }
}
