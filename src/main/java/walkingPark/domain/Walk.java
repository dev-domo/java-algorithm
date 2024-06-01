package walkingPark.domain;

public class Walk {
    public static Position startWalk(Park park, Routes routes) {
        Position current = park.findStart();
        for (int i = 0; i < routes.countRoutes(); i++) {
            Route route = routes.nextRoute(i);
            current = current.move(park, route);
        }
        return current;
    }
}
