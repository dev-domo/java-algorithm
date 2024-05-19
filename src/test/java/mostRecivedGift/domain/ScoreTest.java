package mostRecivedGift.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreTest {
    @Test
    void 선물지수_배열_생성() {
        int capacity = new Friends(List.of(RecordTest.muzi, RecordTest.frodo)).friendNumber();
        assertThat(new Score(capacity)).isEqualTo(new Score(capacity));
    }

    @Test
    void 선물지수_배열_특정인덱스_증감() {
        Score score = new Score(new Friends(List.of(RecordTest.muzi, RecordTest.frodo)).friendNumber());
        score.add(0);
        score.minus(1);
        int[] example = {1, -1};
        assertThat(score).isEqualTo(new Score(example));
    }

    @Test
    void 더_큰_선물지수() {
        int[] giftScore = {1, 0};
        assertThat(new Score(giftScore).biggerScore(0, 1)).isTrue();
    }
}
