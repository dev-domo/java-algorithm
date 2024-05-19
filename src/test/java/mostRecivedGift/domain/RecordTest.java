package mostRecivedGift.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordTest {
    public static final Friend muzi = new Friend("muzi");
    public static final Friend frodo = new Friend("frodo");
    public static final Friend ryan = new Friend("ryan");
    public static final Friend neo = new Friend("neo");

    @Test
    void record_생성() {
        Friends friends = new Friends(List.of(muzi, frodo, ryan, neo));
        Record record = new Record(friends.friendNumber());
        assertThat(record).isEqualTo(new Record(friends.friendNumber()));
    }

    @Test
    void 선물_주고받은_기록_증가() {
        Friends friends = new Friends(List.of(muzi, frodo, ryan, neo));
        Record record = new Record(friends.friendNumber());
        record.writeRecord(0, 1);
        int[][] example = new int[friends.friendNumber()][friends.friendNumber()];
        example[0][1] = 1;
        assertThat(record).isEqualTo(new Record(example));
    }

    @Test
    void 가장_많이_받은_선물개수_1() {
        int[][] giveTakeRecord = {
                {0, 2}, {1, 0}
        };
        int[] giftScore = {0, 0};
        Record record = new Record(giveTakeRecord);
        Score score = new Score(giftScore);
        assertThat(record.findMax(score)).isEqualTo(1);
    }

    @Test
    void 가장_많이_받은_선물개수_2() {
        int[][] giveTakeRecord = {
                {0, 1}, {1, 0}
        };
        int[] giftScore = {1, 0};
        Record record = new Record(giveTakeRecord);
        Score score = new Score(giftScore);
        assertThat(record.findMax(score)).isEqualTo(1);
    }
}
