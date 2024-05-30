package walkingPark.domain;

import java.util.Objects;

public class Row {
    private int num;

    public Row(int num) {
        this.num = num;
    }

    public Row update(int move) {
        this.num += move;
        return new Row(this.num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Row))
            return false;
        Row row = (Row) o;
        return num == row.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
