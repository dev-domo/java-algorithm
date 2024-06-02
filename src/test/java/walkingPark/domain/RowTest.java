package walkingPark.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RowTest {
    @Test
    void row_생성() {
        assertThat(new Row(1)).isEqualTo(new Row(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:2", "-1:0", "0:1"}, delimiter = ':')
    void col_수정(int move, int result) {
        assertThat(new Row(1).update(move)).isEqualTo(new Row(result));
    }

    @Test
    void row_범위_벗어남() {
        Row row1 = new Row(2);
        Row row2 = new Row(1);
        Park park = new Park(new String[]{"SOO","OXX"});

        assertThat(row1.isInRange(park.getHeight())).isFalse();
        assertThat(row2.isInRange(park.getHeight())).isTrue();
    }

    @Test
    void 공원_한줄_구하기() {
        Row row = new Row(1);
        String[] park = {"SOO","OXX"};
        assertThat(row.getParkLine(park)).isEqualTo("OXX");
    }

    @ParameterizedTest
    @CsvSource(value = {"E:1", "W:1", "S:2", "N:0"}, delimiter = ':')
    void 새로운_row(String direct, int move) {
        Row row = new Row(1);
        assertThat(row.getNewRow(direct)).isEqualTo(new Row(move));
    }
}
