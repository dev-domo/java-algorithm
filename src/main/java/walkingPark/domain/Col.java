package walkingPark.domain;

import java.util.Objects;

public class Col {
    private int num;
    public Col(int num) {
        this.num = num;
    }

    public Col update(int move) {
        this.num += move;
        return new Col(this.num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Col))
            return false;
        Col col = (Col) o;
        return num == col.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
