package mostRecivedGift.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertThat(friends.calculateFriendNumber()).isEqualTo(2);
    }
}
