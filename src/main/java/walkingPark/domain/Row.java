package walkingPark.domain;

import java.util.Objects;

public class Row {
    private static final String SOUTH = "S";
    private static final String NORTH = "N";
    private int limit;

    public Row(int num) {
        this.limit = num;
    }

    public Row(Row row) {
        this.limit = row.getRow();
    }

    private int getRow() {
        return this.limit;
    }

    public Row update(int move) {
        this.limit += move;
        return new Row(this.limit);
    }

    public boolean isInRange(int height) {
        return this.limit >= 0 && this.limit < height;
    }

    public String getParkLine(String[] park) {
        return park[this.limit];
    }

    public Row getNewRow(Direct direct) {
        if (Objects.equals(direct, new Direct(SOUTH)))
            return update(1);
        if (Objects.equals(direct, new Direct(NORTH)))
            return update(-1);
        return new Row(this.limit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Row))
            return false;
        Row row = (Row) o;
        return limit == row.limit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit);
    }
}
