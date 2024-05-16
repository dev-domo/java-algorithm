package mostRecivedGift.domain;

import java.util.List;
import java.util.Objects;

public class Friends {
    private List<Friend> friendList;
    public Friends(List<Friend> friendList) {
        this.friendList = friendList;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Friends)) return false;
        Friends friends = (Friends) object;
        return Objects.equals(friendList, friends.friendList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(friendList);
    }

    public int calculateFriendNumber() {
        return this.friendList.size();
    }
}
