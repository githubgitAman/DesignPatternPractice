package Behavioural.Strategy;

public class GooglePathFinder {
    public void refresh(){
        System.out.println("Refreshing Google path finder");
    }
    //Calling factory method
    public PathFinder getPathFinder(MODE mode){
        return PathFinderFactory.getPathFinder(mode);
    }
}
