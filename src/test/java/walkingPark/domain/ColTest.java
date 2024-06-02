package walkingPark.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ColTest {
    @Test
    void col_생성() {
        assertThat(new Col(1)).isEqualTo(new Col(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:2", "-1:0", "0:1"}, delimiter = ':')
    void col_수정(int move, int result) {
        assertThat(new Col(1).update(move)).isEqualTo(new Col(result));
    }

    @Test
    void col_범위() {
        Col col1 = new Col(3);
        Col col2 = new Col(2);
        Park park = new Park(new String[]{"SOO","OXX"});

        assertThat(col1.isInRange(park.getWidth())).isFalse();
        assertThat(col2.isInRange(park.getWidth())).isTrue();
    }

    @Test
    void 공원_위치_구하기() {
        Col col = new Col(1);
        assertThat(col.findLocation("SOX")).isEqualTo("O");
    }

    @ParameterizedTest
    @CsvSource(value = {"E:2", "W:0", "S:1", "N:1"}, delimiter = ':')
    void 새로운_col(String direct, int move) {
        Col col = new Col(1);
        assertThat(col.getNewCol(direct)).isEqualTo(new Col(move));
    }
}
