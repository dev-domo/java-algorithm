package mostRecivedGift.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GiveAndTakeTest {
    private static final Friend muzi = new Friend("muzi");
    private static final Friend frodo = new Friend("frodo");
    private static final Friend ryan = new Friend("ryan");
    private static final Friend neo = new Friend("neo");

    @Test
    void giveAndTake_생성() {
        Friends friends = new Friends(List.of(muzi, frodo, ryan, neo));
        GiveAndTake giveAndTake = new GiveAndTake(friends);

        assertThat(giveAndTake).isEqualTo(new GiveAndTake(friends));
    }

    @Test
    void 선물_주고받은_기록테이블_생성() {
        Friends friends = new Friends(List.of(muzi, frodo, ryan, neo));
        GiveAndTake giveAndTake = new GiveAndTake(friends);
        int[][] giveAndTakeRecord = giveAndTake.makeRecord(friends);
        assertThat(giveAndTakeRecord.length).isEqualTo(4);
        assertThat(giveAndTakeRecord[0].length).isEqualTo(4);
    }
}
