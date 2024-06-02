package walkingPark.domain;

import java.util.Objects;

public class Move {
    private final int num;
    public Move(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Move))
            return false;
        Move move = (Move) o;
        return num == move.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
