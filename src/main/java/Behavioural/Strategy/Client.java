package Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        GooglePathFinder googlePathFinder = new GooglePathFinder();
        PathFinder pathFinderObject = googlePathFinder.getPathFinder(MODE.CAR);

        System.out.println(pathFinderObject.findPath());
    }
}
