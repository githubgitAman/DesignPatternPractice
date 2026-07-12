package Behavioural.Strategy;

public class PathFinderFactory {
    public static PathFinder getPathFinder(MODE mode) {
        if(mode == MODE.BIKE){
            return new BikePathFinder();
        }
        else if(mode == MODE.CAR){
            return new CarPathFinder();
        }
        else if(mode == MODE.WALK){
            return new WalkPathFinder();
        }
        else{
            return new TrainPathFinder();
        }
    }
}
