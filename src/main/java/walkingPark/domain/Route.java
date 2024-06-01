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
        Row tmpRow = row;
        Col tmpCol = col;
        for (int i = 0; i < this.move; i++) {
            if (this.direct.equals(EAST)) tmpCol = tmpCol.update(1);
            if (this.direct.equals(WEST)) tmpCol = tmpCol.update(-1);
            if (this.direct.equals(SOUTH)) tmpRow = tmpRow.update(1);
            if (this.direct.equals(NORTH)) tmpRow = tmpRow.update(-1);
            // Work here : 범위 벗어난 경우, 장애물 벗어난 경우
            if (!tmpRow.isInRange(park.getHeight()) || !tmpCol.isInRange(park.getWidth()) || park.isMeetObstruction(tmpRow, tmpCol)) {
                tmpRow = row;
                tmpCol = col;
                System.out.println("ho!");
                break;
            }
        }
        return new Position(tmpRow, tmpCol);
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
