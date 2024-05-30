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
}
