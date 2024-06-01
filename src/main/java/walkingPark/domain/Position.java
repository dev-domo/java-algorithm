package walkingPark.domain;

import java.util.Objects;

public class Position {
    private Row row;
    private Col col;

    public Position(int row, int col) {
        this(new Row(row), new Col(col));
    }

    public Position(Row row, Col col) {
        this.row = row;
        this.col = col;
    }

    public Position move(Park park, Route route) {
        return route.tryMove(park, this.row, this.col);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Position))
            return false;
        Position position = (Position) o;
        return Objects.equals(row, position.row) && Objects.equals(col, position.col);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
