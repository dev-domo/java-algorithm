package mostRecivedGift.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FriendTest {
    @Test
    void friend_생성() {
        String name = "muzi";
        Friend friend = new Friend(name);
        assertThat(friend).isEqualTo(new Friend(name));
    }
}
