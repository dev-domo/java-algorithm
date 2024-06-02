package walkingPark.domain;

import java.util.Objects;

public class Route {
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String SOUTH = "S";
    private static final String NORTH = "N";
    private String direct;
    private int move;

    public Route(String input) {
        this(input.split(" ")[0], Integer.parseInt(input.split(" ")[1]));
    }

    public Route(String direct, int move) {
        this.direct = direct;
        this.move = move;
    }

    public Position tryMove(Park park, Row row, Col col) {
        Row beforeRow = new Row(row);
        Col beforeCol = new Col(col);

        for (int i = 0; i < this.move; i++) {
            if (this.direct.equals(EAST)) col = col.update(1);
            if (this.direct.equals(WEST)) col = col.update(-1);
            if (this.direct.equals(SOUTH)) row = row.update(1);
            if (this.direct.equals(NORTH)) row = row.update(-1);
            if (!row.isInRange(park.getHeight()) || !col.isInRange(park.getWidth()) || park.isMeetObstruction(row, col)) {
                row = beforeRow;
                col = beforeCol;
                break;
            }
        }
        return new Position(row, col);
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
