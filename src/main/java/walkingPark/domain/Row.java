package walkingPark.domain;

import java.util.Objects;

public class Row {
    private int limit;

    public Row(int num) {
        this.limit = num;
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
