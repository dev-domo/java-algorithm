package walkingPark.domain;

import java.util.Objects;

public class Col {
    private int limit;
    public Col(int num) {
        this.limit = num;
    }

    public Col update(int move) {
        this.limit += move;
        return new Col(this.limit);
    }

    public boolean isInRange(int width) {
        return this.limit >= 0 && this.limit < width;
    }

    public String findLocation(String parkLine) {
        return String.valueOf(parkLine.charAt(this.limit));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Col))
            return false;
        Col col = (Col) o;
        return limit == col.limit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit);
    }
}
