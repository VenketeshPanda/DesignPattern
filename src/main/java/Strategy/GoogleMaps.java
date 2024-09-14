package Strategy;

import static Strategy.TravelMode.*;

public class GoogleMaps {

    void findPathByMode(TravelMode mode){
        PathCalcStrategy pathCalcStrategy = PathCalcStrategyFactory.findPathCalcStrategyByMode(mode);
        pathCalcStrategy.findPath();
    }
}
