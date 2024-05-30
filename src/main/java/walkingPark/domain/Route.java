package walkingPark.domain;

import java.util.Objects;

public class Route {
    private String direct;
    private int move;

    public Route(String input) {
        this(input.split(" ")[0], Integer.parseInt(input.split(" ")[1]));
    }

    public Route(String direct, int move) {
        this.direct = direct;
        this.move = move;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Route))
            return false;
        Route route = (Route) o;
        return move == route.move && Objects.equals(direct, route.direct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direct, move);
    }
}
