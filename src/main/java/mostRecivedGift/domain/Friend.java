package mostRecivedGift.domain;

import java.util.Objects;

public class Friend {
    private String name;
    public Friend(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Friend)) return false;
        Friend friend = (Friend) object;
        return Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
