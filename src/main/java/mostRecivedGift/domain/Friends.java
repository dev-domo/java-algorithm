package mostRecivedGift.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Friends {
    private List<Friend> friendList;
    public Friends(List<Friend> friendList) {
        this.friendList = friendList;
    }

    public int friendNumber() {
        return this.friendList.size();
    }

    public Map<Friend, Integer> makeIndex() {
        Map<Friend, Integer> friendIndex = new HashMap<>();
        int index = 0;
        for (Friend friend : this.friendList) {
            friendIndex.put(friend, index);
            index++;
        }
        return friendIndex;
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
}
