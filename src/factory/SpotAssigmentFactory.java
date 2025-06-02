package factory;

import Strategies.CheapestSpotAssigmentStrategy;
import Strategies.NearestSpotAssigmentStrategy;
import Strategies.SpotAssigmentStrategy;
import enums.SpotAssigmentStrategyType;

public class SpotAssigmentFactory {
    public static SpotAssigmentStrategy getSpotAssigmentStrategy(SpotAssigmentStrategyType strategyType){
        if(strategyType.equals(SpotAssigmentStrategyType.CHEAPEST)){
            return  new CheapestSpotAssigmentStrategy();
        } else if (strategyType.equals(SpotAssigmentStrategyType.NEAREST)) {
            return new NearestSpotAssigmentStrategy();
        }else
            return  null;
    }
}
