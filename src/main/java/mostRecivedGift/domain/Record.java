package mostRecivedGift.domain;

import java.util.Objects;

public class GiveAndTake {
    private Friends friends;
    public GiveAndTake(Friends friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof GiveAndTake)) return false;
        GiveAndTake that = (GiveAndTake) object;
        return Objects.equals(friends, that.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friends);
    }

    public int[][] makeRecord(Friends friends) {
        int capacity = friends.calculateFriendNumber();
        return new int[capacity][capacity];
    }
}
