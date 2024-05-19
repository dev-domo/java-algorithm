package mostRecivedGift.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class FriendsTest {
    @Test
    void friends_생성() {
        List<Friend> friendList = List.of(new Friend("muzi"));
        Friends friends = new Friends(friendList);
        assertThat(friends).isEqualTo(new Friends(friendList));
    }

    @Test
    void friends_수() {
        List<Friend> friendList = List.of(new Friend("muzi"), new Friend("frodo"));
        Friends friends = new Friends(friendList);
        assertThat(friends.friendNumber()).isEqualTo(2);
    }

    @Test
    void friends_인덱스_관리() {
        Friends friends = new Friends(List.of(new Friend("muzi"), new Friend("frodo")));
        Map<Friend, Integer> friendsIndex = friends.makeIndex();
        assertThat(friendsIndex.size()).isEqualTo(2);
        assertThat(friendsIndex.get(new Friend("muzi"))).isEqualTo(0);
        assertThat(friendsIndex.get(new Friend("frodo"))).isEqualTo(1);
    }
}
