package walkingPark.domain;

import java.util.Arrays;

public class Routes {
    private Route[] route;
    public Routes(Route[] route) {
        this.route = route;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Routes))
            return false;
        Routes routes = (Routes) o;
        return Arrays.equals(route, routes.route);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(route);
    }

    public int countRoutes() {
        return this.route.length;
    }

    public Route nextRoute(int index) {
        return this.route[index];
    }
}
